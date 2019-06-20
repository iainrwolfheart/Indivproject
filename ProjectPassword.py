password=input("Enter your password: ")

def convert(password):
	i=0
	con=""
	while i<len(password):
		if ord(password[i])>=65 and ord(password[i])<=90:
			con=con+chr(ord(password[i])+32)
		else:
			if ord(password[i])>=97 and ord(password[i])<=122:
				con=con+chr(ord(password[i])-32)
			else:
				if ord(password[i])>=48 and ord(password[i])<=57:
					con=con+str(int(password[i])*2)
				else:
					con=con+(password[i])
		i+=1
	return con

print("Your password has been converted: ", convert(password))