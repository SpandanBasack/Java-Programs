import java.util.Random;
public class Coin {
    private int faceup;
    Random rand = new Random();;
    public Coin() {
        flip();
    }

    public void flip() {
        faceup = rand.nextInt(2);
    }

    public String getFaceUp() {
        if (faceup == 0)
            return "HEADS";
        else if (faceup == 1)
            return "TAILS";
        else
            return "INVALID";
    }

    public static void main(String[] args)
    {
        Coin c = new Coin();
        System.out.println("Initial: "+c.getFaceUp());
        for(int i=0; i<10; i++)
        {
            c.flip();
            System.out.println("Flip "+i+": "+c.getFaceUp());
        }
    }
}

