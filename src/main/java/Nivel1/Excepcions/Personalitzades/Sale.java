package Nivel1.Excepcions.Personalitzades;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List <Product> products = new ArrayList<>();
    private double totalPrice;


    public void addProducts (Product product) {
        products.add(product);
    }

    public List <Product> getProducts () {
        return products;
    }


    public double calculateTotal() {

            if (products.isEmpty()) {
                throw new EmptySaleException();
            }
            totalPrice = 0;
            for (Product p : products) {
                totalPrice += p.getPrice();
            }
            return totalPrice;
        }


    public double getTotalPrice() {
        return totalPrice;
    }

}
