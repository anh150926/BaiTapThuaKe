package order;

import java.util.ArrayList;
import model.Product;
import payment.CashPayment;
import payment.CreditCardPayment;
import payment.MomoPayment;
import payment.Payment;
import payment.ZaloPayPayment;

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

        if (payment instanceof CashPayment) {
            System.out.println("Đơn hàng được thanh toán trực tiếp tại quầy.\n");
        } else if (payment instanceof CreditCardPayment) {
            System.out.println("Giao dịch đã được xác thực bởi ngân hàng phát hành.\n");
        } else if (payment instanceof MomoPayment) {
            System.out.println("Giao dịch được xử lý qua cổng Momo Pay.\n");
        } else if (payment instanceof ZaloPayPayment) {
            System.out.println("Xác nhận thanh toán qua ví ZaloPay.\n");
        } else {
            System.out.println("Không xác định phương thức thanh toán.\n");
        }
    }
}
