
import string


class Item:
    def __init__(self, value, weight):
        self.value = value
        self.weight = weight  

def fractionalKnapsack(W, arr):
    arr.sort(key=lambda x: (x.value/x.weight), reverse=True)
    print(arr[0].value)
    finalvalue = 0.0
    for item in arr:

        
        if item.weight <= W:
            W -= item.weight
            finalvalue += item.value

        
        else:
            finalvalue += item.value * W / item.weight
            break

    return finalvalue



if __name__ == "__main__":
    w1 = int(input())
    w2 = int(input())
    w3 = int(input())
    v1 = int(input())
    v2 = int(input())
    v3 = int(input())
    w  = int(input())
    arr = [Item(v1, w1), Item(v2, w2), Item(v3, w3)]
    max_val = fractionalKnapsack(w, arr)
    print(format(max_val))
    
    
""" 
20
30
10
100
120
60
50
 """