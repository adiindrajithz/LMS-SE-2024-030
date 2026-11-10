package lms;

import lms.model.Book;
import lms.model.Member;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0132350884"));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0134685991"));
        library.addBook(new Book("The Pragmatic Programmer", "Hunt & Thomas", "978-0135957059"));

        library.addMember(new Member("M001", "Nadeesha Perera"));
        library.addMember(new Member("M002", "Kasun Silva"));

        library.listBooks();
        library.listMembers();

        try {
            library.addBook(new Book("", "Nobody", "000-0000000000"));
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected invalid book: " + e.getMessage());
        }
    }
}
