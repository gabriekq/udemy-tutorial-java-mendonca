from threading import Thread


class myTread(Thread):

    def run(self):
        index = 0
        while (index < 10):
            print(index)
            index = index + 1


thread=myTread()
thread.start()
