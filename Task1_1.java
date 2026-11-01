public class Task1_1 {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone();
        phone1.setBrand("Samsung");
        phone1.setModel("S24");
        phone1.setPrice(79999.0);

        Smartphone phone2 = new Smartphone("Apple", "iPhone 15", 89999.0);

        System.out.println("Телефон 1: " + phone1.getBrand() + " " + phone1.getModel() + ", Цена: " + phone1.getPrice());
        System.out.println("Телефон 2: " + phone2.getBrand() + " " + phone2.getModel() + ", Цена: " + phone2.getPrice());
    }
}

class Smartphone {
    private String brand;
    private String model;
    private double price;

    public Smartphone() {} 
    public Smartphone(String brand, String model, double price) { 
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
