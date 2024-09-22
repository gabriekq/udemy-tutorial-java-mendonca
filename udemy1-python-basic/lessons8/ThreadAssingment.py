from threading import *

def printEven():

    for index in range(0,200,2):
        print('print even -> ',index)


def printOdd():

    for index in range(0,200,3):
        print('print odd -> ',index)


t1=Thread(target=printEven())
t2=Thread(target=printOdd())

t1.start()
t2.start()