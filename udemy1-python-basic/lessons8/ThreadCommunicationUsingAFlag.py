from threading import *
from time import *

class Producer:
    def __init__(self):
        self.products=[]
        self.orders_placed= False

    def produce(self):
        for index in range(1,5):
            self.products.append('product '+str(index))
            sleep(1)
            print('Item Added')
        self.orders_placed=True

class Consumer:
    def __init__(self,prod):
        self.prod=prod

    def consume(self):
        while self.prod.orders_placed == False:
            sleep(0.2)

        print('Order Shipped ',self.prod.products)

p=Producer()
c=Consumer(p)

t1 = Thread(target=p.produce)
t2 = Thread(target=c.consume)

t1.start()
t2.start()