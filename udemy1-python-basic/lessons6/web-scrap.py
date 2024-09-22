import re
import urllib.request

sites=['google.com','uol.com']

for site in sites:
    print('searching',site)
    response=urllib.request.urlopen('http://'+site)
    text=response.read()
    title=re.findall('<title>.*</title>',str(text),re.I)
    print(title[0])
