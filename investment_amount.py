investment_amount = int(input("Enter investment amount: "))
monthly_interestRate = int(input("Enter monthly interest rate: "))
years = int(input("Enter years: "))
numberOfMonths = int(years * 12)
def future_investment_value(investment_amount,monthly_interestRate,years):
	return investment_amount * (1 + monthly_interestRate/100)**numberOfMonths
print(future_investment_value(investment_amount,monthly_interestRate,numberOfMonths))
