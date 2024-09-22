from threading import *
from time import sleep

class MyThread:

    def desplayNumbers(self):
        index = 0
        print(current_thread().name)
        sleep(1)
        while (index < 10):
            print(index)
            index = index + 1


my_Thread=MyThread()
thread=Thread(target=my_Thread.desplayNumbers)
thread.start()

my_Thread=MyThread()
thread2=Thread(target=my_Thread.desplayNumbers)
thread2.start()

my_Thread=MyThread()
thread3=Thread(target=my_Thread.desplayNumbers)
thread3.start()