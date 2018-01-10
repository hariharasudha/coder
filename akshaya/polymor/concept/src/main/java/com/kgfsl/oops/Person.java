package com.kgfsl.oops;
abstract class Person{
    protected String present;
    public Person(String present)
    {
        this.present=present;
    }
    public void givepresent()
    {
        System.out.println("Give"+present);
    }
    public void givepresent(String present)
    {
        System.out.println("Give"+present);
    }

} 
