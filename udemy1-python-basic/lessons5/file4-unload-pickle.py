import pickle

my_file=open('studant.dat','rb')
obj=pickle.load(my_file)
obj.display()
my_file.close()
