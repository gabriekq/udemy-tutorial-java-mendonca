
def decor(func):
    def inner_func():
        result = func()
        return result*2
    return inner_func


@decor
def num():
    return 5


def decor_fun(fun):
    def inner(n):
        result = fun(n)
        result = result + ' How are you'
        return result
    return inner

@decor_fun
def hello(name):
    return "Hello "+name


def square(fun):
    def inner():
        n = fun()
        return n*n
    return inner


def half(fun):
    def inner():
        value = fun()
        return value/2
    return inner


@square
@half
def my_num_func():
    return 2888


print(my_num_func())
print(num())
print(hello('jonh'))