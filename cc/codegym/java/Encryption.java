package cc.codegym.java;

import java.util.*;

public class Encryption {

 // public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
 //
 // public  String encrypt(String message) {
 //     // Handling only lowercase strings
 //     int shiftKey = 3;
 //     message = message.toLowerCase();
 //
 //     // Final cipher text
 //     String cipherText = "";
 //
 //     for (int i = 0; i < message.length(); i++) {
 //         // Determine the character position in alpha
 //         int charPosition = alpha.indexOf(message.charAt(i));
 //
 //         // Encryption
 //         int keyVal = (shiftKey + charPosition) % 26;
 //
 //         // Encrypted character
 //         char replaceChar = alpha.charAt(keyVal);
 //
 //         // Append the encrypted character
 //         cipherText += replaceChar;
 //     }
 //
 //     // Return ciphered text
 //     return cipherText;
 // }
 //
 // //main method
 // public static void main(String[] args) {
 //     Scanner sc = new Scanner(System.in);
 //
 //     String message = new String();
 //     System.out.print("Enter the String for Encryption: ");
 //     message = sc.next();
 //
 //     System.out.println("\n\nEnter Shift Key or Offset: ");
 //     int offset = sc.nextInt();
 //
 //     sc.close();
 //
 //     System.out.println("\nEncrpyted msg: " + encrypt(message, offset));
 // }
}