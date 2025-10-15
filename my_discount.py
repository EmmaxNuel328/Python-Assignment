price = int(input("Enter price: "))
discount = int(input("Enter discount: "))
def my_discount(price,dicount):
	return ((100 - discount)/100)*price
discount = ((100 - discount)/100)*price
print("Price after discount",discount)