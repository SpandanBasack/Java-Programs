import java.io.*;
public class FIleCopy {
    public static void main(String[]args)throws IOException
    {
        try{
            FileOutputStream fout = new FileOutputStream("file2.txt");
            int b;
            FileInputStream fin = new FileInputStream("file1.txt");
            while((b=fin.read())!=-1)
        {
            System.out.print((char)b);
            fout.write((char)b);
        }
        fin.close();
        }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
