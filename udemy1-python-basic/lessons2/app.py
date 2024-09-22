#import modules.modules1 as modules1
from modules import modules1
import math as math
import random as random
from lessons2.course import Course
from lessons2.programmer import Programmer

print(modules1.sum(20,10))
print(modules1.diff(74,123))

print(math.sqrt(9))
print(random.random())

list=['java','c-sharp','AWS','azure','python']

for index in range(2):
    print()
    print(random.random())
    print(random.randint(1,50))
    print(random.uniform(1,50))
    print(random.randrange(10,20,2))
    print(random.choice(list))

print('------------object')

cource = Course('java',[1,23,5,6,8])
print(cource.name)
print(cource.ratings)

cource2 = Course('jsp',[1,28,5,6,8])
print(cource2.name)
print(cource2.ratings)

print(cource.average())
print(cource2.average())

programmer=Programmer()
programmer.setName('joao')
programmer.setSalary(1000)
programmer.setTechnologies(['java','aws'])

print(programmer.getName())
print(programmer.getSalary())
print(programmer.getTechnologies())


