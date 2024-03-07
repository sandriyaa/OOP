class Con_Ex
{
int x;
String y;
Con_Ex()
{
    x=20;
    y="xyz";
    System.out.println(x);
    System.out.println(y);

}
void display()
{
    System.out.println(x);
    System.out.println(y);

}

}
class Test
{
    public static void main(String args[])
    {
        Con_Ex ce=new Con_Ex();
        ce.display();
    }
}
