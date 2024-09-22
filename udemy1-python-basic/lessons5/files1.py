
# W write

my_file=open('myfile.txt','w')
print('Enter text type #')


my_input=''
while my_input !='#':
    my_input = input()
    my_file.write(my_input+'\n')


my_file.close()


