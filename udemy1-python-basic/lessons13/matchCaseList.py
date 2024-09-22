list1=['django','docker']

match list1:
    case ['python','django']:
        print('python and django')
    case ['django','docker']:
        print('djago and docker')
    case ['docker','drf']:
        print('djago and docker')
    case _:
        print('no course selected')
