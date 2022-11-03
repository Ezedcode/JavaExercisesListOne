package lampada;

public class Lampada {
    private String model;
    private float voltage;
    private String color;
    private String brand;
    private float price;
    private float power;
    private boolean status;

    public Lampada(String model, float voltage, String color, String brand, float price, float power, boolean status) {
        this.model = model;
        this.voltage = voltage;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.power = power;
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void turnLightOn(){
        System.out.println("\n\nTurn Light On!");
    }

    public void turnLightof(){
        System.out.println("\n\nTurn Light Off!");
    }
}
