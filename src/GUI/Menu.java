
package GUI;

import java.util.Scanner;

public class Menu {
    public static int getChoice(String[] options) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }
}