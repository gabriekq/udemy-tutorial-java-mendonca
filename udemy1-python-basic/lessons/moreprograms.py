
my_string = 'gabriel'  #input('Enter a string: ')
print(my_string[::-1])

index_reverse = len(my_string)-1
result =''

while index_reverse>=0:
    result=result+my_string[index_reverse]
    index_reverse=index_reverse-1

print(result)

my_string_2='-'.join(['a','b','c'])
my_string_3='joao'

print(my_string_2)
print(''.join(reversed(my_string_3)))

my_name='All the power is with in you'
result_names=[]

names = my_name.split(' ')
names_lenght=len(names)-1

while names_lenght >= 0:
    result_names.append(names[names_lenght])
    names_lenght=names_lenght -1

print(' '.join(result_names))

my_name_2='Python is cool'
my_list=my_name_2.split()
result_names=[]

for words in my_list:
    reversed_word=''.join(reversed(words))
    result_names.append(reversed_word)

print(result_names)
print(' '.join(result_names))

## remove duplicate char

my_duplicate_text='abcccaaazzzccctttyyy'
temp=[]

for letter in my_duplicate_text:
    if letter not in temp:
        temp.append(letter)

print(''.join(temp))

## count caracters

my_text='aaaaabbbbiioollkkqqweasdddd'
my_dictionary={}

for letter in my_text:
    if letter in my_dictionary.keys():
        my_dictionary[letter] = my_dictionary[letter]+1
    else:
        my_dictionary[letter]=1


for key, value in my_dictionary.items():
    print('{}={} times'.format(key,value))
    #print('key: ',key,' value: ',my_dictionary.get(key))

