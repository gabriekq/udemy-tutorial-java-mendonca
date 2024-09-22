from datetime import *

def validateCard(exp_date):
    if exp_date>datetime.now().date():
        return 'valid'
    else:
        raise RuntimeError('Card has expired')

print(validateCard(date(2028,2,2)))