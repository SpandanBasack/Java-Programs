class Base{
    void m1()
    {
        System.out.println("Running method of base class.");
    }
}
class derived extends Base{
    void m1()  
    {
        System.out.println("Running method of derived class.");
    }
    public static void main(String[]args)
    {
        Base b = new derived();
        b.m1();
    }
}
