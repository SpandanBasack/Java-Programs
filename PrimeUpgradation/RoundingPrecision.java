public class RoundingPrecision
{
    public static void main(String[]args)
    {
        double n = 123.444576;
        int precision = 3;
        double scale = Math.pow(10, precision);
        double rounded_n = Math.round(n*scale)/scale;
        System.out.println(rounded_n);
    }
}