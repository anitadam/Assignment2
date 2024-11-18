package Assignment;

import java.util.Scanner;

public class ReadTextMain {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in); // scanner method
        ReadTextLogic countObject = new ReadTextLogic(); // created object of ReadTextLogic


        System.out.println("Skriv något. Skriv stop för att avsluta");


        String input = scan.nextLine();


        while (countObject.isRunning(input)) {

            countObject.countLines(input);

            input = scan.nextLine();


        }


        // getting methods using objects
        int countRows = countObject.getCountRows();
        int getCountChar = countObject.getCountChar();
        int getCountWords = countObject.getCountWords();
        String getLongestWord = countObject.getLongestWord();
        // printing out results
        System.out.println("Antal rader: " + countRows);
        System.out.println("Antal tecken: " + getCountChar);
        System.out.println("Antal ord: " + getCountWords);
        System.out.println("Längsta ord: " + getLongestWord);

    }
}
