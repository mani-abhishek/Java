import java.util.Scanner;
class person
{
    int no;
    person(int no)
    {
        this.no=no;
    }
}
class student extends person
{
    String f_name,l_name;
    int id,sum=0;
    double avg;
    int sco [];
    student(String f_name, String l_name,int id,int no,int sco[])
    {
        super(no);
        this.f_name=f_name;
        this.l_name=l_name;
        this.id=id;
        this.sco=sco;
    }
    char cal()
    {
        for (int i = 0; i < no; i++) {
            sum=sum+sco[i];
        }
        avg=sum/no;
        if (avg>=90&&avg<=100) {
            return 'O';
        }
        else if (avg>=80&&avg<=90) {
            return 'E';
        }
        else if (avg>=70&&avg<=80) {
            return 'A';
        }
        else if (avg>=55&&avg<=70) {
            return 'P';
        }
        else if (avg>=40&&avg<=55) {
            return 'D';
        }
        else
        {
            return 'T';
        }
    }
    void show()
    {
        System.out.println("Name: "+f_name+", "+l_name);
        System.out.println("ID: "+id);
        System.out.println("Grade: "+cal());
    }
}
class score
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String f_name,l_name;
        int id,no;
        f_name=sc.nextLine();
        l_name=sc.nextLine();
        id=sc.nextInt();
        no=sc.nextInt();
        int a[]=new int[no];
        for (int i = 0; i < no && sc.hasNext(); i++) 
        {
            a[i]=sc.nextInt();
        }
        student ob=new student(f_name, l_name, id, no, a);
        ob.show();
    }
}