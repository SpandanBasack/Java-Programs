//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i,j;
        for(i = 0, j = s.length()-1; i<s.length(); i++, j--)
        {
            if(i == j)
                break;
            if(s.charAt(i) == s.charAt(j))
                continue;
            else
                return false;
        }
        return true;
    }
}