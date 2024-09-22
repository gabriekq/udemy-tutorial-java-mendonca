
my_file=open('sample.txt','w+')

my_file.write('Python is good \n')

my_file.writelines(['joa\n','gabriel\n','est\n'])

print('Cursor is at',my_file.tell())

my_file.seek(0)
print(my_file.read())
my_file.close()