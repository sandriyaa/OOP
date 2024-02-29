import java.util.Scanner;
class Student
{
public static void main(String arg[])
{
try{
Scanner s=new Scanner(System.in);
System.out.println("Enter the name: ");
String name=s.nextLine();
System.out.println("Enter the department: ");
String dept=s.next();

System.out.println("Enter the Roll No.: ");
int rn=s.nextInt();
System.out.println("Enter the mark: ");
float mark=s.nextFloat();

System.out.println("Name is: " + name);
System.out.println("Roll No is: " + rn);
System.out.println("Department is: " + dept);
System.out.println("Mark is: " + mark);
s.close();
}
catch(Exception w)
{
    System.out.println("Something went wrong.");
}
}
}

