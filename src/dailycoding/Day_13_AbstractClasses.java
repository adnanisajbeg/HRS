package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_13_AbstractClasses {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyBook myBook = new MyBook(in.nextLine(), in.nextLine(), in.nextInt());
        in.close();
        myBook.display();
    }

    static abstract class Book {
        String title;
        String author;

        Book(String t, String a) {
            title = t;
            author = a;
        }

        abstract void display();
    }

    static class MyBook extends Book {
        int price;
        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }
}
