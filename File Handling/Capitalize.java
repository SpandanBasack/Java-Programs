import java.io.*;
public class Capitalize 
{
    public static void main(String[] args) throws Exception{
        FileReader fin = new FileReader("caps.txt");
        String s = "";
        int c;
        while((c = fin.read())!=-1)
        {
            s = s+(char)c;
        }
        fin.close();
        FileWriter fout = new FileWriter("caps.txt");
        fout.write(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==' ')
            {
                fout.write(Character.toUpperCase(s.charAt(i)));
            }
            else
            fout.write(s.charAt(i));
        }
        System.out.println("Update Complete");
        fout.close();
    }    
}
