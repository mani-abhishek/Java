
def count(data,word):
    c=0
    data = data.split(" ")
    for i in range(0,len(data)):
        if(data[i]==word):
            c=c+1
    return c  

def solve(dict,data,word,n):
    # print(dict)
    for i in sorted(dict.keys()):
        # print(i) 
        print(dict[i])


if __name__== "__main__":
    # n = int(input())
    # word = input()
    # data = []
    # dict = {}
    # for i in range(n):
    #     data.append(input())
    #     dict[data[i]] = count(data[i],word)

    n = 3
    word = 'python'
    data = ['i like to code in python','python is named after a show named monty python and not after snake python','i think python is good i think python is more important than php']
    dict = {}
    for i in range(n):
        temp = count(data[i],word)
        # print(temp,end=' ')
        # print(data[i])
        dict[temp] = data[i]
    solve(dict,data,word,n)
