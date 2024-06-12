for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==' ')
            {
                fout.write(Character.toUpperCase(s.charAt(i)));
            }
        }