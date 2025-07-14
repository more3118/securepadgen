import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pad Encryption by Shreyas More");
        String plainText = "MY NAME IS UNKNOWN";
        Integer keyLength = plainText.length();
        System.out.println("Key Length:"+keyLength);
        System.out.println("Key:"+Encryption.generateKey(keyLength));
        System.out.println("Encrypted String:"+Encryption.encrypt(plainText, Encryption.generateKey(keyLength)));;

    }
}