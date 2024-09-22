
word = input('Enter a word: ')
vowels={'a','e','i','o','u'}
results = {}

for c in word:
    if c in vowels:
        results[c]=results.get(c,0)+1

for key,value in sorted(results.items()):
    print(key,"is present",value," times")