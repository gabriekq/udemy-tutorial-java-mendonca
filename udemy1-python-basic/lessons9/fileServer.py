
import socket

host='localhost'
port=6767

my_socket=  socket.socket(socket.AF_INET,socket.SOCK_STREAM)

my_socket.bind((host,port))
my_socket.listen(1)
print('Server listening on port ',port)
connection,addr = my_socket.accept()

file_name = connection.recv(1024)

try:
    file=open(file_name,'rb')
    content = file.read()
    connection.send(content)
    file.close()
except FileNotFoundError:
    print('File does not exist')
    connection.send(b'File Does not exist')

connection.close()