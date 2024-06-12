/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author KIIT
 */
import java.util.*;
class plate
{
    int length, width;
    static Scanner sc = new Scanner(System.in);
    plate()
    {
        System.out.println("Enter the length: ");
        length = sc.nextInt();        
        System.out.println("Enter the width: ");
        width = sc.nextInt();
    }
}
class box extends plate
{
    int height;
    box()
    {
        System.out.println("Enter the height: ");
        height = sc.nextInt();        
    }
}
public class woodbox extends box
{
    /**
     * @param args the command line arguments
     */
    int thick;
    woodbox()
    {
        System.out.println("Enter the thickness:");
        thick = sc.nextInt();
    }
    void volume()
    {
        int area = thick*length*width*height;
        System.out.println("Area = "+area);
    }
    public static void main(String args[]) {
        // TODO code application logic here
        woodbox ob = new woodbox();
        ob.volume();
    }
}
