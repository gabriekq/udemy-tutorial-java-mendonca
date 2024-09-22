
import socket

my_socket=socket.socket()

my_socket.connect(('localhost',4000))

msg=my_socket.recv(1024)

while msg:
    print('Received: ',msg.decode())
    msg=my_socket.recv(1024)

my_socket.close()