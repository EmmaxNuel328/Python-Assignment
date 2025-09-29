gallon = 0
sum = 0


while gallon != -1:
	sum = sum + gallon
	gallon = int(input('Enter the gallons used, -1 to end:')) 
	miles = float(input('Enter the miles driven:'))
	print('The miles/gallon for this tank is :' miles/gallon)
print(f'sum:{sum}')
