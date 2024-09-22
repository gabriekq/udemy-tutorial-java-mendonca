from pymongo import MongoClient

client=MongoClient('192.168.99.100',27017,username='gabriel',password='gabriel')


database=client['products']
collection = database['product']

print(collection.find_one())

cursor=collection.find({"name":"Dell"})
for eac_doc in cursor:
    print(eac_doc)

