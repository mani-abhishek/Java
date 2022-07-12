class distance
{
     public static void main(String []args)
          {
             //System.out.println("Enter a Distance");
             float dis=Float.parseFloat(args[0]);
             float m,f,inch;
             m=dis*1000;
             f=dis*3280.84f;
             inch=dis*39370.1f;
             System.out.println("Entered Distance Between two city ="+dis);
             System.out.println("Distance in Metre :"+m);
             System.out.println("Distance In Feet :"+f);
             System.out.println("Distance in Inch :"+inch);
          }
}
