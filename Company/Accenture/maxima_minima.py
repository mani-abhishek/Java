from math import sqrt


def solve(a,b,c):
    d = (b**2) - (4*a*c)
    s = sqrt(d)
    sol1 = (-b-s)/(2*a)  
    sol2 = (-b+s)/(2*a)  
    print(sol1,sol2)

    a1 = (a * (sol1**2))+(b*sol1)+c
    a2 = (a * (sol2**2))+(b*sol2)+c

    print(int(a1),int(a2))



if __name__=="__main__":
    a=1
    b=2
    c=1
    solve(a,b,c)