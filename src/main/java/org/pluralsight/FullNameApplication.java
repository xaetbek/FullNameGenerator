package org.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        // Require first name
        String firstName = "";
        while (firstName.isEmpty()){
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine().trim();
            if (firstName.isEmpty()) {
                System.out.println("First name cannot be empty.");
            }
        }

        // Optional middle name
        System.out.print("Enter your middle name (or press Enter to skip): ");
        String middleName = scanner.nextLine().trim();

        // Require last name
        String lastName = "";
        while (lastName.isEmpty()) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine().trim();
            if (lastName.isEmpty()) {
                System.out.println("Last name cannot be empty.");
            }
        }

        // Optional suffix
        System.out.print("Enter your suffix (or press Enter to skip): ");
        String suffix = scanner.nextLine().trim();

        StringBuilder fullName = new StringBuilder();
        fullName.append(capitalize(firstName)).append(" ");

        if (!middleName.isEmpty()) {
            fullName.append(capitalize(middleName)).append(" ");
        }

        fullName.append(capitalize(lastName));

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        System.out.println("Full name: " + fullName);
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
