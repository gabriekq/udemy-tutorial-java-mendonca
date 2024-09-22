import re

my_value='Take up One ideia  One at the time Only'

result= re.search(r'o\w',my_value)
print(result)

result=re.findall(r'O\w\w',my_value)
print(result)

result=re.match(r'T\w\w',my_value)
print(result.group())

my_value_2='Take up 44 One ideia 88 One at the 11 time'

result=re.sub(r'One','Two',my_value_2)
print(result)

result=re.findall(r'O\w{1,2}',my_value_2)
print(result)

result=re.split(r'\d+',my_value_2)
print(result)

result=re.findall(r'O\w{1,2}',my_value)
print(result)

