from datetime import date

class Event:

    def __init__(self,start_time,end_time):
        self.start_time=start_time
        self.end_time=end_time
        self.venues=[]


    def addVenue(self,venue):
        self.venues.append(venue)


class Venue:

    def __init__(self,name):
        self.name=name
        self.address_list=[]

    def addAddress(self,address):
        self.address_list.append(address)


class Address():

    def __init__(self,street,city,state,country,zipcode):
        self.street=street
        self.city=city
        self.state=state
        self.country=country
        self.zipcode=zipcode


addres=Address(street='abc ste',city='sorocaba',country='brazil',zipcode=123456,state='sp')

venue=Venue('roon1')
venue.addAddress(addres)
event=Event(date(2001,2,5),date(2001,2,5))
event.addVenue(venue)
event.addVenue(venue)


for venue in event.venues:
    for addres in venue.address_list:
        print(addres.street)

