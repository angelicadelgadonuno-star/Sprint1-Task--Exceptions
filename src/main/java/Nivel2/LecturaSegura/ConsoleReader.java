package Nivel2.LecturaSegura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static final Scanner entry = new Scanner(System.in);

    public static byte readByte (String message){

        while (true) {
            try {
            System.out.println(message);
            byte age = entry.nextByte();
        return age;
            } catch (InputMismatchException e){
            System.out.println("❌ Format Error: please try again!");
            entry.nextLine();
            }
        }
    }
    public static int readInt (String message){

            while (true) {
                try {
                    System.out.println(message);
                    int year;
                } catch (InputMismatchException e) {
                    System.out.println("❌ Format Error: please try again!");
                    entry.nextLine();
                }
            }
    }
    public static float readFloat (String message) {

        while (true) {
            try {
                System.out.println(message);
                float height;
            } catch (InputMismatchException e) {
                System.out.println("❌ Format Error: please try again!");
                entry.nextLine();
            }
        }
    }

    public static double readDouble (String message){

        while (true) {
            try {
                System.out.println(message);
            } catch (InputMismatchException e) {
                System.out.println(" ❌ Format Error: please try again!");
            }   entry.nextLine();
        }

}
}
