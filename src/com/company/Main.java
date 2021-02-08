package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public class Book{
        String name, authorName;
        public Book(String name, String authorName){
            this.name = name;
            this.authorName = authorName;
        }
    }

    public abstract class Librarian{
        abstract void add(Book book);
    }

    public abstract class Guest{
        abstract void seeBook(Book book);
    }

    public class Member{
        Book[] books = new Book[3];
    }

    public class User{
        int login;
    }
}
