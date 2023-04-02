public class Milk extends Product {

    public Milk(String name, double price, int counter){
        super(name, price, counter);
    }

    @Override
    public String toString() {
        return String.format("Молоко : %s", super.toString());
    }
    
}
