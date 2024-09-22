class Product:

    def __init__(self):
        self.name = 'Iphone'
        self.description='it works'
        self.price=700

    def display(self):
        print(self.name)
        print(self.price)
        print(self.description)

    def __del__(self):
        print('Inside the destructor')


p1=Product()
p1.display()
p1=None

p2=Product()
p2.display()
p2=None


