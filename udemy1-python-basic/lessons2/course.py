class Course:

    def __init__(self,name,ratings):
        self.name=name
        self.ratings=ratings

    def average(self):
        number_of_ratings=len(self.ratings)
        average= sum(self.ratings)/number_of_ratings
        print('average rates is ',average)
