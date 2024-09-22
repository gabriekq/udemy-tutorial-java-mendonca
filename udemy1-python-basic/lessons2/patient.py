class Patient:

    def setName(self,name):
        self.__name=name

    def setID(self,id):
        self.__id=id

    def setSnn(self,snn):
        self.__ssn=snn

    def getName(self):
        return self.__name

    def getID(self):
        return self.__id

    def getSnn(self):
        return self.__ssn


patient=Patient()
patient.setID(123)
patient.setName('joao')
patient.setSnn(123547)

print(patient.getName(),'  ',patient.getID(),' ',patient.getSnn())

