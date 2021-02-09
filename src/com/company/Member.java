package com.company;

public class Member {
    private Book[] books = null;

    public Member() {
        this.books = new Book[3];
        for (int i = 0; i < books.length; i++) books[i] = null;
    }

    public void addBook(Book book) {
        if (canAddBook()) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    return;
                }
            }
        }
    }

    private boolean canAddBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) return true;
        }
        return false;
    }
}
