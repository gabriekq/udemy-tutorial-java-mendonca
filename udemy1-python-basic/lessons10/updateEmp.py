import mysql.connector

def update(id,salary):
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
    sql_statement="update emp SET salary='%d' where id='%d'  "
    args=(salary,id)
    try:
     cursor.execute(sql_statement % args)
     connection.commit()
     print('row updated')
    except:
     connection.rollback()
    finally:
     cursor.close()
     connection.close()


emp_id,salary_emp = input('enter the id and salary: ').split()
print('id ',emp_id,' salary ',salary_emp)
update(int(emp_id),int(salary_emp))

## my_numbers_list = [int(index) for index in input('enter your numbers ').split(",")]




