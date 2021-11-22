NO_OF_CHAR=256

def get_duplicates(s,count):
    for i in s:
        count[ord(i)]+=1

    return count



def main():
    s=input("Enter the String")
    count=[0]*NO_OF_CHAR
    count=get_duplicates(s,count)
    dup=0
    for i in count:
        if i>1:
            dup+=1
        
    print("Duplicats",dup)

main()
