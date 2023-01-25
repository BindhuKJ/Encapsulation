package org.capgemini.encapsulation.wp;

public class BookApp {

    public static void main(String[] args){
        Book  b1;
        b1 = new Book();
        b1.setPages(100);
        int y=b1.getPages();
        System.out.println(y);

    }
}