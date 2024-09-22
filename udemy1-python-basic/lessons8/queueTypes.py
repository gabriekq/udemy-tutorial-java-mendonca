
import queue

q = queue.LifoQueue()
q.put(400)
q.put(100)
q.put(500)
q.put(50)
q.put(200)
while not q.empty():
    print(q.get(),end=' ' )

print()

pq = queue.PriorityQueue()

pq.put(('John'))
pq.put(('Boon'))
pq.put(('Gabriel'))

while not pq.empty():
    print(pq.get(),end=' ' )



