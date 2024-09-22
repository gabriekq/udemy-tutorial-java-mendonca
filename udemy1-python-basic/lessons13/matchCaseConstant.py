class ATMConstants:
    withdraw = 1
    deposit=2
    balance_check=3

option=3

match option:
    case ATMConstants.withdraw:
        print('withdraw')
    case ATMConstants.deposit:
        print('deposit')
    case ATMConstants.balance_check:
        print('balance_check')
    case _:
        print('no course selected')