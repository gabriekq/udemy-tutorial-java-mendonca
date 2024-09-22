import re

my_value='Take up 1-3-2019 One ideia  One at the time Only 12-11-2020 '


result=re.findall(r'\d{1,2}-\d{1,2}-\d{4}',my_value)
print(result)

result= re.search(r'^T\w*',my_value)
print(result.group())


