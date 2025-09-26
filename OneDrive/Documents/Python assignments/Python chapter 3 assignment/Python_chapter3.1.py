 # Prompt the user to enter the first integer
 # Input the first integer
 # Prompt the user to enter the second integer
 # Input the second integer
 # Add first integer and second integer, store their sum
 # Display the numbers and their sum
sum = 0
count = 0
for number1 in range(100000):
	number1 = int(input('Enter a number:'))	
	sum = sum + number1
	if number1 == 1 or number1 == 2: 
		break
	if number1 != 1 or number1 != 2:
		print(sum)


