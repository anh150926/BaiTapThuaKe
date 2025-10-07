package model;

public class ElectronicProduct extends Product {
    private String imei;
    private int warrantyPeriod;

    public ElectronicProduct(String id, String name, double price, String imei, int warrantyPeriod) {
        super(id, name, price);
        this.imei = imei;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + " | IMEI: " + imei + " | BH: " + warrantyPeriod + " tháng";
    }
}
