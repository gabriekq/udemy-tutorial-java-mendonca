class Student:
    # def __init__(self):
    #     self.__id=123
    #     self.__name='jonh'
    #
    # def display(self):
    #     print(self.__id)
    #     print(self.__name)

    def setID(self,my_id):
        self.id=my_id

    def getId(self):
        return self.id

    def setName(self,name):
        self.name=name

    def getName(self):
        return self.name


studant=Student()
studant.setName('gabriel')
studant.setID(123)
print(studant.getName())
print(studant.getId())

# studant.display()

# print(studant._Student__id)
