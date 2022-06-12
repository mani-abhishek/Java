import java.util.Scanner;
class bank
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int den[]={1000,500,100,50,20,10,5,2,1};
        System.out.print("Enter any Amount: "); 
        int amount=sc.nextInt();
        if (amount <= 99999)
        {
        int copy=amount; 
        int totalNotes=0,count=0;
 
        System.out.println("\nDENOMINATIONS: \n");
 
        for(int i=0;i<9;i++) 
        {
            count=amount/den[i];
            if(count!=0) 
            {
                System.out.println(den[i]+" x "+count+" = "+den[i]*count);
            }
            totalNotes=totalNotes+count; 
            amount=amount%den[i]; 
        }
            System.out.println("Total Number of Notes\t= "+totalNotes);
        }
        else
        System.out.println("Invalid Output");
    }
}