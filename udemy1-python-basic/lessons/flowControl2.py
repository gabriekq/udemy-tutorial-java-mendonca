my_min_value= 20 # int(input('enter min number: '))
my_max_value= 25# int(input('Enter the max number: '))

while my_min_value <= my_max_value:
    if(my_min_value % 2 != 0):
        print(my_min_value)

    my_min_value=my_min_value+1



for index in range(50,71,3):
    print(index)

my_list = [8,7,4,5,6,9,84,74,965,87]
prod=1

for index in my_list:
    prod*=index

print(prod)