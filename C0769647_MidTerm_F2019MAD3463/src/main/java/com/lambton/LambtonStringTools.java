package com.lambton;

public class LambtonStringTools {
    public static String reverse(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
    return rev;
    }

    public static String initials(String s)
    {
        String initial="";
        String[] PartsofName=s.split(" ");
        char ini;
        if(PartsofName.length!=3)
        {
            return null;
        }
        else {


            for (int i = 0; i < PartsofName.length; i++) {
                if(i!=2)
                {
                    ini = PartsofName[i].charAt(0);
                    initial = initial + ini +".";
                    initial = initial.toUpperCase();
                }
                else
                {
                    for(int j=0;j<1;j++) {
                        ini = PartsofName[2].charAt(j);
                        initial += ini;
                        initial = initial.toUpperCase();
                    }
                    for(int z=1;z<PartsofName[2].length();z++)
                    {
                            ini = PartsofName[2].charAt(z);
                        initial = initial + Character.toLowerCase(ini);
                            initial=initial;
                    }
                }
            }

            return (initial);
        }
    }



    public char[] mostFrequent (String str)
    {
        int temp = 0;
        int count = 0;
        int current = 0;
        char[] fchar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                char ch1 = str.charAt(j);
                if (ch != ch1) {

                    count++;
                }
            }
            if (count > temp) {
                temp = count;
                current++;
            }
        }
        return fchar;
    }


    public static String replaceSubString(String s1,String s2, String s3)
    {
        int i = s3.indexOf(s1);
        if (i<0)
        {
            return s3;
        }


        String prevst = s3.substring(0, i);

        String afst  = s3.substring(i + s1.length());

        return prevst + s2 + afst;
    }


}
