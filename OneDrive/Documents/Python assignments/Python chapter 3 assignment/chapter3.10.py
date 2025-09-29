principal = 1000
rate = 0.07
year = 1
for year in range(30):
	amount = principal*(1+0.07)**year
	year= year + 1
	print(year,amount)
