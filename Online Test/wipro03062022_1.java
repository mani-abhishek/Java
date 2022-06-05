public class wipro03062022_1 {
    public static void main(String[] args) 
    {
        String str1="",str2="";
        int x =3 ;
        switch (x) {
            case 1:
                str1 = "ACZa";
                str2 = "CAZa";
                break;
            case 2:
                str1 = "tbGB";
                str2 = "tGBb";
                break;
            case 3:
                str1 = "lLkQwfg";
                str2 = "QwlLkfg";
                break;
        
            default:
                break;
        }

        String result = fun(str1,str2);
        System.out.println(result);
        
    }
    public static String fun(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        if
        
        int mis=0,D=0,I=0;
        for (int i = 0; i < len1; i++) {
            char c = str1.charAt(i);
            int ch =  (int) c;
            // System.out.println(c+":"+ch);
            if(i<len1-1){
                
                int ch1 =  (int) str1.charAt(i);
                // System.out.println(str1.charAt(i)+":"+ch1);
                System.out.println(i);
                System.err.println(ch1);
                



                int ch2 =  (int) str1.charAt(i+1);
                // System.out.println(":"+ch2);
                // System.out.println(i);
                // System.out.println(str1.charAt(i)+":"+ch1+","+str1.charAt(i+1)+":"+ch2 );

                System.out.println(i+1);



                System.out.println("-----------------");
                if(ch1>ch2)
                D++;
                else if(ch1<ch2)
                I++;
                
            }
            if(str1.charAt(i)!= str2.charAt(i))
            mis++;
            
            
        }
        System.out.println("D="+D);
        System.out.println("I="+I);
        if(D==0)
        return "Increasing"+":"+Integer.toString(mis);
        else if(I==0)
        return "Decreasing:"+Integer.toString(mis);
        else
        return "Invalid";
        // System.out.println(res+":"+Integer.toString(mis));
    }
}