import java.util.Scanner;
class Mul_Class
{
    public static void main(String args[])
    {
        Test t=new Test();
        t.Accept();
        t.display();
     }
    
}

class Test
{  int x,y;
    Scanner s=new Scanner(System.in);
    void Accept()
    {
        System.out.println("Enter no: ");
        x=s.nextInt();
        System.out.println("Enter no: ");
        y=s.nextInt();
    }
    void display()
    {
      System.out.println("The product of two nos is: "+(x*y));  
    }
}
        