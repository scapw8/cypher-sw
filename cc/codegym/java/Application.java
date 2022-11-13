package cc.codegym.java;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) throws IOException {

       CaesarCypher cypher = new CaesarCypher(3);
      //  String originalMessage = "Coffee is the best fuel to code Java";
       // String cypheredMessage = cypher.cypher(originalMessage);
        //String finalMessage = cypher.decypher(cypheredMessage);
 //
 //       System.out.println(originalMessage) ;
 //       System.out.println(cypheredMessage);
 //       System.out.println(finalMessage);
 //       System.out.println(originalMessage.equals(finalMessage));

                    /* Part one, still have to input the Regex for the alphabet */
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, please enter 1 for encrypt/decrypt mode or 2 for brute force mode");
        int mode = sc.nextInt();

        if (mode ==1){
             try(Scanner file = new Scanner(Paths.get("TextFileInput.txt"))) {
                 while (file.hasNextLine()) {
                     String line = file.nextLine();
                     System.out.println(line);
                     System.out.println(cypher.decypher(line));




                 }
                 try (BufferedWriter writer = new BufferedWriter( new FileWriter("TextFileOutput3.txt"))){
                   //  writer.write(cypher.decypher()); // How to take the Stream in here from above?
                     writer.close();
                     //System.out.println(cypher.decypher());
                 }
             }

        } else if (mode == 2) {
            try( Scanner file = new Scanner(Paths.get(""))){
                while (file.hasNextLine());{
                String line = file.nextLine();}
            }
        }
        else System.out.println("Please input only the number 1 or 2");

    }
}

