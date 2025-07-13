import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pad Encryption by Shreyas More\nPlease input the secret key:");
        String key = sc.nextLine();
        System.out.println("Text to be Encrypted: MY NAME IS UNKNOWN");
        System.out.println("Output Result:");
        System.out.println(Encryption.encryptString(key));
    }
}