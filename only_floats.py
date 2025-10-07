first_input = float(input("Enter first number: "))
second_input = float(input("Enter second number: "))
def only_floats(first_input,second_input):
	if first_input % 1 == 0 and second_input % 1 == 0:
		return 0
	elif first_input % 1 != 0 and second_input % 1 != 0:
		return 2
	elif first_input % 1 != 0 and second_input % 1 == 0:
		return 1
	elif first_input % 1 == 0 and second_input % 1 != 0:
		return 1
print(only_floats(first_input,second_input))
