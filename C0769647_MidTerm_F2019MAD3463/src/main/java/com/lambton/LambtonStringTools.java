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
}
