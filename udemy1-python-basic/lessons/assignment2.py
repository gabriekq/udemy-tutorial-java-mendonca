
my_coutry = ['Brazil','USA','Canada']
print(my_coutry)
my_coutry.append('Argentina')
print(my_coutry)
my_coutry.__delitem__(0)
index_middle = int(len(my_coutry)/2)

print(my_coutry)
my_coutry.insert(index_middle,'Australia')
print(my_coutry)

## set

print('With sets')

my_coutry_set = {'Brazil','USA','Canada'}
print(my_coutry_set)
my_coutry_set.add('Argentina')
print(my_coutry_set)
my_coutry_set.discard('USA')
print(my_coutry_set)