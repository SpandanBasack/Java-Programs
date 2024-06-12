public class e_handling {
      public static void main(String [] args)
      {
        int n;
        int arr[] = new int[10];
        try
        {
            n = 100/0;
            arr[100] = 10;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
      }    
}
