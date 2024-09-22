class Flight:
    def __init__(self,engine):
        self.engine=engine

    def startEngine(self):
        self.engine.start()


class AirbusEngine:
    def start(self):
        print('Starting Airbus Engine')


class BoingEngine:
    def start(self):
        print('Starting BoingEngine')


ae=AirbusEngine()
flight = Flight(ae)
flight.startEngine()

be=BoingEngine()
flight = Flight(be)
flight.startEngine()