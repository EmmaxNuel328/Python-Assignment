prompt = float(input("Enter a number: "))
def square_root(number1):
	if prompt % 5 == 0:
		return prompt ** 0.5
	if prompt % 5 != 0:
		return prompt/5
print(square_root(prompt))
