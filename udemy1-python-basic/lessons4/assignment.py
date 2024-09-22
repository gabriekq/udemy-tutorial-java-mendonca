class InvalidPasswordExeption(Exception):
    def __init__(self,msg):
        self.msg=msg


my_input = input('Enter a password: ')

try:
  if(len(my_input)<8):
      raise InvalidPasswordExeption('too short string lenth, it shuld be more then 8 cracters')

except InvalidPasswordExeption:
    print('captured exeption')