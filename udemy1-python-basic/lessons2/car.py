class Car:

    def __init__(self,make,year):
        self.make=make
        self.year=year

    class Engine:
        def __init__(self,number):
            self.number=number

        def start(self):
            print('Engine started')



my_car=Car('BMW',2017)

engine=my_car.Engine(1212)

engine.start()