package com.kgfsl.oops;

public class PolyTest
{
    public static void  main(String[] args) {
        Person santa=new Santaclaus("Jet-pack");
        santa.givepresent();
        new Santaclaus("Rocket Launcher").givepresent("Little Duck");
    }
}