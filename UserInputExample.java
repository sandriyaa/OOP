import java.util.Scanner;
class UserInputExample
{
    int rollno;
    String name;
    float mark;
    void showDetails()
    {
        System.out.println("This is non static method");
        System.out.println("Student Details");
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Mark: "+mark);
    }
    static void show()
    {
        System.out.println("This is static method");
    }
    public static void main(String args[])
    {
        try
        {
            Scanner s=new Scanner(System.in);
            UserInputExample u=new UserInputExample();
            System.out.println("Enter roll no:");
            u.rollno=s.nextInt();
            System.out.println("Enter name:");
            u.name=s.next();
            System.out.println("Enter mark:");
            u.mark=s.nextFloat();
            u.showDetails();
            //Static methods
            u.show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    }
    