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
