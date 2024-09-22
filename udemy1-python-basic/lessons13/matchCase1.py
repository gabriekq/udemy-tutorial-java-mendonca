
my_value=200

match my_value:
    case 1:
        print('One')
    case 2:
        print('Two')
    case 3:
        print('Three')
    case _:
        print('any case')