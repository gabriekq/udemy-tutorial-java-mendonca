my_list=[]

for x in range(1,11):
    my_list.append(x**3)

print(my_list)

my_list_2 =[index**5 for index in range(1,11)]
print(my_list_2)

my_list_3=[index for index in range(2,21) if index%2==0 ]
print(my_list_3)

list_product = [1,2,3,4,5,6,8,9,10]
list_product_2 = [123,122,322,4336,566,677,88,900,1023]

result_list=[]

for index in range(len(list_product)):
    result_list.append(list_product[index]*list_product_2[index])

print(result_list)

result_list_2= [ list_product[index]*list_product_2[index] for index in range(len(list_product))]
print(result_list_2)

list_product = [1,4,8,5]
list_product_2 = [1,85,45,8]

result_list_equal=[index for index in list_product if index in list_product_2]
print(result_list_equal)