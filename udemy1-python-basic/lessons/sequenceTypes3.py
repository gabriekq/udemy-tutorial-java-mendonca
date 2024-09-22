my_set = {10,20,30,'XYZ'}


my_set.update([88,99])
print(my_set)

my_set.remove(20)
print(my_set)

my_frozen_set = frozenset(my_set)

##Range

my_range = range(20,52,3)

#for index in my_range:
#    print(index)

## Bytes

my_list = [20,30,40,238]
my_bytes = bytes(my_list)

my_bytes_list = bytearray(my_list)

print(my_bytes_list[1])
print(type(my_list))
print(my_bytes)

## Dictionary

my_dictionary = {1:'john',2:'bob',3:'bill'}
print(my_dictionary)
print(my_dictionary.items())

my_keys = my_dictionary.keys()
my_values = my_dictionary.values()

for key in my_keys:
    print(my_dictionary.get(key))

for key in my_keys:print(key)

del my_dictionary[1]

for index in my_values:print(index)

value1 = 20
value2 = 20

print('compare',id(value1)==id(value2))
print(id(value2))

print(value1 is value2)