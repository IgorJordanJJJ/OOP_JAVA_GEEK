public class Сookies extends Product {
    private String mark;

    public Сookies(String name, double price, int counter, String mark) {
        super(name, price, counter);
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("Шоколад от производителя %s, %s", mark, super.toString());
    }
    
    
}
