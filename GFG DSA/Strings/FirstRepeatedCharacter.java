//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    char firstRep(String S) {
        // your code here
        int i;
        for(i = 0; i<S.length(); i++)
        {
            if(S.lastIndexOf(S.charAt(i))==i)
                continue;
            else
                break; 
        }
        if(i == S.length())
            return '#';
        else
        return S.charAt(i);
    }
}