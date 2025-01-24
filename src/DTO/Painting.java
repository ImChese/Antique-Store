package DTO;

import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int weight;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int weight, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.weight = weight;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public void setWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void inputPainting() {
        input();  // call from dad class to call height and creator
        Scanner scp = new Scanner(System.in);

        // Input Height
        do {
            try {
                System.out.print("Enter height: ");
                height = Integer.parseInt(scp.nextLine());
                if (height <= 0) {
                    System.out.println("Height must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number for height.");
            }
        } while (height <= 0);

        // Input Weight 
        do {
            try {
                System.out.print("Enter weight: ");
                weight = Integer.parseInt(scp.nextLine());
                if (weight <= 0) {
                    System.out.println("Weight must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number for weight.");
            }
        } while (weight <= 0);

        // check the painting
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Is it watercolour (T/F): ");//watercolor
            String input = scp.nextLine();
            if (input.equalsIgnoreCase("true")
                    || input.equalsIgnoreCase("TRUE")
                    || input.equalsIgnoreCase("True")) {
                isWatercolour = true;
                validInput = true;
            } else if (input.equalsIgnoreCase("false")
                    || input.equalsIgnoreCase("FALSE")
                    || input.equalsIgnoreCase("False")) {
                isWatercolour = false;
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter true or false.");
            }
        }

        // Nhập thông tin có phải là khung
        validInput = false;
        while (!validInput) {
            System.out.print("Is it framed (T/F): ");
            String input = scp.nextLine();
            if (input.equalsIgnoreCase("true")
                    || input.equalsIgnoreCase("TRUE")
                    || input.equalsIgnoreCase("True")) {
                isFramed = true;
                validInput = true;
            } else if (input.equalsIgnoreCase("false")
                    || input.equalsIgnoreCase("FALSE")
                    || input.equalsIgnoreCase("False")) {
                isFramed = false;
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter true or false.");
            }
        }

    }

    public void outputPainting() {
        output();  // Call from dad Class to display value and creator
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Is Watercolour: " + isWatercolour);
        System.out.println("Is Framed: " + isFramed);
    }

}
