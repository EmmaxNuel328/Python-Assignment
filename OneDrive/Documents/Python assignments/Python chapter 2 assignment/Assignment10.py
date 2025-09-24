
number1 = int(input('Enter First number'))
number2 = int(input('Enter Second number'))
number3 = int(input('Enter Third number'))
total = int((number1 + number2 + number3)/3)

print('Sum', '=', (number1 + number2 + number3))
print('Product', '=', (number1 * number2 * number3))
print('Average', '=', (total))
smallest = number1
if number2 < number1:
	print('number2 = smallest')
if number3 < number1:
	print('number3 = smallest')
if number3 > number1 and number2 > number1:
	print('number1 = smallest')




