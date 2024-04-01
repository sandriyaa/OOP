class A
{
    int x=12;
    void show()
    {
        System.out.println("The value of x is:"+x);
    }
}
    class B extends A
    {
        int y=10;
        void show()
        {    super.show();
            System.out.println("The value of y="+y);
        }
    }
class inherit
{
    public static void main(String args[])
    {
        B b=new B();
        b.show();
        
        
    }
    
}
    