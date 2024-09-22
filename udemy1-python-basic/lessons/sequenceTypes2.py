
my_list = [10,20,'My name',-10,30.547854785]

print(my_list)
print(my_list[3])
print(my_list[3:5])
print(my_list*4)
print(len(my_list))

## add element
my_list.append('gabriel')
print(my_list)
## remove element
my_list.remove('gabriel')
my_list.remove('My name')
print(my_list)
del(my_list[1])
print(my_list)

## more functions
##my_list.clear()

print(max(my_list))
print(my_list)
my_list.insert(3,99)
print(my_list)

my_list.sort(reverse=True)
print(my_list)

## Tuple

my_tuple = (20,30,20,40,50,'xyz')
print(type(my_tuple))
print(my_tuple*3)
print(my_tuple.count(20))
print(my_tuple.index('xyz'))

print(my_tuple[2:])

my_list_2=[67,34,'XYZ']
print(type(my_list_2))
my_tuple_2 = tuple(my_list_2)
print(type(my_tuple_2))