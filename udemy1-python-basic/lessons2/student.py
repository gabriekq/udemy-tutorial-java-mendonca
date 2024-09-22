class Student:
    major='CSE'


    def __init__(self,rollno,name):
        self.rollno=rollno
        self.name=name


student = Student(1,'joao')
student1 = Student(2,'maria')

print(student.major)
print(student1.major)

print(student.name)
print(student1.name)
print(Student.major)
