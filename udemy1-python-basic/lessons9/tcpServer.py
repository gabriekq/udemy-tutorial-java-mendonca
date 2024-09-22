
import socket

host='localhost'
port=4000

my_socket=  socket.socket(socket.AF_INET,socket.SOCK_STREAM)

my_socket.bind((host,port))
my_socket.listen(1)
print('Server listening on port ',port)
connection,addr =my_socket.accept()

print('connection from ',str(addr))

connection.send(b"Hello how are you")
connection.send("bye".encode())
connection.close()