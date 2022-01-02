'''You are given a 0-indexed binary string s and two integers minJump and maxJump. In the beginning, you are standing at index 0, which is equal to '0'. You can move from index i to index j if the following conditions are fulfilled:

    i + minJump <= j <= min(i + maxJump, s.length - 1), and
    s[j] == '0'.

'''

def can_reach(s,minJ,maxJ):

    i=0
    j=0
    l=len(s)-1
    while(j<=l):

        if i + minJ <= j and j <= min(i + maxJump, l) and s[j] == '0':

            i=j

        if i==l:
            return True

    return False

     
