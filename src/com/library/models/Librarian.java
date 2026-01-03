package com.library.models;

public class Librarian extends BaseUser{
    public Librarian(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return  "Librarian";
    }
}