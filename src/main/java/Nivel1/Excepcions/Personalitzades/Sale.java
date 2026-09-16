package Nivel1.Excepcions.Personalitzades;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products = new ArrayList<>();
    private double totalPrice;

    public double calculateTotal()
            throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        for (Product p : products) {
            totalPrice = totalPrice + p.getPrice();
        }
        return totalPrice;
    }

    public void addProduct (Product p) {
        products.add(p);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
