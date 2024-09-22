
my_value=int(input('enter the number: '))

for index in range(0,my_value):
    if index % 10 == 0:
        continue
    if index > 100:
        break
    print(index)


