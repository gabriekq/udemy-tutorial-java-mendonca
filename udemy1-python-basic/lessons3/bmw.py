from abc import abstractmethod,ABC

class BMW(ABC):

    def __init__(self,make,model,year):
        self.make=make
        self.year=year
        self.model=model

    @abstractmethod
    def start(self):
        pass
    #    print('starting the car')

    @abstractmethod
    def stop(self):
        pass
   #     print('stop the car')

    @abstractmethod
    def drive(self):
        pass



class ThreeSeries(BMW):

    def __init__(self,cruiseControlEnabled,make,model,year):
        super().__init__(make,model,year)
        self.cruiseControlEnabled=cruiseControlEnabled

    def display(self):
        print('ThreeSeries : ',self.cruiseControlEnabled)

    def start(self):
        super().start()
        print('Button start')

    def stop(self):
        print('stop car ThreeSeries')

    def drive(self):
        print('ThreeSeries is being driven')


class FiveSeries(BMW):

    def __init__(self, parkingAssistEnable, make, model, year):
        super().__init__( make, model, year)
        self.parkingAssistEnable = parkingAssistEnable

    def stop(self):
        print('stop car ThreeSeries')

    def start(self):
        print('Button start')

    def drive(self):
        print('ThreeSeries is been drive')


threeSeries=ThreeSeries(True,'BMW','328I',2001)
print(threeSeries.cruiseControlEnabled)
print(threeSeries.make)
print(threeSeries.model)
print(threeSeries.year)
threeSeries.display()
threeSeries.start()

fiveSeries=FiveSeries(False,'BMW','328I',2001)
print(fiveSeries.parkingAssistEnable)
print(fiveSeries.make)
print(fiveSeries.model)
print(fiveSeries.year)
fiveSeries.start()
fiveSeries.stop()


