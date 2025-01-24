package DTO;

import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase() {
        input();  // Call Dad Class to input value and  creator
        Scanner scv = new Scanner(System.in);

        // Input height of Vase
        do {
            System.out.print("Enter height: ");
            height = Integer.parseInt(scv.nextLine());
            if (height <= 0) {
                System.out.println("Height must be greater than 0. ");
            }
        } while (height <= 0);

        // Input Material of Vase
        do {
            System.out.print("Enter material: ");
            material = scv.nextLine();
            if (material.isBlank()) {
                System.out.println("Material must not be empty.");
            }
        } while (material.isBlank());
    }

    public void outputVase() {
        output();  // Call output() from dad Class to value and creator
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}