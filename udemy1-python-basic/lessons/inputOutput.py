

a,b=20,88
print(a,b,sep=',')

name='johon'
marks=94.5

print('name is',name,' Marks are ',marks)
print('name is %s  %.2f '%(name,marks))
print('Name is {}, marks {} '.format(name,marks))
print('Name is {1}, marks {0} '.format(name,marks))

#my_number_2 = int(input('enter your number'))

#print(my_number_2)

my_numbers = input('enter your numbers ').split(" ")
print(type(my_numbers))

my_numbers_list = [int(index) for index in input('enter your numbers ').split(",")]
print(my_numbers_list)

for number in my_numbers:
    print(number)
