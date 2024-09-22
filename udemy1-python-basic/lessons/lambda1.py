from functools import reduce

def cube(value):
    return value**3


print(cube(2))

function_cube = lambda value:value**3
print('with lambda: ',function_cube(8))

is_EvanNumber=lambda value: 'Yes' if value%2==0 else "No"

print(is_EvanNumber(2))
print(is_EvanNumber(3))

sum_numbers = lambda value_1,value_2:value_1+value_2
print(sum_numbers(5,8))

my_list=[10,85,4,7,6,8,52,4,111,55,47,49]
my_result=list(filter(lambda value:value%2==0,my_list))
print(my_result)

list_numbers = [2,3,4,5]
result_map=list(map(lambda value:value*2,list_numbers))
print(result_map)

result_reduce=reduce(lambda x,y:x+y,list_numbers)
print(result_reduce)
