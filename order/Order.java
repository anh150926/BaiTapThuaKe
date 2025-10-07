package order;

import java.util.ArrayList;
import model.Product;
import payment.Payment;

public class Order {
    private String customerName;
    private ArrayList<Product> productList = new ArrayList<>();
    private Payment payment;

    public Order(String customerName, Payment payment) {
        this.customerName = customerName;
        this.payment = payment;
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }

    public void checkout() {
        double total = getTotalAmount();
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + total + " VND.");
        payment.pay(total);
    }
}
