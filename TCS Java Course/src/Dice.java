import java.util.Random;
import java.util.Scanner;
public class Dice
{
    private int dice1, dice2;
    Random rand;
    public Dice()
    {
        dice1 = 0;
        dice2 = 0;
        rand = new Random();
    }
    public void roll()
    {
        dice1 = rand.nextInt(6)+1;
        System.out.println("First Dice: "+dice1);
        dice2 = rand.nextInt(6)+1;
        System.out.println("Second Dice: "+dice2);
    }
    public static void main(String []args)
    {
        Dice d = new Dice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'roll' to roll dice");
        String s = sc.next();
        while(!s.equals("roll"))
        {
            System.out.println("Try again");
            s = sc.next();
        }
        d.roll();
    }
}
