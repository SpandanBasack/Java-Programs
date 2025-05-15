public class lambdaTest
{
    public static void main(String[]args)
    {
        stringReturn s = () -> "Hello";
        System.out.println(s.returnString());
    }
}
