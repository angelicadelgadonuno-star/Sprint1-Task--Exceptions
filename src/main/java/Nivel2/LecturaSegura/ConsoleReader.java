package Nivel2.LecturaSegura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static final Scanner entry = new Scanner(System.in);

    public static byte readByte (String message) {

        while (true) {
            try {
                System.out.println(message);
                byte age = entry.nextByte();
                entry.nextLine();
                return age;

            } catch (InputMismatchException e) {
                System.out.println(" ❌ Format Error: please enter a valid number");
                entry.nextLine();
            }
        }
    }

    public static int readInt (String message) {

        while (true) {
            try {
                System.out.println(message);
                int year = entry.nextInt();
                entry.nextLine();
                return year;

            } catch (InputMismatchException e) {
                System.out.println("❌ Format Error: please try again!");
                entry.nextLine();
            }
        }
    }

    public static float readFloat
            (String message) {

        while (true) {
            try {
                System.out.println(message);
                float height = entry.nextFloat();
                entry.nextLine();
                return height;

            } catch (InputMismatchException e) {
                System.out.println("❌ Format Error: please try again!");
                entry.nextLine();
            }
        }
    }

    public static double readDouble(String message) {

        while (true) {
            try {
                System.out.println(message);
                double weight = entry.nextDouble();
                entry.nextLine();
                return weight;

            } catch (InputMismatchException e) {
                System.out.println(" ❌ Format Error: please try again!");
                entry.nextLine();
            }

        }

    }

    public static char readChar (String message) {

        while (true) {
            try {
                System.out.println(message);
                String input = entry.nextLine();

                if (input.length() != 1) {
                    throw new SingleCharacterException (" ❌ Error: Only one character allowed");
                }
                return input.charAt(0);

            } catch (SingleCharacterException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString (String message){

        while (true){
            try {
                System.out.println(message);
                String phrase = entry.nextLine();

                if (phrase.length() < 4) {
                    throw new StringTooShortException( "❌ Error: the word must have at least 4 letters");
                }
                return phrase;

            } catch (StringTooShortException e) {
                    System.out.println(e.getMessage());
                }
            }

            }
    public static boolean readYesNo (String message) {

            while (true) {
                try {
                    System.out.println(message);
                    String question = entry.nextLine();

                    if (question.equals("s")) {
                        return true;
                    }
                    if (question.equals("n")) {
                        return false;
                    }
                    throw new InvalidYesNoException("❌ Error: just type 's' for Yes or 'n' for No");

                } catch (InvalidYesNoException e) {
                    System.out.println(e.getMessage());
                }

            }
    }
}


