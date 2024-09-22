class Duck:
    def talk(self):
        print('Quack Quack')

class Human:
    def talk(self):
        print('hello')


def callTalk(obj):
    obj.talk()


duck=Duck()
human=Human()

callTalk(duck)
callTalk(human)

