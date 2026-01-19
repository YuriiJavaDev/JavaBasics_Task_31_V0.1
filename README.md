# Loyalty Program Discount Calculator (JavaBasics_Task_31_V0.1)

## 📖 Description
This project simulates a loyalty program logic. It utilizes **Nested Conditional Logic** to calculate specific discount percentages based on user demographics (age) and membership status (club card).

The primary goal is to demonstrate a prioritized decision-making flow where senior benefits take precedence over membership rewards.

## 📋 Requirements Compliance
Task 31:
**Develop a program to determine the discount size for a loyalty program.**

**Requirements:**
- Use the `Scanner` class to read age (int) and club card status (String).
- If age is `>= 65`, display: `"Your discount: 20%."`.
- If age is `< 65` AND the user has a card (`"yes"`), display: `"Your discount: 10%."`.
- In all other cases, display: `"No discount available."`.

## 🚀 Architectural Stack
- **Hierarchical Conditionals**: Nested `if-else` blocks to manage prioritized discount rules.
- **Input Normalization**: Using `.trim().toLowerCase()` to ensure robust string comparison.
- **Clean Code Localization**: Codebase, comments, and UI are fully localized in English.

## 🏗️ Implementation Details
- **Priority Logic**: The system checks for the highest discount (senior) first before evaluating secondary criteria.
- **Clean Code**: Adheres to international standards for naming conventions, technical comments, and input handling.
- **Resource Management**: Ensures proper closure of the `Scanner` object to prevent resource leaks.

## 🛠 Features
* **Priority-Based Evaluation**: Effectively handles overlapping categories.
* **Input Resilience**: Processes user responses regardless of case or accidental whitespace.

## 📋 Expected result
```text
Enter your age:
30
Do you have a club card? (yes/no):
yes
Your discount: 10%.
```

## 💻 Code Example

Project Structure:

    src/com/yurii/pavlenko/
                    └── Task_31_App.java # Main Entry Point & Logic

Code
```java
package com.yurii.pavlenko;

import java.util.Scanner;

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
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
