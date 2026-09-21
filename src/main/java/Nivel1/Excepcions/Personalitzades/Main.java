package Nivel1.Excepcions.Personalitzades;

import java.util.ArrayList;
import java.util.List;

import static Nivel1.Excepcions.Personalitzades.Sale.products;

public class Main {
    static void main(String[] args) {

        System.out.println("--- Test1: Empty sale --- ");

        Sale emptySale = new Sale();

        try {
            emptySale.calculateTotal();

        } catch (EmptySaleException e) {
            System.out.println(" ❌ Error " + e.getMessage());
        }

        System.out.println("--- Test2: IndexOutOfBoundsException ---" );

        Sale sale = new Sale();

        sale.addProducts(new Product("Bread", 0.90));
        sale.addProducts(new Product("Milk", 2.50));
        sale.addProducts(new Product("Organic Oatmeal", 2.99));

        try {
             sale.getProducts().get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" ❌ Error " + e.getMessage());
        }

        System.out.println("---Test3: Successful Purchase---");

        Sale successfulSale = new Sale();

        successfulSale.addProducts(new Product("Bread", 0.90));
        successfulSale.addProducts(new Product("Milk", 2.50));
        successfulSale.addProducts(new Product("Organic Oatmeal", 2.99));


        System.out.println("Your total is: " + successfulSale.calculateTotal());
    }
}
