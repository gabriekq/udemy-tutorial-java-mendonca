
number_rows= 2#int(input('Enter the number of rows: '))

for index in range(1,number_rows+1):
    for index_2 in range(1,index+1):
        print('* ',end='')
    print()


number_rows=  5 ##int(input('Enter the number of rows: '))

for index in range(1,number_rows+1):
    print('* '*index)


number_rows_input = 5 #int(input('Enter the number of rows: '))

for index in range(1,number_rows_input+1):
    print(" "*(number_rows_input-index),end='')
    print('* '*index)


my_value = 'gabriel need to find more find after all find'

subs='find'
found=False
pos=-1
length = len(my_value)

while True:
    pos = my_value.find(subs,pos+1)
    if pos==-1:
        break
    print('Found at the position',pos)
    found=True

if found==False:
    print('Sub string not found')