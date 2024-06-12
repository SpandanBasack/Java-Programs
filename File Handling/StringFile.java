import java.io.*;

import javax.swing.plaf.basic.BasicTabbedPaneUI;
class StringFile
{
    public static void main(String[] args)throws IOException
    {
        FileOutputStream fout = new FileOutputStream("file3.txt");
        String s = "ABC";
        byte arr[]=s.getBytes();
        char ch;
        System.out.println(arr[]);
        for(int i = 0; i<s.length(); i++)
        {
            ch = s.charAt(i);
            fout.write(ch);
        }
        fout.close();          
    }
}