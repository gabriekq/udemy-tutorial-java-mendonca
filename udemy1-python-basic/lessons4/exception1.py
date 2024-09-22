import logging

logging.basicConfig(filename='mylog.log',level=logging.DEBUG)


file=None
try:
    file= open('myfile','w')
    a, b = [int(index) for index in input('enter two numbers ').split()]
    logging.info('division in progrees')
    c = a/b
    file.write('hello %d into file'%c)
except ZeroDivisionError:
    print('Division by zero is not allowed')
    logging.error('Division by zero erro')
else:
    print('non zero number entered')
finally:
    file.close()
    print('fileclonse')








