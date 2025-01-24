package DTO;

import java.util.Scanner;

public class Item {

    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị cho value
        do {
            System.out.print("Enter value: ");
            value = Integer.parseInt(sc.nextLine());
            if (value <= 0) {
                System.out.println("Value must be greater than 0.");
            }
        } while (value <= 0);

        // Nhập giá trị cho creator
        do {
            System.out.print("Enter creator: ");
            creator = sc.nextLine();
            if (creator.isEmpty() || creator.isBlank()) {
                System.out.println("Creator must not be empty.");
            }
        } while (creator.isEmpty() || creator.isBlank());
    }

    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }

}
