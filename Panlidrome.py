prompt = int(input("Enter a five digit number: "))
prompt1 = prompt//10000
prompt2 = (prompt%10000)//1000
prompt3 = (prompt%10000%1000)//100
prompt4 = (prompt%10000%1000%100)//10
prompt5 = (prompt%10000%1000%100%10)//1
print(prompt1,prompt2,prompt3,prompt4,prompt5)
def panlidrome(prompt):
	if prompt5 == prompt1 and prompt4 == prompt2: 
		return True
	else:
		return False
print(panlidrome(prompt))

	