package caneta;

public class Caneta {
    private String brand;
    private String color;
    private float height;

    public Caneta(String brand, String color, float height) {
        this.brand = brand;
        this.color = color;
        this.height = height;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
