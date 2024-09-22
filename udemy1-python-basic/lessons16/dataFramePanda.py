import pandas as pd

scores_dict = {'gabriel':[100,85,74],'joao':[48,74,8],'marcos':[85,55,8],'carlos':[85,55,88] }
scores = pd.DataFrame(scores_dict)
scores.index = ['I1','I2','I3']

print(scores)

print('G')
print(scores[['gabriel','marcos']])
print()
print(scores.loc['I1'])
print('Slicing')
print(scores.loc['I1':'I2'])
print('Slicing Iloc')
print(scores.iloc[0:2])

print('Select specific rows')
print(scores.loc[['I1','I3']])
print(scores.iloc[[0,1]])

print('sub set of rows and columns')
print(scores.loc[['I1','I3'],['gabriel','marcos']])
print(scores.iloc[[0,2],0:3])

print(scores[scores>=90])
print(scores[(scores>=80) & (scores<=90) ])

print(scores.at['I2','gabriel'])
scores.iat[2,0]=999
scores.at['I2','gabriel']=35

pd.set_option('display.precision',0)
print(scores.mean())
print(scores.describe())
print(scores.T)

print(scores.sort_index(ascending=False))
print(scores.sort_index(axis=1))
print(scores.sort_values(by='I1',axis=1,ascending=False))