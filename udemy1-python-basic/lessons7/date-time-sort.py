
from datetime import date
import time

start_time = time.perf_counter()

list_dates = []

d1=date(2016,8,12)
d2=date(2020,8,12)
d3=date(2018,8,12)

list_dates.append(d1)
list_dates.append(d2)
list_dates.append(d3)

list_dates.sort()

##time.sleep(3)

for date in list_dates:
    print(date)


end_time = time.perf_counter()

print('Execution time',end_time-start_time)

