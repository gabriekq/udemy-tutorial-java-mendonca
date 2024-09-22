from abc import abstractmethod,ABC

class TouchScreenLaptop(ABC):

    def __init__(self):
        print('abs createc')


    @abstractmethod
    def scroll(self):
        pass

    @abstractmethod
    def click(self):
        pass


class DELL(TouchScreenLaptop):

    def __init__(self):
        super().__init__()
        print('object Dell created')

    def scroll(self):
        print('scroll dell')

    def click(self):
        pass


class HP(TouchScreenLaptop):

    def __init__(self):
        super().__init__()
        print('object HP created')

    def scroll(self):
        print('scroll hp')

    def click(self):
        pass


class HPNotebook(HP):

    def __init__(self):
        super().__init__()

    def click(self):
        print('click HPNotebook')


class DELLNotebook(DELL):

    def __init__(self):
        super().__init__()

    def click(self):
        print('click DELLNotebook')


dell = DELL()
hp=HP()

hpnotebook = HPNotebook()
hpnotebook.click()

dell_Notebook = DELLNotebook()
dell_Notebook.click()