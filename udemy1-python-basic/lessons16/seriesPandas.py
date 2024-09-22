import pandas as pd

reviews = pd.Series([4.6,4.4,4.8,5])

print(reviews)

print(reviews.count())
print(reviews.min())
print(reviews.max())
print(reviews.std())

reviews2 = pd.Series([4.6,4.4,4.8,5],index=['python','java','django','devops'])
print(reviews2)

reviews3 = pd.Series({'python':4.6,'gabriel':5.6,'joao':2.6,})
print()
print(reviews3.values)