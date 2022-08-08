""" 
There is an old bridge over river Ganga. Four people wants to cross the bridge at night. 
Many plants are missing, and the bridge can hold only two people at a time (any more than two, and the bridge collapses). 
The travellers must use a torch to guide their steps; otherwise they’re sure to step through a missing space and fall to their death. There is only one torch. 
The four people each travel at different speeds. Sharukh can cross the bridge in one minute; 
Aamir in two minutes; Salman takes five minutes; and the slowest person, Saif, takes ten minutes. 
The bridge is going to collapse in exactly seventeen minutes. How can all four people cross the bridge? 

"""


def solve(l):
    ans=0
    list = []
    while(len(l)>=2):
        list.append(l[0])
        list.append(l[1])
        ans = ans+max(l[0],l[1])

        if(len(l)>2):
            l.insert(len(l),min(list))

            ans = ans+min(list)
            list.remove(min(list))
        
        l.remove(l[0])
        l.remove(l[0])

    print("Total Time =",ans)
   
            

if __name__ == "__main__":
    l = [1,2,7,10,13,15];
    solve(l)