integer = int(input('Enter an integer: '))
factor = 1
number = integer
while number > 0:
	factor = factor* number
	number -= 1	
print(factor)