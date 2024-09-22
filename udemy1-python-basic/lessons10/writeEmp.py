
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
try:
    cursor.execute("INSERT INTO emp VALUES(3,'mendonca',3000);")
    connection.commit()
    print('row added')
except:
    connection.rollback()
finally:
    cursor.close()
    connection.close()
