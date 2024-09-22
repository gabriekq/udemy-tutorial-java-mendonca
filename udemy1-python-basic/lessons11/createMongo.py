from pymongo import MongoClient

client=MongoClient('192.168.99.100',27017,username='gabriel',password='gabriel')


database=client['products']
collection = database['product']

products=[{
  "name":"Iphone",
  "price":1000
},{
    "name":"Mac book",
    "price":2000
},{
    "name": "Dell",
    "price": 1500
}
]

result = collection.insert_many(products)
print(result.inserted_ids)