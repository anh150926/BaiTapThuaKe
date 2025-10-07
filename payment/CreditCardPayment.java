package payment;

public class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng thành công. Số tiền: " + amount + " VND.\n");
    }
}
