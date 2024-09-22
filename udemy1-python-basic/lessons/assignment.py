
firstName ='Gabriel'
lastName = 'mendonca'
age = 24
ssn = 123456
height = 24.4
weight = 65.41

print(firstName)
print(lastName)

print(age)
print(ssn)

print(height)
print(weight)


from math import radians
import numpy as np                # installed with matplotlib
import matplotlib.pyplot as plt

def main():
   x = np.arange(0, radians(1800), radians(12))
   plt.plot(x, np.cos(x), 'b')
   plt.show()

main()



