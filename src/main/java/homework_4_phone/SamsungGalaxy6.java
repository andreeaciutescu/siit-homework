package homework_4_phone;

public class SamsungGalaxy6 extends Phone {
    private String brand;
    private String model;
    private String color;
    private String material;
    private String imei;
    private int battery = 12;

    public SamsungGalaxy6(String brand, String model, String color, String material, String imei) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getImei() {
        return imei;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public void call(String phone) {
        super.call(phone);
        battery = battery - 2;
    }

    @Override
    public void sendMessage(String contact, String message) {
        super.sendMessage(contact, message);
        battery--;
    }


}
