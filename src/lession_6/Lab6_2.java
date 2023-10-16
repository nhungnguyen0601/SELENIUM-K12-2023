package lession_6;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        int maxInput = 3;
        int trial = 0;
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        while (trial < maxInput) {
            System.out.print("Enter your password: ");
            String userInput = scanner.nextLine();

            if (userInput.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                trial++;
                System.out.println("Incorrect password.");
            }
        }

        if (trial == maxInput) {
            System.out.println("You can only input maximum 3 times.");

        }

    }
}
