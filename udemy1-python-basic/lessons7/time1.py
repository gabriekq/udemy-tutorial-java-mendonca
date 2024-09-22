import time,datetime

epoch_seconds = time.time()
print(epoch_seconds)

time_obj=time.ctime(epoch_seconds)
print(time_obj)

date_time=datetime.datetime.today()
print(date_time)

print(date_time.day,date_time.month,date_time.year)

print(date_time.hour,date_time.minute,date_time.second,date_time.microsecond)

new_date= '{}/{}/{}'.format(date_time.day,date_time.month,date_time.year)

print(new_date)