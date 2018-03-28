i = 0
numbers = []

while i < 6:
    print("At the top i is %d" % i)
    numbers.append(i)

    i += 1
    print("numbers now: ", numbers)
    print(f"At the bottom i is {i}")
	
	
print("The numbers: ")

for num in numbers:
	print (num)
