package payment;

public class ZaloPayPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán qua ZaloPay thành công. Số tiền: " + amount + " VND.\n");
    }
}
