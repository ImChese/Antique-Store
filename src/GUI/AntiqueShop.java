package GUI;

import DTO.*;
import java.util.Scanner;

public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner an = new Scanner(System.in);

        do {
            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.println("Input a choice:");

            choice = an.nextInt();
            an.nextLine();  // Đọc ký tự newline thừa

            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    System.out.println("A Vase has been created.");
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    System.out.println("A Statue has been created.");
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    System.out.println("A Painting has been created.");
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            System.out.println("Displaying Vase details:");
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            System.out.println("Displaying Statue details:");
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            System.out.println("Displaying Painting details:");
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("No item to display!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        } while (choice >= 1 && choice <= 4);
    }
}
