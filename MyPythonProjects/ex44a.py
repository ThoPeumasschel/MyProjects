class Parent(object):

	def implicit(self):
		print "Parent implicit()"
                print "Ich bin der Papa."


class Child(Parent):
        print "\nIch bin das Kind und kann Mathe: "
        print "2,3456 * 5,4321 = %d" % (2.3456*5.4321)

dad = Parent()
son = Child()

dad()

#dad.implicit()
#son.implicit()
