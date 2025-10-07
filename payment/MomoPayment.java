package payment;

public class MomoPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán qua ví Momo thành công. Số tiền: " + amount + " VND.\n");
    }
}
