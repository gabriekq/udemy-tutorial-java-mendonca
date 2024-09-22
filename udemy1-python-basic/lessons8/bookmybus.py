from threading import *

class BookMyBus:

    def __init__(self,availbleSeats):
        self.availbleSeats = availbleSeats
      #  self.lock = Lock()
        self.lock = Semaphore()

    def buy(self,seatsRequest):
        self.lock.acquire()
        print('Total of available seats ',self.availbleSeats)
        if(self.availbleSeats>=seatsRequest):
         print('confirmng a seat')
         print('processing the payment')
         print('printing the Ticket')
         self.availbleSeats-=seatsRequest
        else:
            print('Sorry no seats available')
        self.lock.release()


objBus = BookMyBus(10)

my_thread = Thread(target=objBus.buy,args=(3,))
my_thread2 = Thread(target=objBus.buy,args=(4,))
my_thread3 = Thread(target=objBus.buy,args=(6,))
my_thread4 = Thread(target=objBus.buy,args=(1,))

my_thread.start()
my_thread2.start()
my_thread3.start()
my_thread4.start()