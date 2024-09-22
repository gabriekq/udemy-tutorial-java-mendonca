import sys

option = my_list=sys.argv[1]

accBalance=10000


while option != '100':

    if option=='0':
        print(accBalance)
    elif option=='1':
        value_with_draw = int(input('value to get: '))
        accBalance=accBalance-value_with_draw
    elif option=='2':
        value_deposit_cash = int(input('value to deposit: '))
        accBalance=accBalance+value_deposit_cash
    elif option=='3':
        value_deposit_check = int(input('value to deposit: '))
        accBalance=accBalance+value_deposit_check
    else:
        break
    option = input('option: ')
