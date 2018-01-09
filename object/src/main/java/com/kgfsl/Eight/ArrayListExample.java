package com.kgfsl.Eight;

import java.util.ArrayList;


class ArrayListExample{
    static ArrayList<Book> li=new ArrayList<Book>();
    public static void main(String args[]){
       
       
        createBook();
        display();

            

    } 
public static void createBook(){
    
    Book b1=new Book(1,"soorya","IT");
    Book b2=new Book(2,"Subha","ECE");

    li.add(b1);
    }

  public static void display(){
    for(Book bo:li)
    {
       System.out.println(bo.id+" "+bo.name+" "+bo.author);
}
 
}
  //}


}