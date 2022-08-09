




if __name__=="__main__":
    n = int(input())
    word = input()
    dict = {}
    for i in range(n):
        s = input()
        dict[s.count(word)] = s
    print("-------------------------------")
    for i in sorted(dict.keys()):
        print(dict[i])
