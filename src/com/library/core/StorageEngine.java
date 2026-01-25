package com.library.core;

import java.io.*;
import java.util.Objects;

public class StorageEngine<T extends Serializable> {
    private final String path = "src/com/library/core/db";
    private final File file;
    private final String ext = ".obj";

    public StorageEngine() {
        file = new File(path);

        if (!file.exists()) {
            boolean isCreated = file.mkdir();
            if (isCreated) {
                System.out.println("db initialized");
            } else {
                System.out.println("Failed to initialize db");
            }
        }
    }

    public void store(T object, String name) {
        String fullPath = file.getAbsolutePath() + "/" + name + ext;
        try (FileOutputStream fos = new FileOutputStream(fullPath);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(object);
            out.flush();
            out.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void query() {
        if(Objects.requireNonNull(file.list()).length == 0) {
            System.out.println("Empty");
        } else {
            for (String obj : Objects.requireNonNull(file.list())) {
                System.out.println(obj);
            }
        }
    }
}
