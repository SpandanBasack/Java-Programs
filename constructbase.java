class base
{
    base(int a, int b)
    {
        System.out.println("The numbers are: "+a+" & "+b);
    }
}
class constructbase extends base
{
    constructbase()
    {
        super(2,3);
    }
    public static void main(String[]args)
    {
        constructbase ob = new constructbase();
    }
}