number = int(input('Enter five digit number'))
number1 = number//10000
number2 = (number%10000)//1000
number3 = ((number%1000)%1000)//100
number4 = (((number%10000)%1000)%100)//10
number5 = number%10

print(number1,number2,number3,number4,number5)
