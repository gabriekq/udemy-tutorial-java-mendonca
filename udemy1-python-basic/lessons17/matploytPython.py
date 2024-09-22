import numpy as np
import matplotlib.pyplot as plt

xpoint = np.array([2020,2021,2022,2023])
ypoint = np.array([6.6,8.7,7.0,6.8])

ypoint2 = np.array([-4,3.7,7.0,6.8])

#plt.title('GDP india')
#plt.xlabel('Year')
#plt.ylabel('GDP')
#plt.grid(color='brown',linestyle='--',linewidth=0.01,axis='y')
#plt.plot(xpoint,ypoint,color='green',alpha=1)
#plt.scatter(xpoint,ypoint,color='red')
#plt.bar(xpoint,ypoint,color='orange')

#student_scores = np.array([80,90,88,22,34,90,80,70,60,80,77,66,90])
#plt.hist(student_scores,rwidth=0.6)
fig,ax = plt.subplots(nrows=1,ncols=2)

fig.suptitle('Figure')
ax[0].plot(xpoint,ypoint,color='green')
ax[1].plot(xpoint,ypoint2,color='red')

plt.show()



