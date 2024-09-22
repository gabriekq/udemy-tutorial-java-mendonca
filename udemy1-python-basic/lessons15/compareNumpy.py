import numpy as np

a1 = np.array([22,32,51,90,100])
a2= np.array([20,40,60,80,100])

print(a1>=a2)
print(a1<a2)

print(np.any(a1>=a2))
print(np.all(a1<=a2))

print(np.logical_or(a1>10,a1<101))

print(np.where(a1%2!=0,a1,0))
print(np.where(a1>a2,a1,a2))