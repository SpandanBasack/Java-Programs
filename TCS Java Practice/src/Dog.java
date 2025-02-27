import java.awt.*;
public class Dog implements Pet
{
    Color col;
    String name;
    String breed;
    public Dog(Color col, String name, String breed)
    {
        this.col = col;
        this.name = name;
        this.breed = breed;
    }
    public void bark()
    {
        System.out.println("bark");
    }
    public void howl()
    {
        System.out.println("howl");
    }
    public void changeName(String name)
    {
        this.name = name;
    }
    public void play()
    {
        System.out.println("The Dog plays");
    }
}
