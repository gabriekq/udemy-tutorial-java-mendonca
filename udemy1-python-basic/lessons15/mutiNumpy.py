import numpy as np

a1 =np.array([1,2,3,4,5,6])
a2 = np.array([[1,2,3],[4,5,6]])

a3 = np.array([[[1,2],[3,4]],[[5,6],[7,8]]])

print(a1)
print(a2)
print(a3)

print(a1.ndim)
print(a2.ndim)
print(a3.ndim)

print(a1.shape)
print(a2.shape)
print(a3.shape)

print('A2 before',a2)
a2.shape = (3,2)
print('A2 after \n',a2)

print(a1.size)
print(a2.size)
print(a3.size)

print(a1.itemsize)
print(a2.itemsize)
print(a3.itemsize)

print(a1.nbytes)
print(a2.nbytes)
print(a3.nbytes)