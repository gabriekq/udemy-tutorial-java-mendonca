import mysql.connector




def delete(id):
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
    sql_statement="delete from emp where id='%d'"
    args=(id)
    try:
     cursor.execute(sql_statement % args)
     connection.commit()
     print('row removed')
    except:
     connection.rollback()
    finally:
     cursor.close()
     connection.close()


emp_id = int(input('enter the id: '))
delete(emp_id)




