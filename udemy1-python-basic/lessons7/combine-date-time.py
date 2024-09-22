from datetime import *


my_date = date(2018,7,21)
my_time = time(12,45)

date_time = datetime.combine(my_date,my_time)
print(date_time)
