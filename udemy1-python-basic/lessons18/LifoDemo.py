import queue

my_queue = queue.LifoQueue()
my_queue.put('python')
my_queue.put('Django')
my_queue.put('DRF')

while not my_queue.empty():
    print(my_queue.get())