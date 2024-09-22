
def displays():
    def message():
        return 'Hello  '
    return message


def fun_list(my_list):
    for item in my_list:
        print(item)


def my_factorial_func(value):
    if value == 0:
        return 1
    else:
        return value*my_factorial_func(value-1)


def average(value_1=10,value_2=10):
    return (value_1+value_2)/2



##fun_list([1,5,7,45,85,4])
factorial_result=my_factorial_func(value=887)
avg=average(value_1=85)
print(avg)

print(factorial_result)

##fun=displays()
##print(fun())


