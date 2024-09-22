

try:

   num=int(input('Enter a even number: '))
   assert num%2==0,'You have enter an odd number'
except AssertionError as obj:
    print(obj)

print('end')