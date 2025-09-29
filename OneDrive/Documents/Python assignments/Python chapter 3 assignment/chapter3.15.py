e = 1

for counter in range (1, 11):
	while counter > 1:
		counter = counter * (counter - 1)
		break
	e = e + ( e / counter)
	

print(e)
