
def average(value_a,value_b):
    return(value_a+value_b)/2


def displays(name):
    def message():
        return 'Hello  '
    result = message()+name
    return result


def calc(value_a,value_b):
    sum=value_b+value_a
    minus=value_a-value_b
    multiplication=value_a*value_b
    dividion=value_a/value_b
    return sum,minus,multiplication,dividion


def display_vale():
    y=123
    print(y)
    print(globals()['y'])


def my_func_1(function_param):
    return 'Hello '+function_param


def message_1():
    return 'Gabriel'


print(my_func_1(message_1()))

y=54
result_value=calc(85,74)
print(result_value)

for value in result_value:
    print(value)

result=average(52,41)
print(result)

print(y)
my_func=display_vale
my_func()
result_displays=displays(name='gabriel')
print(result_displays)




