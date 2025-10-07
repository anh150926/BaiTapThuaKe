package payment;

public class CashPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán tiền mặt thành công. Số tiền: " + amount + " VND.\n");
    }
}
