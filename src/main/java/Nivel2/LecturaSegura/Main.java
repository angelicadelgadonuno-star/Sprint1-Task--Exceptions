package Nivel2.LecturaSegura;

public class Main {
    static void main() {

        byte age = ConsoleReader.readByte("Enter your age");
        int birthYear =  ConsoleReader.readInt("Enter your birth year");
        float height = ConsoleReader.readFloat("Enter your height in meters");
        double weight = ConsoleReader.readDouble("Enter your weight in kilograms");
        char number = ConsoleReader.readChar ("Choose a number from 1-9");
        String phrase = ConsoleReader.readString("Enter a 4 letter word");


    }
}
