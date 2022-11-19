package cc.codegym.java;

import java.util.*;

public class Decryption {

 // public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
 //
 // public  String decrypt(String cipherText) {
 //     // Handling only lowercase strings
 //     int shiftKey = 3;
 //     cipherText = cipherText.toLowerCase();
 //
 //     // Final cipher text
 //     String message = "";
 //
 //     for (int i = 0; i < cipherText.length(); i++) {
 //         // Determine the character position in alpha
 //         int charPosition = alpha.indexOf(cipherText.charAt(i));
 //
 //         // Decryption
 //         int keyVal = (charPosition - shiftKey) % 26;
 //         if (keyVal < 0) {
 //             keyVal = alpha.length() + keyVal;
 //         }
 //
 //         // Append the decrypted character
 //         char replaceVal = alpha.charAt(keyVal);
 //         message += replaceVal;
 //     }
 //     return message;
 // }

    //main method
 // public static void main(String[] args) {
 //     Scanner sc = new Scanner(System.in);
 //
 //     String message = new String();
 //     System.out.print("Enter the String for Decryption: ");
 //     message = sc.next();
 //
 //     System.out.print("\nEnter Shift Key: ");
 //     int offset = sc.nextInt();
 //
 //     sc.close();
 //
 //     System.out.println("\nDecrypted Message: " + decrypt(message, offset));
 // }
}