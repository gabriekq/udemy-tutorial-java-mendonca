
my_file=open('sample.txt','a+')
print('Cursor at',my_file.tell())
my_file.write('new values here')
my_file.seek(0)
my_list=[]

for line in my_file:
    my_list.append(line)

print(my_list)
my_file.close()