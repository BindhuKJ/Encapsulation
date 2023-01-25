package org.capgemini.encapsulation.wp;

public class Book {
    private int pages =100;
    public void setPages(int x){
         if (x>0)
             pages=x;

    }
    public int getPages(){
        return pages;
    }
}
