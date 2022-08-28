


def top_t_words(words,t):
    dict = {}
    for i in range(len(words)):
       if dict.get(words[i]) == None and words.count(words[i])>1 :
        dict[words[i]] = words.count(words[i])
    
    list=[]
    for i in sorted(dict.keys()):
        list.append(i)
    print(list[:t])



if __name__ =="__main__":
    words = ['i','love','i','ibm','i','code','love']
    # words.sort()
    top_t_words(words,2)
    