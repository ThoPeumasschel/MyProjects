from sys import argv

script, user_name = argv
prompt = '==> '

user_name = raw_i:wqnput("Wie heißt du denn? ") 
print "\nHallo %s, ich bin das %r-script." % (user_name, script)
print "Ich würde dir gerne ein paar Fragen stellen."
print "Magst du mich %s?" % user_name
likes = raw_input(prompt)

print "Wo wohnst du denn, %s?" % user_name
lives = raw_input(prompt)

print "Was für einen Computer hast du?"
computer = raw_input(prompt)

print """
Alles klar, auf die Frage, ob du mich magst, hast du %r gesagt.
Du wohnst in %r. Wo soll das denn bitte sein?. 
Und du hast (einen) %r-Computer. Das ist wirklich Cool.
""" % (likes, lives, computer)
