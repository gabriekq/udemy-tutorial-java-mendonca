
students = {'jonh':['python','DJango','DRF'],'bob':['java','spring'],'jim':['js','node','react']}

my_keys = students.keys()
for eachKey in my_keys:
    print('Courses taken by',eachKey,' are: ')
    for eachCource in students[eachKey]:
        print(eachCource)