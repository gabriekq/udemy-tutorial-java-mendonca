

my_file=open('sample.txt','r')
print(len(my_file.readlines()))
print(len(my_file.read().split('\n')))


print(my_file.read())
my_file.seek(0)
print(my_file.readline())
my_file.seek(0)
print(my_file.readlines())
my_file.close()