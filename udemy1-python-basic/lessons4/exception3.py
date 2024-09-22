
class TooyoungException(Exception):
    def __init__(self,msg):
        self.msg=msg

class TooOldExeption(Exception):
    def __init__(self,msg):
        self.msg=msg


age = int(input('Enter the age: '))

if age < 18:
    raise TooyoungException('you have to be 18 or older')
elif age > 90:
    raise TooOldExeption('you have to be younger than 90')
else:
    print('You are elgibe')