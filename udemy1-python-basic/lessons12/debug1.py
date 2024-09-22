from lessons12.debug2 import fun2

def fun1(number):
    print('fun1 ',number)
    fun2(number)


number= int(input('Enter a number: '))
fun1(number)