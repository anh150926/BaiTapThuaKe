import model.*;
import order.Order;
import payment.*;

public class Main {
    public static void main(String[] args) {
        ElectronicProduct ep1 = new ElectronicProduct("E01", "Laptop Dell", 15000000, "IMEI12345", 12);
        FoodProduct fp1 = new FoodProduct("F01", "Bánh quy Oreo", 35000, "10/12/2025");
        FoodProduct fp2 = new FoodProduct("F02", "Sữa Vinamilk", 30000, "20/10/2025");

        // Đơn hàng thanh toán tiền mặt
        Order order1 = new Order("Lưu Hải Anh", new CashPayment());
        order1.addProduct(ep1);
        order1.addProduct(fp1);
        order1.checkout();

        // Đơn hàng thanh toán bằng thẻ tín dụng
        Order order2 = new Order("Vũ Tiến Đạt", new CreditCardPayment());
        order2.addProduct(new ElectronicProduct("E02", "iPhone 15", 28000000, "IMEI8888", 24));
        order2.checkout();

        // Đơn hàng thanh toán qua Momo
        Order order3 = new Order("Nguyễn Lê Anh", new MomoPayment());
        order3.addProduct(fp2);
        order3.checkout();

        // Đơn hàng mới dùng ZaloPay để thanh toán
        Order order4 = new Order("Trần Duy Dũng", new ZaloPayPayment());
        order4.addProduct(fp1);
        order4.checkout();
    }
}
