

def calculateBMI(height,weight=8):
    heightInMeters = height*0.4536
    bmi= weight/(heightInMeters*heightInMeters)
    return bmi


def my_fun(value, *args,**kwargs):
    kwargs['id']=123456789
    print(value,args[1])
    for key ,item in kwargs.items():
        print(key, value)
    modified_pos_param = args+(50,)
    my_fun2(*modified_pos_param,**kwargs)


def my_fun2(*args,**kwargs):
    print(args)
    print(kwargs)


#print(calculateBMI(5.8,70))
#print(calculateBMI(7.8,40))
my_fun(12,500,888,name='gabriel',salary=20000)