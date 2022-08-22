def solve(str):
    str = str.replace("A", "&")
    str = str.replace("B", "|")
    str = str.replace("C", "^")
    return eval(str)
    print(str)
    ans = eval(str)
    print(type(ans))


if __name__== "__main__":
    s = "1C0C1C1A0B1"
    solve(s)