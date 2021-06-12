package homework_4_phone;

public class iPhone extends Phone {
    private String brand = "Apple";
    private String model;
    private String color;
    private String material;
    private String imei;
    private int battery = 10;

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

    public iPhone(String brand, String model, String color, String material, String imei) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
