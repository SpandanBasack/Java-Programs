import java.util.Scanner;
class Studentdata
{
    int roll;
    double cgpa;
    String name;
    static double minimum;
    static int minimum2;
    static Scanner sc = new Scanner(System.in);
    Studentdata()
    {
        System.out.println("Enter the roll no. of the Student:");
        roll = Integer.parseInt(sc.nextLine());  
        System.out.println("Enter the cgpa of the Student:");
        cgpa = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the name of the Student:");
        name = sc.nextLine();     
    }
    void min(double c,int i)
    {
        if(c<minimum)
        {
            minimum = c;
            minimum2 = i;    
        }
    }
    public static void main(String[]args)
    {
        int n;
        System.out.println("Enter the no. of student for whom data is to be accepted:");
        n = Integer.parseInt(sc.nextLine());
        Studentdata ob[] = new Studentdata[n];
        for(int i =0;i<n;i++)
        {
            ob[i] = new Studentdata();
            if(i==1)
            minimum = ob[i].cgpa;
            else
            ob[i].min(ob[i].cgpa, i);
        }
        System.out.println("The Student with the lowest cgpa is: "+ob[minimum2].name);
        sc.close();
    } 
}
