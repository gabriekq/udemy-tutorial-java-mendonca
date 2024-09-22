
my_grade_math = int(input('math grade: '))
my_grade_physics = int(input('physics grade: '))
my_grade_chemistry = int(input('chemistry grade: '))

if my_grade_math>=35 and my_grade_physics>=35 and my_grade_chemistry>=35:
    avg = (my_grade_math + my_grade_physics + my_grade_chemistry)/3
    if avg<=59:
        print('grade C')
    elif avg<=69:
        print('grade B')
    else:
        print('grade A')
else:
    if my_grade_math<35 and my_grade_physics<35 and my_grade_chemistry<35:
        print('failed in the exams')
    else:
        if my_grade_math<35:
            print('failed in math')
        elif my_grade_physics < 35:
            print('failed in physics')
        else:
            print('failed in chemistry')
