package Nivel1.Excepcions.Personalitzades;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        System.out.println("Test1: Empty sale ");

        Sale emptySale = new Sale();

        try {
            emptySale.calculateTotal();

        } catch (EmptySaleException e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.println("Test2: IndexOutOfBoundsException" );

        ArrayList<Product> lista = new ArrayList<>();
        lista.add(new Product("Milk", 1.20));
        lista.add(new Product("Bread", 0.90));

        try {
            lista.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error " + e.getMessage());
        }




}
    }
