# -*- coding: utf-8 -*-

name = raw_input("Wie ist dein Vorname? ")
age = raw_input("Wie alt bist du? ")
height = raw_input("Wie groß bist du? ")
weight = raw_input("Wieviel wiegst du? ")

print "Hallo %r, du bist also %r Jahre alt, %r groß und %r kg schwer. \nDanke für die Information, %r!" % (name, age, height, weight, name)
