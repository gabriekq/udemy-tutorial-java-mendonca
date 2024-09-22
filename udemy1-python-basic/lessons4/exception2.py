class OverTheLimitExeption(Exception):
    def __init__(self,msg):
        self.msg=msg




def withdrawl(amount):
    if(amount>500):
        raise OverTheLimitExeption('You can not withdrawl more than 500')


withdrawl(600)
