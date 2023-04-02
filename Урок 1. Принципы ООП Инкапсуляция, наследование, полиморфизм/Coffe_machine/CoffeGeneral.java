public class CoffeGeneral {
    private String name;
    private double valuem;
    private double price;
    private double temperatura;

    public CoffeGeneral(String name, double price, double valuem, double temperatura){
        this.name = name;
        this.price = price;
        this.valuem = valuem;
        this.temperatura =temperatura;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public double getValuem() {
        return valuem;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    public void setValuem(double valuem) {
        this.valuem = valuem;
    }
    @Override
    public String toString() {
        
        return String.format(" %s : %f : %f ", name, price, valuem);
    }

}
