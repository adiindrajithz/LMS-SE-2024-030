package lms;

import lms.model.*;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Book("B001", "Clean Code", "Robert C. Martin"));
        library.addItem(new Book("B002", "Effective Java", "Joshua Bloch"));
        library.addItem(new Book("B003", "The Pragmatic Programmer", "Hunt & Thomas"));

        library.addMember(new Student("M001", "Nadeesha Perera"));
        library.addMember(new Student("M002", "Kasun Silva"));

        library.listItems();
        library.listMembers();
    }
}

