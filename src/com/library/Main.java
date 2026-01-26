package com.library;

import com.library.core.StorageEngine;
import com.library.models.Book;

import java.util.Date;
import java.util.Scanner;

public class Main {
    private static boolean exit = false;

    public static void main(String[] args) {
        StorageEngine<Book> storageEngine = new StorageEngine<>();

//        storageEngine.store(book, book.getTitle());
//        System.out.println("=== All books ===");
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Please Store a new Book ===");
//        storageEngine.query();
//        String bookTitle = scanner.nextLine();
//        String bookDescription = scanner.nextLine();
//
//        Book book = new Book(new Date().getTime(), bookTitle, bookDescription);
//        storageEngine.store(book, bookTitle);

        System.out.println("Welcome to library");
        while (!exit) {
            System.out.println("------------------");
            System.out.println("Enter help for documentations");
            System.out.print("> ");
            String command = scanner.nextLine();
            if (command.equals("help")) {
                System.out.println("- add: To store new book");
                System.out.println("- list: To list all books");
                System.out.println("- exit: To exit out");
            } else if (command.equals("add")) {
                System.out.print("Title: > ");
                String title = scanner.nextLine();
                System.out.print("Description: > ");
                String description = scanner.nextLine();

                Book book = new Book(new Date().getTime(), title, description);
                storageEngine.store(book, title);
            } else if (command.equals("list")) {
                System.out.println("==== List ====");
                storageEngine.query();
                System.out.println("==== List ====");
            } else if (command.equals("exit")) {
                exit = true;
            }
        }

        System.out.println("Closing...");
        scanner.close();
    }

}
