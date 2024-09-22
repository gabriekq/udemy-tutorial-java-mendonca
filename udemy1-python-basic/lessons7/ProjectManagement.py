from datetime import *

class Projec:

    def __init__(self,name,start_date,end_date):
        self.name=name
        self.start_date=start_date
        self.end_date=end_date
        self.tasks=[]

    def addTask(self,task):
        self.tasks.append(task)


class Task:

    def __init__(self,name,duration):
        self.name=name
        self.duration=duration
        self.resources=[]

    def addRecourse(self,resource):
        self.resources.append(resource)


class Resource:

    def __init__(self,name,skill):
        self.name=name
        self.skill=skill


project = Projec('IA',date(2026,1,1),date(2029,1,1))
task = Task('create Bot',90)
resource = Resource('jonh','python')

task.addRecourse(resource)
project.addTask(task)

for eachTask in project.tasks:
    print(eachTask.name)
    for eachResource in eachTask.resources:
        print(eachResource.name)
        print(eachResource.skill)