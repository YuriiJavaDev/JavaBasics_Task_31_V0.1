package com.yurii.pavlenko;

import java.util.Scanner;

/**
 * Task_31_App: Loyalty Program Discount Calculator.
 * Demonstrates nested conditionals to determine discount rates
 * based on age and club membership status.
 */
public class Task_31_App {
    public static void main(String[] args) {
        // Initialize Scanner for keyboard input
        Scanner console = new Scanner(System.in);

        // Input Phase: Capture age
        System.out.println("Enter your age:");
        int age = console.nextInt();
        console.nextLine(); // Consume newline character

        // Input Phase: Capture membership status
        System.out.println("Do you have a club card? (yes/no):");
        String hasClubCard = console.nextLine().trim().toLowerCase();

        // Level 1: Check for senior discount (65+)
        if (age >= 65) {
            System.out.println("Your discount: 20%.");
        } else {
            // Level 2: Check for membership discount for users under 65
            if (hasClubCard.equals("yes")) {
                System.out.println("Your discount: 10%.");
            } else {
                // Default case: No conditions met
                System.out.println("No discount available.");
            }
        }

        // Close resource stream
        console.close();
    }
}