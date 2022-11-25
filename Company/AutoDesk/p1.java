public class p1{
    public static void main(String[] args) {
        String[] arr = {"Daisy","Rose","Hyacinte","Poppy"};
        String output= fun(arr);

        String res = "DRHPaoyoisapsecpyiynte";
        if(output.equals(res)) System.out.println("Passed");
        else System.out.println("Failed");
    }

    private static String fun(String[] arr) {
        String res="";
        String temp;
        int len=arr.length;
        int size=0;
        for(int i=0;i<len;i++){
            size=size+arr[i].length();
        }

        int ind=0;
        while(size>0){
            for(int i=0;i<len;i++){
                temp = arr[i];
                if(ind>=temp.length()) continue;
                res=res+temp.charAt(ind);
                size--;
            }
            ind++;
        }

        return res;
    }
}