import java.util.*;
public class FuelConsumption
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of fuel in the truck:");
        int q = sc.nextInt();
        System.out.println("Enter the distance covered until the tank goes dry:");
        int d = sc.nextInt();
        if(q<=0 || d<=0)
            System.out.println("Invalid Input");
        else
        {
            double m = q*(0.2642);
            double g = d*(0.6214);
            double lk100 = q/d * 100;
            double mg =  m/g;
            System.out.println("Liters/100KM: "+lk100);
            System.out.println("Miles/Gallon: "+ mg);
        }       
    }
}