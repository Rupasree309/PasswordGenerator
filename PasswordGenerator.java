import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_+=<>?";

        StringBuilder allCharacters = new StringBuilder();

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (Y/N): ");
        if (scanner.next().equalsIgnoreCase("Y")) {
            allCharacters.append(upper);
        }

        System.out.print("Include lowercase letters? (Y/N): ");
        if (scanner.next().equalsIgnoreCase("Y")) {
            allCharacters.append(lower);
        }

        System.out.print("Include numbers? (Y/N): ");
        if (scanner.next().equalsIgnoreCase("Y")) {
            allCharacters.append(numbers);
        }

        System.out.print("Include symbols? (Y/N): ");
        if (scanner.next().equalsIgnoreCase("Y")) {
            allCharacters.append(symbols);
        }

        if (allCharacters.length() == 0) {
            System.out.println("You must select at least one option!");
            return;
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(index));
        }

        System.out.println("Generated Password: " + password);

        scanner.close();
    }
}