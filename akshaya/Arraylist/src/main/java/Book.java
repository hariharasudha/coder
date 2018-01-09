import java.util.ArrayList;

import java.util.*;  
 class Book {  
int id;  
String name,author; 
public Book(int id, String name,String author){
    this.id=id;
    this.name=name;
    this.author=author;
}
}
 class ArrayListExample{
    public static void main(String args[]){
        List<Book> li=new ArrayList<Book>();
        Book b1=new Book(1,"soorya","IT");
        Book b2=new Book(2,"Subha","ECE");

        li.add(b1);
        li.add(b2);
         
        for(Book bo:li)
        {
            System.out.println(bo.id+" "+bo.name+" "+bo.author);
        }


    }

}