formatter = "{} {} {} {}"

print(formatter.format(1, 2, 3, 4))
print(formatter.format("one", "two", "three", "four"))
print(formatter.format(True, False, False, True))
print(formatter.format(formatter, formatter, formatter, formatter))
print(formatter.format(
    "\nTry your", 
    "\nOwn text here", 
    "\nMaybe a poem", 
    "\nOr a song about fear\n"))

print(formatter.format('+', '-', '/', '*'))

