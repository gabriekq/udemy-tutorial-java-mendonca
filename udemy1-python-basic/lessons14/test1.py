import unittest
from lessons7.creadCardValidation import *


class CredCardValidationTest(unittest.TestCase):

    def setUp(self):
        print('Setup')

    def tearDown(self):
        print('teardonw')


    def test_validateCard_valid(self):
        result = validateCard(date(2028, 2, 2))
        assert 'valid' == result

    def test_invalidateCard_exeption(self):
        with self.assertRaises(RuntimeError):
            validateCard(date(2020, 2, 2))


if __name__ == '__main__':
    unittest.main()
