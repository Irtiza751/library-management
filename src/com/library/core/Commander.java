package com.library.core;

import com.library.exceptions.ExitException;
import com.library.exceptions.InvalidCommandException;

public class Commander {
    private boolean exit = false;

    public void execute(String command) throws InvalidCommandException {
        switch (command) {
            case "add":
                System.out.println("Adding new book...");
                break;
            case "update":
                System.out.println("Updating a book");
                break;
            case "delete":
                System.out.println("Deleting a book");
                break;
            case "read":
                System.out.println("Reading a book");
                break;
            case "list":
                System.out.println("List of books");
                break;
            case "exit":
                exit = true;
                throw new ExitException("Quiting app...");
            default:
                throw new InvalidCommandException("Invalid command " + command);
        }
    }

    public boolean getExit() {
        return exit;
    }
}
