public class Product {
    
    private String name;

    private double price;

    private int counter;

    public Product(String name, double price, int counter){
        this.name = name;
        this.price = price;
        this.counter =counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public boolean sellCounter() {
        this.counter--;
        return counter>0;
    }


    @Override
    public String toString() {
        
        return String.format("%s : %.2f p.", name, price);
    }
}
