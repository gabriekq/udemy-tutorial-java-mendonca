
my_input_value=  6 ## int(input('Enter the number to generating the table: '))

##for index in range(1,11):
##    print(index,' X ',my_input_value,'=',index*my_input_value)


my_list=[3,6,5,9,12]

for index in my_list:
    if(index==5):
        break
    print(index)

for index in range(1,21):
    if(index % 3==0):
        continue
    print(index)


my_value= 50  #int(input('Enter a number greater than 10: '))
assert my_value > 10, 'Wrong number entered'
print('you entered :',my_value)

my_list_2=eval(input('Enter a list of elements: '))
print(my_list_2)
my_list_aux=[]

for each_value in my_list_2:
    if each_value not in my_list_aux:
        my_list_aux.append(each_value)

print(my_list_aux)

