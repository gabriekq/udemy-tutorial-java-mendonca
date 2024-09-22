
import socket

my_socket=socket.socket()

my_socket.connect(('localhost',6767))

file_name=input('enter a file name: ')

my_socket.send(file_name.encode())

content=my_socket.recv(1024)
print(content.decode())


my_socket.close()