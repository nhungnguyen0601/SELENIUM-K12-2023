package lession_6;

public class Lab6_1 {
    public static void main(String[] args) {
        String input = "2hrs and 5 minutes";

        String[] parts = input.split(" ");
        int hours = Integer.parseInt(parts[0].replace("hrs", ""));
        int minutes = Integer.parseInt(parts[2]);

        int totalMinutes = hours * 60 + minutes;

        System.out.println("Total minutes: " + totalMinutes);

    }
}

