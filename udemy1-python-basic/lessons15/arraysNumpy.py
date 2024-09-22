import numpy as np

my_arr = np.array([1,2,3,4,5],int)
carr=np.array(['a','b','c'],dtype=str)
sarr=np.array(['python','java','Django'])

print(my_arr)
print(carr)
print(sarr)

print(np.linspace(1,10,10))

larr= np.logspace(1,20)

for index in larr:
    print(index)

print(np.arange(100,1,-2))
print(np.zeros(20))
print(np.ones(10) )