import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hi there! Do you want to encrypt a message or decrypt one?");
        System.out.println("----------------------------------------------------------");
        System.out.println("|           Press 1 for Encryption           |");
        System.out.println("|           Press 2 for Decryption           |");
        System.out.println("----------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                //string input
                System.out.println("Enter string to Encrypt: ");
                String str1 = sc.nextLine();

                Encrypt e = new Encrypt();
                String encryptedKey = e.encrypt(str1, 3);
                System.out.println("Origional Key: "+str1);
                System.out.println("Encrypted Key: "+encryptedKey);
                break;
            case 2:

                Decrypt d = new Decrypt();
                System.out.println("Enter the String to Decrypt");
                String str2 = sc.nextLine();
                System.out.println("Enter the shift");
                int Shift = sc.nextInt();
                String decryptedKey = d.decrypt(str2,Shift);
                System.out.println("Origional Key: "+str2);
                System.out.println("Decrypted Key: "+decryptedKey);
                break;
            default:
                System.out.println("Invalid choice, Try again");
        }
        sc.close();



    }
}
