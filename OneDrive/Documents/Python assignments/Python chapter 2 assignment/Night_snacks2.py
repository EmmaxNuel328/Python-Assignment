
#collect three inputs from a user
#save them in a variable respectively
#then assign a variable to "Average" and store  the addition of all three inputs then divide  by 3 
#using selection statement check if average is greater than or equal to 90 and less or equal 100 and print A
#if false check if average  is greater or equal to 80 and less 90 and print B
#if false check if average  is greater or equal to 70 and less 80 and print
#C
#if false check if average  is greater or equal to 60 and less 70 and print 
#D
#if false check if average  is greater or equal to 0 and less 60 and print E
first = int(input('Enter first score'))
second = int(input('Enter second score'))
third = int(input('Enter third score'))

average = int((first + second + third)/3)

if average >= 90 and average <= 100:
	print('Average: A', average)
if average >= 80 and average < 90:
	print('Average: B', average)
if average >= 70 and average < 80:
	print('Average: C', average)
if average >= 60 and average < 70:
	print('Average: D', average)
if average >= 0 and average < 60:
	print('Average: E', average)


