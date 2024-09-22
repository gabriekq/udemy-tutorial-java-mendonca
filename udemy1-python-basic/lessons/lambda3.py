import keyword

def custon_gen(x,y):
    while x<y:
        yield x
        x =x +1


result = custon_gen(20,30)

for index in result:
    print(index)
    
print(keyword.kwlist)