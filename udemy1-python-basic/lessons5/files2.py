import os,sys

if os.path.isfile('myfile.txt'):
    my_file = open('myfile.txt', 'r')
    file_content = my_file.read()
    print(file_content)
    my_file.close()
else:
    print('file does not exist')
    sys.exit()


print('end')
