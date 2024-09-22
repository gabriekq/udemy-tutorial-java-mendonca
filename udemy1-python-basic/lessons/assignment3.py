print('1-Onion')
print('2-Lettuce')
print('3-Tomato')
print('4-Oliver')
print('5-Pepper')
print('6-Tomatoes')

my_ingredients = {1:'Onion',2:'Lettuce',3:'Tomato',4:'Oliver',5:'Pepper',6:'Tomatoes'}
my_ingredients_choose = []

for index in range(3):
    ingredient = input('pick one option ')
    ingredient = int(ingredient)
    my_ingredients_choose.append(my_ingredients.get(ingredient))

print(my_ingredients_choose)
how_many=input('how many:')
how_many = int(how_many)
total_price=how_many*5.00
print('Total:  %.2f'%(total_price))
