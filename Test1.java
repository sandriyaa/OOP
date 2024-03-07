//parameterized constructor
class Con_Ex
{
    int x;
    String y;
    Con_Ex(int a,String b)
    {
        x=a;
        y=b;
        int la=a;
        String lb=b;;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
        
    }
}
    class Test1
    {
        public static void main(String args[])
        {
            Con_Ex ce=new Con_Ex(15,"ABC");
            ce.display();
        }
    }   