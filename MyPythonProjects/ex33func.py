# -*- coding: utf-8 -*-

numbers = []

def Schleife(x, y, z):
	while z < x:
		print "am Beginn der Schleife ist deine Zahl %d" % z
		numbers.append(z)

		z += y
		print "Die aktuelle Zahl: ", numbers
		print "am Ende der Schleife ist deine Zahl %d\n" % z
	
	
	print "The numbers: "

#Iteriert in 'num' alle Zahlen durch, mit '0' beginnend. 
	for num in numbers:
		print num

# Variablen für User-Input: x, y, z. 

print "\n\nHier wirst du sehen, wie eine while-Schleife arbeitet:\n"
print "Wie oft soll die Schleife laufen? Gib eine Zahl ein."
x = int(raw_input())
print "Welchen Abstand soll ich wählen?"
y = int(raw_input())
print "Gib jetzt die Zahl ein, mit der ich beginnen soll."
z = int(raw_input())

print "\n\n\tAlso, los geht's: \n"

Schleife (x, y, z)


