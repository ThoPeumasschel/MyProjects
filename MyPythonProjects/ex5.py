<<<<<<< HEAD
# -- coding: utf-8 -- 

my_name = 'Thomas Peuschel'
my_age = 37 # indeed it is!
my_height = 186 # cm
my_weight = 86 # kg
my_eyes = 'Brown'
my_teeth = 'White'
my_hair = 'Brown'

print(f"Let's talk about {my_name}.") 
print(f"He's {my_height} cm tall.") 
print(f"He's {my_weight} kg heavy.") 
print("Actually that's not too heavy.")
print(f"He's got {my_eyes} eyes and {my_hair} hair.") 
print(f"His teeth are usually {my_teeth} depending on the coffee.")  

# this line is tricky, try to get it exactly right
total = my_age + my_height + my_weight
print(f"If I add {my_age}, {my_height}, and {my_weight} I get {total}.")
=======
# -- coding: utf-8 -- 

my_name = 'Thomas Peuschel'
my_age = 37 # indeed it is!
my_height = 186 # cm
my_weight = 86 # kg
my_eyes = 'Brown'
my_teeth = 'White'
my_hair = 'Brown'

print "Let's talk about %s." % my_name
print "He's %d cm tall." % my_height
print "He's %d kg heavy." % my_weight
print "Actually that's not too heavy."
print "He's got %s eyes and %s hair." % (my_eyes, my_hair)
print "His teeth are usually %s depending on the coffee." % my_teeth

# this line is tricky, try to get it exactly right
print "If I add %d, %d, and %d I get %d." % (my_age, my_height, my_weight, my_age + my_height + my_weight)
>>>>>>> 35739b0dc1a4b34fc81080e3aa65fcf3f3cbaeae
