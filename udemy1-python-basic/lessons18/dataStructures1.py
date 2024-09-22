import queue

my_queue = queue.Queue()
my_queue.put('python')
my_queue.put('Django')
my_queue.put('DRF')

print(my_queue.qsize())
my_queue.queue.clear()

for index in my_queue.queue:
    print('For ',index)

while not my_queue.empty():
    print(my_queue.get())