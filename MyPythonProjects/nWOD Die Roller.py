#!/usr/bin/python
# -*- coding: utf-8 -*-
## requires Python 3.6 or later

## nWOD Die Roller.
## A free tool intended for the new "World of Darkness" storytelling
## systems (by White Wolf).
## Version 2.1, December 2017.
## Copyright 2012-2017, Oliver Paulick (Germany)
##
## This program is free software; you can redistribute it and/or
## modify it under the terms of the GNU General Public License
## as published by the Free Software Foundation; either version 3 of
## the License, or (at your option) any later version.
##
## This program is distributed in the hope that it will be useful,
## but WITHOUT ANY WARRANTY; without even the implied warranty
## of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
## See the GNU General Public License for more details.
##
## You should have received a copy of the GNU General Public License
## along with this program; if not, see <http://www.gnu.org/licenses/>.


from tkinter import *
import textwrap
import tkinter.messagebox
import random
import time


class Application(Frame):

    def __init__(self, parent):
        Frame.__init__(self)
        self.parent = parent
        self.parent.title("Die Roller | New World of Darkness")
        self.pack(ipadx=5, ipady=5)
        #set some constants; they could later be made customizable in a settings menu
        self.COLOR_NORMAL   = "black"
        self.COLOR_GLITCH   = "orange"
        self.COLOR_FAILURE  = "orange"
        self.COLOR_CRITICAL = "red"
        self.COLOR_LOG      = "black"
        self.MODES          = ["normal", "9-again", "8-again", "rote quality"] # plus a "hidden" chance mode
        self.DEFAULT_MODE   = self.MODES[0] #="normal"
        #finally, create the GUI
        self.createGUI()


    def resetExtendedRoll(self):
        """
        Resets the counter variables for extended rolls; called
        whenever an extended roll starts or ended.
        """
        self.NrOfRolls = 0
        self.hits = 0
        if not self.extendedRoll.get():
            self.customNumberDice.set("")
            self.diceModeSel.set(self.DEFAULT_MODE)
            print("Resetting after extended roll.")
        else:
            print("Starting extended roll:")


    def toggleExtendedRoll(self, *ignore):
        if self.extendedRoll.get():
            self.extendedRoll.set(0)
        else:
            self.extendedRoll.set(1)
        self.resetExtendedRoll()


    def rollOne(self, mode, glitchRule):
        """
        Computes a single rolled die. Returns an integer,
        corresponding to 0 or more hits, and a Boolean marker
        that is True if the roll's result was glitch-relevant.
        Outputs the result to the console log.
        """
        _hits = 0
        _firstRoll = True
        _glitch = False
        _log = ''
        while True:
            _roll = random.randint(1, 10)
            _log = f"{_log} -> {_roll}"
            if _roll == 1 and _firstRoll and mode != 'rote quality': #only natural 1's are relevant for glitches
                _glitch = True
                if mode == 'chance':
                    _log = f"{_log}!"
                elif glitchRule:
                    _log = f"{_log}?"
            elif (_roll >= 8 and mode != 'chance') or (_roll == 10):
                _hits += 1 #add up the hits for exploding dice
                _log = f"{_log}#" #the '#' marks successes
            #check whether we need to re-roll or break
            if (_roll == 10 and mode in ['normal', 'rote quality', 'chance']) \
            or (_roll >= 9 and mode == '9-again') \
            or (_roll >= 8 and mode == '8-again') \
            or (_roll <  8 and mode == 'rote quality' and _firstRoll):
                _firstRoll = False
                continue #repeat the roll
            else:
                break                
        print(_log)
        return (_hits, _glitch)


    def rollSeveral(self, amount, mode, glitchRule):
        """
        Computes a single roll of a set of dice. Returns a tuple
        containing the number of hits and a boolean glitch marker.
        Does not handle chance rolls.
        """
        if amount <= 0:
            raise ValueError("Invalid amount of dice.")
        if mode == "chance":
            raise TypeError("Function rollSeveral() doesn't handle chance die rolls.")
        _glitchCount = 0
        _hits = 0
        for _i in range(amount):
            _singleDieHits, _singleDieGlitch = self.rollOne(mode, glitchRule)
            _hits += _singleDieHits #add hit(s) from individual die to roll total
            if _singleDieGlitch:
                _glitchCount += 1 #count 1's for glitch checking
        if glitchRule and _glitchCount >= amount / 2:
            _glitch = True
        else:
            _glitch = False
        return (_hits, _glitch)


    def rollDice(self, amount):
        self.resultArea["fg"] = self.COLOR_NORMAL #prepare standard color for roll result display
        print('') #start a new roll log in the console
        mode = self.diceModeSel.get()
        glitchRule = self.glitchRuleSel.get()
        if amount < 0: #submitting a custom number passes a -1; the actual value then has to be retrieved
            try:
                amount = int(self.customNumberDice.get())
            except:
                self.resultArea["fg"] = self.COLOR_CRITICAL
                self.rollResult.set("Invalid or missing amount of dice to roll!")
                print("Invalid or missing amount of dice to roll!")
                self.customNumberDice.set("")
                return
        #insert a 200 millisecond pause while the result area is emptied to reflect the new roll
        self.rollResult.set("Rolling...")
        self.rollLog.set("")
        self.update_idletasks() #update all fields before sleeping
        time.sleep(0.2)
        #prepare roll log and console log:
        self.logArea["fg"] = self.COLOR_NORMAL
        if amount > 1:
            print(f"Rolling {amount} dice in {mode} mode:")
            self.rollLog.set(f"(Rolled {amount} dice in {mode} mode)")
        elif amount == 1:
            print(f"Rolling one die in {mode} mode:")
            self.rollLog.set(f"(Rolled one die in {mode} mode)")
        else: #if amount == 0
            if self.extendedRoll.get():
                self.toggleExtendedRoll()
                print("Clearing the extended roll checkbox; a chance die can never be used in an extended roll.")
            print("Rolling a chance die (Good luck, brave one!):")
            self.rollLog.set("(Rolled a chance die)")
        
        #make the actual dice roll and get results
        if amount > 0:
            currentHits, glitch = self.rollSeveral(amount, mode, glitchRule)
        else: #if amount == 0; handle chance die
            mode = 'chance'
            currentHits, glitch = self.rollOne(mode, glitchRule)
        #display results for simple (single-throw) rolls
        if not self.extendedRoll.get():
            if currentHits > 1 and not glitch:
                _log = f"{currentHits} hits"
            elif currentHits == 1 and not glitch:
                _log = "One hit"
            elif currentHits > 1 and glitch:
                _log = f"{currentHits} hits, but a glitch"
                self.resultArea["fg"] = self.COLOR_GLITCH
            elif currentHits == 1 and glitch:
                _log = "One hit, but a glitch"
                self.resultArea["fg"] = self.COLOR_GLITCH
            elif currentHits == 0 and not glitch:
                _log = "Failure"
                self.resultArea["fg"] = self.COLOR_FAILURE
            elif currentHits == 0 and glitch:
                _log = "Critical Failure!"
                self.resultArea["fg"] = self.COLOR_CRITICAL
            self.rollResult.set(_log)
            print(_log)
            #reset dice mode and custom number field
            self.customNumberDice.set("")
            self.diceModeSel.set(self.DEFAULT_MODE)
            return
        
        #display results for extended rolls
        else:
            self.hits += currentHits #add current hits to a running total
            self.NrOfRolls += 1 #counts the running total of individual rolls
            if currentHits > 0 and glitch:
                penalty = random.randint(1, 5)
                self.hits -= penalty
                if self.hits <= 0:
                    self.resultArea["fg"] = self.COLOR_FAILURE
                    self.rollResult.set("Extended roll failed\ndue to glitch penalty")
                    print(f"Extended roll failed due to glitch penalty (-{penalty}) in roll #{self.NrOfRolls}.")
                    self.toggleExtendedRoll() #the roll is ended because it has terminally failed
                elif self.hits > 1:
                    self.resultArea["fg"] = self.COLOR_GLITCH
                    self.rollResult.set(f"{self.hits} hits remain after a glitch\n(extended roll #{self.NrOfRolls}, penalty was -{penalty})")
                    print(f"{self.hits} hits remain after a glitch in extended roll #{self.NrOfRolls}, penalty was -{penalty}")
                else: #if self.hits == 1
                    self.resultArea["fg"] = self.COLOR_GLITCH
                    self.rollResult.set(f"One hit remains after a glitch\n(extended roll #{self.NrOfRolls}, penalty was -{penalty})")
                    print(f"One hit remains after a glitch in extended roll #{self.NrOfRolls}, penalty was -{penalty}")
            elif currentHits <= 0 and glitch:
                self.resultArea["fg"] = self.COLOR_CRITICAL
                self.rollResult.set("Extended roll failed\ndue to critical glitch!")
                print(f"Extended roll failed due to critical glitch in roll #{self.NrOfRolls}!")
                self.toggleExtendedRoll() #the roll is ended because it has terminally failed
            elif self.hits == 1:
                self.rollResult.set(f"One total hit ({currentHits} new)\n(after roll #{self.NrOfRolls})")
                print(f"One total hit ({currentHits} new) after roll #{self.NrOfRolls}")
            elif self.hits > 1 or self.hits == 0:
                if self.hits == 0:
                    self.resultArea["fg"] = self.COLOR_FAILURE
                self.rollResult.set(f"{self.hits} total hits ({currentHits} new)\n(after roll #{self.NrOfRolls})")
                print(f"{self.hits} total hits ({currentHits} new) after roll #{self.NrOfRolls}")
            return


    def createGUI(self):

        #give the main program window a menu bar to exit the application or get help
        toplevel = self.winfo_toplevel()
        self.menubar = Menu(toplevel, tearoff=0)
        self.menubar.add_command(label="Exit", command=root.destroy)
        self.settingsMenu = Menu(self.menubar, tearoff=0)
        self.glitchRuleSel = BooleanVar()
        self.glitchRuleSel.set(0)
        def glitchSettingMessage(*args):
            if self.glitchRuleSel.get():
                print("Glitch rule will now be applied to all rolls.")
            else:
                print("Glitch rule has been disabled.")
        self.glitchRuleSel.trace('w', glitchSettingMessage) # 'w' means that the trace handler is called whenever the variable is updated (written)
        self.settingsMenu.add_checkbutton(label="Use glitch rule", variable=self.glitchRuleSel)
        self.menubar.add_cascade(label="Settings", menu=self.settingsMenu)
        self.menubar.add_command(label="Usage", command=self.showUsage)
        self.menubar.add_command(label="Info", command=self.showInfo)
        toplevel["menu"] = self.menubar

        #create the die roller in the upper window area
        self.rollResult = StringVar()
        self.rollResult.set("")
        self.rollLog = StringVar()
        self.rollLog.set("")
        self.extendedRoll = BooleanVar()
        self.extendedRoll.set(0)
        self.diceModeSel = StringVar()
        self.diceModeSel.set(self.DEFAULT_MODE)
        self.customNumberDice = StringVar()
        self.customNumberDice.set("")

        diceframe = Frame(self)
        diceframe.pack(side=TOP)
        dice1 = Frame(diceframe)
        dice1.pack(side=TOP, fill=X, expand=TRUE, ipady=3)
        dice2 = Frame(diceframe)
        dice2.pack(side=TOP, fill=X, expand=TRUE, ipady=2)
        dice3 = Frame(diceframe)
        dice3.pack(side=TOP, fill=X, expand=TRUE, ipady=3)

        dice11 = Label(dice1, font="FreeSerif 12", text="Roll")
        dice11.pack(side=LEFT, ipadx=3)
        dice12 = Checkbutton(dice1, font="FreeSerif 10", text="Extended roll", variable=self.extendedRoll, command=self.resetExtendedRoll)
        dice12.pack(side=LEFT, fill=X, expand=TRUE, ipadx=3)
        self.ExtendedRollBox = dice12 #create alias for easier reference
        dice13 = Button(dice1, font="FreeSerif 10", text="Chance die", command=lambda amount=0 : self.rollDice(amount), takefocus=0)
        dice13.pack(side=RIGHT, ipadx=3)
        self.ChanceDieButton = dice13

        dice21 = Frame(dice2)
        dice21.pack(side=LEFT, ipadx=3)
        for x in range(1, 6):
            Button(dice21, width=2, text=str(x), command=lambda amount=x : self.rollDice(amount), takefocus=0).pack(side=LEFT, padx=1)
        dice22 = Frame(dice2)
        dice22.pack(side=LEFT, ipadx=3)
        for x in range(6, 11):
            Button(dice22, width=2, text=str(x), command=lambda amount=x : self.rollDice(amount), takefocus=0).pack(side=LEFT, padx=1)
        dice23 = Frame(dice2)
        dice23.pack(side=LEFT, ipadx=3)
        for x in range(11, 16):
            Button(dice23, width=2, text=str(x), command=lambda amount=x : self.rollDice(amount), takefocus=0).pack(side=LEFT, padx=1)
        # dice24 = Frame(dice2)
        # dice24.pack(side=LEFT, ipadx=3)
        # for x in range(16, 21):
            # Button(dice24, width=2, text=str(x), command=lambda amount=x : self.rollDice(amount), takefocus=0).pack(side=LEFT, padx=1)
        dice25 = Entry(dice2, font="FreeSerif 10", exportselection=0, width=3, justify=CENTER, bd=2, textvariable=self.customNumberDice)
        dice25.pack(side=LEFT, ipadx=3)
        dice25.bind("<Return>", lambda event=None, amount=-1 : self.rollDice(amount))
        dice26 = Label(dice2, font="FreeSerif 12", text="dice: ")
        dice26.pack(side=LEFT, ipadx=3)

        dice31 = Frame(dice3)
        dice31.pack(side=LEFT, fill=BOTH, expand=TRUE)
        dice311 = Label(dice31, font="FreeSerif 16", textvariable=self.rollResult)
        dice311.pack(side=TOP, ipadx=3, fill=BOTH, expand=TRUE)
        self.resultArea = dice311 #create an alias for reference in above code
        dice312 = Label(dice31, font="FreeSerif 9", textvariable=self.rollLog)
        dice312.pack(side=BOTTOM, ipadx=2, fill=BOTH, expand=TRUE)
        self.logArea = dice312 #create an alias for reference in above code
        dice32 = Frame(dice3, bd=2, relief=GROOVE)
        dice32.pack(side=RIGHT, ipadx=3)
        for x in self.MODES:
            Radiobutton(dice32, width=12, variable=self.diceModeSel, value=x, font="FreeSerif 10", text=x, anchor=W, bd=2).pack(side=TOP)

        #Create key bindings as shortcuts, e.g. 3 dice are rolled when the user presses "CTRL+3" on the keyboard.
        self.bind_all("<Control-Key-1>", lambda event=None, amount=1 : self.rollDice(amount))
        self.bind_all("<Control-Key-2>", lambda event=None, amount=2 : self.rollDice(amount))
        self.bind_all("<Control-Key-3>", lambda event=None, amount=3 : self.rollDice(amount))
        self.bind_all("<Control-Key-4>", lambda event=None, amount=4 : self.rollDice(amount))
        self.bind_all("<Control-Key-5>", lambda event=None, amount=5 : self.rollDice(amount))
        self.bind_all("<Control-Key-6>", lambda event=None, amount=6 : self.rollDice(amount))
        self.bind_all("<Control-Key-7>", lambda event=None, amount=7 : self.rollDice(amount))
        self.bind_all("<Control-Key-8>", lambda event=None, amount=8 : self.rollDice(amount))
        self.bind_all("<Control-Key-9>", lambda event=None, amount=9 : self.rollDice(amount))
        self.bind_all("<Control-Key-0>", lambda event=None, amount=10: self.rollDice(amount))
        self.bind_all("<Control-Key-x>", self.toggleExtendedRoll)
        self.bind_all("<Control-Key-q>", lambda event=None : root.destroy())


    def showUsage(self):
        tkinter.messagebox.showinfo("How to use the SR4 Die Roller",
            textwrap.dedent("""\
            1) Determine the number of dice you are entitled to roll.
            2) Check whether your roll is subject to special rules.
               If so, check the appropriate box.
            3) If your roll is an extended roll, check the appropriate
               box before rolling to add up hits. Note that you can
               change the mode or choose different amounts of dice
               during an extended roll.
               When your extended roll is finished, uncheck the box.
               Your hits and the mode will be reset.
            4) Click the button associated with the number of dice you
               wish to roll. If you need to roll more than 15 dice,
               enter the number into the empty field and hit <Enter>.
               Alternatively, you can hold <Control> and press a number
               key (1-0) for simple rolls, e.g. <Control>+<3> will roll
               three dice with the options that are currently selected.
            5) Look in the area below the buttons for your result. Easy.
            
            You can toggle extended rolls using <Control>+<X>, and
                quit the program with Control+Q.
            
            Note: Should you wish more detailed info on the individual
                rolls, refer to the log shown in the console.
            """))


    def showInfo(self):
        tkinter.messagebox.showinfo("Info about nWOD Die Roller",
            textwrap.dedent("""\
            nWOD Die Roller.
            Version 2.1 as of December 2017.
            A free tool intended for the new "World of Darkness"
            storytelling systems (by White Wolf, Inc.).
            Created 2012-2017 by Oliver Paulick in Python/Tk.
            
            This program is free software: you can redistribute it
            and/or modify it under the terms of the GNU General Public
            License as published by the Free Software Foundation,
            either version 3 of the License, or (at your option) any
            later version. You should have received a copy of the
            GNU General Public License along with this program.
            If not, see <http://www.gnu.org/licenses/>.
            This program is distributed in the hope that it will be
            useful, but WITHOUT ANY WARRANTY; without even the
            implied warranty of MERCHANTABILITY or FITNESS FOR
            A PARTICULAR PURPOSE.  See the GNU General Public License
            for more details.
            
            Feedback? Contact me at <alvenhar@yahoo.de>.
            Have fun playing!
            """))


root = Tk()
app = Application(root)
app.mainloop()
