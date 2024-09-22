import urllib.request

try:
    url = urllib.request.urlopen("https://www.python.org/")
    content = url.read()
except urllib.error.HTTPError:
    print('Web page not found')
    exit()


file= open('python.html','wb')
file.write(content)
file.close()
