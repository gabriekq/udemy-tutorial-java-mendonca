import pandas as pd

courses = pd.Series(['java','python','AWS'])

reviews = pd.Series([4.6,4.4,4.8,5])

print(reviews.describe())

print(courses.str.upper())
print(courses.str.contains('y'))


