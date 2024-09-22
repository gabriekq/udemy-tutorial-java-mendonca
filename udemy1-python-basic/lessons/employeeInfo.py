number_employees=int(input('Enter the number of employees: '))
employees={}
for index in range(number_employees):
    name = input('Enter employee name: ')
    salary = input('Enter employee salary: ')
    employees[name] = salary

while True:
    name = input('Enter the employee name: ')
    salary = employees.get(name,-1)
    if salary==-1:
        print('employee does not exist')
    else:
        print('the salary of the emploee is -> ',salary)
        choice = input('Do you want to continue with other employee [yes | no]')
        if choice=='no':
            break