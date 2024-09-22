from pymongo import MongoClient

client=MongoClient('192.168.99.100',27017,username='gabriel',password='gabriel')


database=client['products']
collection = database['product']

filter = {"name":"Iphone"}
result_count=collection.update_many(filter,{"$set":{"price":2222}})
print(result_count)