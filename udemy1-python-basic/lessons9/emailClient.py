import smtplib
from email.mime.text import MIMEText

body = "This is a test email"

msg=MIMEText(body)
msg['from']='gabrielmendk747@gmail.com'
msg['To']='gabrielmendk747@gmail.com'
msg['Subject']='Hello'

server=smtplib.SMTP('smtp.gmail.com',587)
server.starttls()
server.login('gabrielmendk747@gmail.com','24+m2c4852+24')

server.send_message(msg)
print('mail sent')
server.quit()




