largest_integer = 0
lowest_integer = 1
for count in range(10):
	integer = int(input("Input a number: "))
	if integer > largest_integer:
		largest_integer = integer
	if integer < lowest_integer:
		lowest_integer = integer

print(largest_integer)
print(lowest_integer)