class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {


        //code here
        B.add(" ");
        String start="";
        for(int i = 0; i < A.length(); i++){
            start += A.charAt(i);
            if(B.contains(start)||start==""){
                String end=A.substring(i+1);
                if(B.contains(end)||end=="")
                {
                System.out.println("End"+ end)
                    return 1; 
                }   
            }
        }
        return 0;
    }

}