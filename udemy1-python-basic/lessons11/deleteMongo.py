from pymongo import MongoClient

client=MongoClient('192.168.99.100',27017,username='gabriel',password='gabriel')


database=client['products']
collection = database['product']

collection.delete_one({"name":"Dell"})

result=collection.delete_many({"name":"Iphone"})
print(result)