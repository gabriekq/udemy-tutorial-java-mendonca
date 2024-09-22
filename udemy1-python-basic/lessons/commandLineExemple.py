import sys

my_list=sys.argv
product = 1

for index in range(1, (len(my_list))):
    product=product*int(my_list[index])

print(product)