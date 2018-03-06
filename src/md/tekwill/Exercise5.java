package md.tekwill;

import java.util.Scanner;

public class Exercise5 {

    /*
    Given a string, determine its length.
    IN: "Java"
    OUT: 4
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word :");
        String x = scanner.nextLine();
        System.out.println( x.length() + " letters");
    }
}
