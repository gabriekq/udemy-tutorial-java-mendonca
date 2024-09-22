import threading

name_thread =threading.current_thread().getName()

print(name_thread)

if threading.current_thread() == threading.main_thread():
    print('Equal threading')
