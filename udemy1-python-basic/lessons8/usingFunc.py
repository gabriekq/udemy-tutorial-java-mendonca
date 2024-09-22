from threading import *


def displayNumbers():
    index=0
    print(current_thread().getName())
    while(index<10):

        print(index)
        index=index+1


print(current_thread().getName())
thread1=Thread(target=displayNumbers)
thread1.start()

