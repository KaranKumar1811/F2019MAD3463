package com.lambton;

public class MainClass {
    public static void main(String[] args) {
        String a="Lambton";

        LambtonStringTools obj1=new LambtonStringTools();
        System.out.println(obj1.reverse(a));

        String name="KaDFran kmsr kUMadAR";
        System.out.println(obj1.initials(name));

        String word="karan kumar";
        System.out.println(obj1.mostFrequent(word));
        System.out.println(obj1.replaceSubString("my name is karan kumar ","His","my"));

    }



}
