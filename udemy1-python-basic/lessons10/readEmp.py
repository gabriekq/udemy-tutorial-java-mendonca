import mysql.connector


connection = mysql.connector.connect(
  host='192.168.99.100',
  user='root',
  password='password',
  port=3306,
  database="sys"
)

if connection.is_connected():
    print("Connect to mysql")

cursor = connection.cursor()
cursor.execute('select * from emp;')
# row = cursor.fetchone()
#
# while row is not None:
#     print(row)
#     row=cursor.fetchone()

rows=cursor.fetchall()
print('Total Number of records ',cursor.rowcount)

for row in rows:
    print(row)

cursor.close()
connection.close()



