# first variable initialized
types_of_people = 10
# Here comes a special type of string, the 'f-string'. 
# the x-variable is now set equal to the f-string. 
x = f"There are {types_of_people} types of people."
# again some variables...
binary = "binary"
do_not = "don't"
# here we got the second f-string. 
y= f"Those who know {binary} and those who {do_not}."
# now we start printing. 
print(x)
print(y)

print(f"I said: {x}")
print(f"I also said: '{y}'")

hilarious = True
joke_evaluation = "Isn't that joke so funny?! {}"

print(joke_evaluation.format(hilarious))

w = "This is the left side of..."
e = "a string with a right side."

print(w + e)


