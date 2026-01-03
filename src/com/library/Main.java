package com.library;

import com.library.core.BootstrapApplication;
import com.library.core.Commander;

public class Main {
    public static void main(String[] args) {
        BootstrapApplication.bootstrap(new Commander());
    }
}
