# This little game I stole from Sololearn
# and tried to translate it to Python 2.7
#
#



# This is the super-class from which the Goblin class inherits. 
class GameObject:
    class_name = ""
    desc = "" 
    objects = {} # creates a dictionary in the class "GameObject" (superclass)

    def __init__(self, name):
	    self.name = name
	    GameObject.objects[self.class_name] = self
        # with "GameObject.objects" you have access to this dictionary belonging to that class.
        # In the bginning it is empty: {}.
        # If you want to put a value to the dictionary "objects" you write:
        # GameObject.objects["elf"] = elf 
        # "elf is the key (to access to the value)
        # elf is the value (an object)
        #
        # to do this in a generic way (for every instance you will create later), 
        # there is that line: 
        # GameObject.objects[self.class_name] = self
        # 'self.class_name' is the key, 'self' is the name of the instance you create (goblin in the code)
        # class_name is the string "goblin" creates when the instance is created
        # The instance is: goblin = Goblin("Gobbly")
        #



    def get_desc(self):
        # class GameObject has-a function called get_desc that takes self as parameter. 
        # 
	    return self.class_name + "\n" + self.desc

class Goblin(GameObject):
    def __init__(self, name):
	self.class_name = "goblin"
	self.health = 3
	self._desc = "A foul creature"
#		Well, here lies the dog burried! 
#		The following should work but doesn't!
#		super(Goblin, GameObject).__init__(name)
#	    The following would be old-style class:		
	GameObject.__init__(self, name)

# class property([fget[, fset[, fdel[, doc]]]])
#   Return a property attribute for new-style classes (classes that derive from object).
#   fget is a function for getting attribute value, fset setting..., fdel deleting..., doc creates docstring.   
#   
#   A typical use is to define a managed attribute x:
#    class C(object):
#        def __init__(self):
#            self._x = None
#
#        def getx(self):
#            return self._x
#
#        def setx(self, value):
#            self._x = value
#
#        def delx(self):
#            del self._x
#
#       x = property(getx, setx, delx, "I'm the 'x' property.")
#
#   If c is an instance of C, c.x will invoke the getter, 
#   c.x = value will invoke the setter and del c.x the deleter.   
#   
    @property
    def desc(self):
	    if self.health >= 3:
	        return self._desc
	    elif self.health == 2:
	        health_line = "It has a wound on his knee."
	    elif self.health == 1:
	        health_line = "Its left arm has been cut off!"
	    elif self.health <= 0:
	        health_line = "It is dead."
	    return self._desc + "\n" + health_line
#   The @property decorator turns the 'desc' method into a 'getter' for a read-only attribute i
#   with the same name, and sets the docstring for 'desc' to health.  
# 

    @desc.setter
    def desc(self, value):
	    self._desc = value



goblin = Goblin("Gobbly")


def hit(noun):
	if noun in GameObject.objects:
		thing = GameObject.objects[noun]
		if type(thing) == Goblin:
			thing.health = thing.health - 1
			if thing.health <= 0:
				msg = "You killed the goblin!"
			else:
				msg = "You hit the {}".format(thing.class_name)
	else:
			msg = "There is no {} here.".format(noun)
#	Hier liegt das erste Problem
	return msg


def examine(noun):
	if noun in GameObject.objects:
		return GameObject.objects[noun].get_desc()
	else:
		return "There is no {} here.".format(noun)


def get_input():
	command = raw_input("> ").split()
	verb_word = command[0]
	if verb_word in verb_dict:
		verb = verb_dict[verb_word]
	else:
		print("Unknown verb {}".format(verb_word))
		return


	if len(command) >= 2:
		noun_word = command[1]
#	Hier liegt das zweite Problem
		print (verb(noun_word))
	else:
		print(verb("nothing"))

def say(noun):
	return 'You said "{}"'.format(noun)

verb_dict ={"say": say, "examine": examine, "hit": hit, }

while True:
#	Hier liegt das dritte Problem
	get_input() 





	


