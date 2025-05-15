import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Car myCar = new Car(19, "WB03K5404", Color.blue, true);
//        Car otherCar = new Car(15.5, "WB04K5704", Color.black, true);
//        System.out.println("My car's license plate no: " + myCar.licensePlateNumber);
//        System.out.println("My other car's license plate no: " + otherCar.licensePlateNumber);
//        System.out.println(myCar.paintColor);
//        myCar.changePaintColor(Color.red);
//        System.out.println(myCar.paintColor);
//        Scanner sc = new Scanner(System.in);
//        int Number = sc.nextInt();
//        System.out.println(Number);
//        double Decimal = sc.nextDouble();
//        System.out.println(Decimal);
//        String userInput = sc.next();
//        String upperCase = userInput.toUpperCase();
//        System.out.println(userInput);
//        System.out.println(upperCase);
//        System.out.println("Contains: "+userInput.contains("Enter".toLowerCase()));
//        int[] numbers = {4,5,6,7,8};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);
//        System.out.println(Array.get(numbers, 2));
//        double speed = 50;
//        System.out.println(speed);
//        speed = myCar.speedUp(speed);
//        System.out.println(speed);
//        Dog dg = new Dog(Color.black, "tommy", "Labrador");
//        dg.bark();
//        dg.howl();
//        dg.changeName("Tubby");
//        System.out.println(dg.name);
//          Random rand = new Random();
//          int r = rand.nextInt();
//          int r_bound = rand.nextInt(10);
//          System.out.println(r);
//          System.out.println(r_bound);
        Cat cat = new Cat();
        Pet dog = new Dog(Color.black, "Roger", "gsd");
        cat.play();
        dog.play();
    }
}