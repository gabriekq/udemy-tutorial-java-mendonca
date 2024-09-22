import numpy as np

a1 = np.arange(12)
print('a1',a1)

a2 = np.reshape(a1,(2,6))
print('a2',a2)

a3 = np.reshape(a1,(2,2,3))
print('a3 ',a3.flatten())

print(np.eye(5))