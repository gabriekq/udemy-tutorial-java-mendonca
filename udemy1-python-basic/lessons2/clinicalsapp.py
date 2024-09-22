class Patient:
    def __init__(self,name,age):
        self.name=name
        self.age=age
        self.clinical=[]


    def addClinicalData(self,clinical):
        self.clinical.append(clinical)



class Clinical:
    def __init__(self,component_name,component_value):
        self.component_name=component_name
        self.component_value=component_value

# patient=Patient('gabriel',40)
# clinical=Clinical('bp',15)
# patient.addClinicalData(clinical)
#
# clinical2=Clinical('heartRAte',80)
# patient.addClinicalData(clinical2)
#
# print(patient.name)
#
# for clinical in patient.clinical:
#     print(clinical.component_name,' ',clinical.component_value)