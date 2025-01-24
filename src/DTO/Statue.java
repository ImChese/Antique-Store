package DTO;

import java.util.Scanner;

public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void inputStatue() {
        input();  // Call Dad Class to input value and  creator
        Scanner scs = new Scanner(System.in);

        // Input Weight of Statue
        do {
            System.out.print("Enter weight: ");
            weight = Integer.parseInt(scs.nextLine());
            if (weight <= 0) {
                System.out.println("Weight must be greater than 0.");
            }
        } while (weight <= 0);

        // Input color of Statue
        do {
            System.out.print("Enter colour: ");
            colour = scs.nextLine();
            if (colour.isBlank()) {
                System.out.println("Colour must not be empty.");
            }
        } while (colour.isBlank());
    }

    public void outputStatue() {
        output();  // Call output() from dad Class to value and creator
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}