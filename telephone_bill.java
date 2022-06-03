import java.util.Scanner;
class detail
{
    String name,add;
    int rent;
    long tel;
    detail(String name,String add,Long tel,int rent)
    {
        this.tel=tel;
        this.name=name;
        this.add=add;
        this.rent=rent;
    }
    void show()
    {
        System.out.println("Name of Customer = "+name);
        System.out.println("Address = "+add);
        System.out.println("Telephone Number = "+tel);
        System.out.println("Monthly Rental = "+rent);
    }
}
class bill extends detail
{
    int n;
    double amt;
    bill(String name,String add,long tel,int rent,int n)
    {
        super(name, add, tel, rent);
        this.n=n;
    }
    void cal()
    {
        if (n>100&&n<201) 
        {
            amt=(n*0.6)+rent;
        }
        else if(n>200&&n<301)
        {
            amt=(n*0.8)+rent;
        }
        else if(n>300)
        {
            amt=(n*1)+rent;
        }
        else
        amt=rent;
    }
    void show()
    {
        cal();
        super.show();
        System.out.println("No. of calls = "+n);
        System.out.println("Amount to be paid = "+"Rs."+amt);
    }
}
class telephone_bill
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,add;
        int rent,n;
        long tel;
        name=sc.nextLine();
        add=sc.nextLine();
        tel=sc.nextLong();
        rent=sc.nextDouble();
        n=sc.nextInt();
        bill ob=new bill(name, add, tel, rent, n);
        ob.show();
    }
}