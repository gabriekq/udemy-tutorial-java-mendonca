import pickle, lessons5.studant


my_file=open('studant.dat','wb')
studant=lessons5.studant.Student(123,'gabriel',90)
pickle.dump(studant,my_file)
my_file.close()
