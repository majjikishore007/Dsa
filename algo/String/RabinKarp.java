public class Solution {
    int d= 256;
    public static void getAns(String str ,String patern,int prime){
        int M=patern.length();
        int N=str.length();

        int i, j;
        int p = 0; 
        int t = 0; 
        int h = 1;

        // calculating the h value for

        for (i=0;i<M;i++){
            h=(h*d)%prime;

        }
        // calculating the the hash 

        for (i=0;i<M;i++){
            p=(p*d+patern.charAt(i))%prime;
            t=(t*d+str.charAt(i))%prime
        }

        for (i=0;i<N-Mi++){
            if(p==t){
                // compare the char of each string 
                 for (j = 0; j < M; j++)
                {
                    if (str.charAt(i+j) != patern.charAt(j))
                        break;
                }
                if (j == M){
                    System.out.println("Pattern found at index " + i);
                }
            }
        }        
        if ( i < N-M ){
            // calculating the next window lenght
               t = (d*(t - str.charAt(i)*h) + str.charAt(i+M))%q;
                if (t < 0){
                t = (t + q);
                }
        }

    }
    public static void main(String[] args) {

    }
}