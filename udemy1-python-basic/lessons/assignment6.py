my_number=int(input('Enter the Number: '))

prime_flag=True

for index in range(2,my_number-1):
    if my_number % index == 0:
        prime_flag = False
        break

if prime_flag==True:
    print('Prime No ')
else:
    print('Not a Prime ')
