# -*- coding: utf-8 -*-

numbers = []

def Schleife(x, y, z):
    # Sagt wie oft die Schleife laufen soll, also 'x'. 
# 'i' sollte eigentlich mit '0' beginnen, und dann immer um '1' anwachsen. 
    for i in range(x):  

        # Nennt die Zahl, mit der gearbeitet wird, also 'z'. 
        print("am Beginn der Schleife ist deine Zahl {z}")
        numbers.append(z)

# Erhöht die Zahl 'x' um den Wert 'y', den der User festlegen kann. 
        z += y		

# Gibt nochmal den Eingangswert aus. 
        print("Die aktuelle Zahl: ", numbers)
        print(f"am Ende der Schleife ist deine Zahl {z}\n")


print("The numbers: ")
for num in numbers:
    print(num)

# Variablen für User-Input: x, y, z. 

print("\n\nHier wurde eine while-Schleife in eine for-Schleife umgewandelt:\n")

print("Wie oft soll die Schleife laufen? Gib eine Zahl ein.")
x = int(input())

print("Welchen Abstand soll ich wählen?")
y = int(input())

print("Gib jetzt die Zahl ein, mit der ich beginnen soll.")
z = int(input())

print("\n\n\tAlso, los geht's: \n")

Schleife (x, y, z)


