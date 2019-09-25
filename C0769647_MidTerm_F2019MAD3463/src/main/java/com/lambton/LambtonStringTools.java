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

    public static String initials(String s){
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
}
