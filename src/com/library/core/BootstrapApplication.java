package com.library.core;

import com.library.exceptions.ExitException;
import com.library.exceptions.InvalidCommandException;
import com.library.utils.LogBanner;

import java.util.Scanner;

public class BootstrapApplication {
    public static void bootstrap(Commander commander) {
        LogBanner.print();
        Scanner scanner = new Scanner(System.in);
        boolean exit = commander.getExit();

        while (!exit) {
            LogBanner.instruction();
            try {
                commander.execute(scanner.nextLine());
            } catch (InvalidCommandException ice) {
                System.out.println(ice.getMessage());
            } catch (ExitException ee) {
                exit = true;
                System.out.println(ee.getMessage());
            }
        }

        scanner.close();
    }
}
