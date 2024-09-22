from pymongo import MongoClient

client=MongoClient('192.168.99.100',27017,username='gabriel',password='gabriel')


database=client['products']
collection = database['product']


product={
  "name":"Iphone",
  "price":1000
}

result = collection.insert_one(product)
print(result.inserted_id)