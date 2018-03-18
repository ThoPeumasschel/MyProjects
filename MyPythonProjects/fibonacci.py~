# -*- encoding=utf-8 -*-

# A little fibonacci script right here!

#print "\nWell, let's print all the fibonacci-Numbers from 1 - 1000!\n"
#print "\nWell, let's print the first 20 fibonacci-Numbers!\n"
print "\nNow, how about printing some fibonacci numbers?"
print "How many numbers shall I display?\n"
#print "Press enter when ready...\n"
prompt = '> '
#start = raw_input(prompt)
n = abs(int(raw_input(prompt)))
print "\nWell, here u go:\n"

# Now I make it all inside a fuction...

#def fibo(n):
	# Initializing variable a with 0, b with 1
#	a, b = 0, 1
	# This is actually the same as a = 0, b = 1
	# Now comes the loop:
#	while b < n:
	# The trailing comma after the argument 
	# avoids the newline after the output.
#		print b, 
	# The following is more tricky than I anticipated: 
	# The right side is evaluated before assigning to the left.

	# a, b = b, a+b 
	# It is suposed to be equivalent to:
#	c = a + b
#	a = b 
#	b = c
	
	# The loop tests the new 'b' value and, if True, prints it.
		
def fibo(n):
	vorgaenger, nachfolger = 0, 1
	for i in range(0, n):
		print nachfolger,
		# c = Platzhalter für Summe aktuelle Zahl + alte Zahl
		# in a wird die aktuelle Zahl als nächste alte Zahl gespeichert
		# an b wird jetzt die neue Zahl übergeben, die in c zwischengelagert war.
		#c = a + b
		#a = b 
		#b = c
		zwischenspeicherNaechsteZahl = vorgaenger + nachfolger
		vorgaenger = nachfolger
		nachfolger = zwischenspeicherNaechsteZahl



#	a, b = b, a+b

fibo(n)

print "\n"






