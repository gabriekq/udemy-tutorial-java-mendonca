import unittest
from lessons2.clinicalsapp import *

class ClinicalValidationTest(unittest.TestCase):

    def setUp(self):
        self.clinical = Clinical('scalpel',2000)


    def test_validatePatient(self):
           patient = Patient('jonh',25)
           patient.addClinicalData(self.clinical)


    if __name__ == '__main__':
        unittest.main()