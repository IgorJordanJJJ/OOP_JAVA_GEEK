public class Soymilk extends Milk {

    public Soymilk(String name, double price, int counter) {
        super(name, price, counter);

    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append("Soymilk : ")
                .append(super.toString());
        return res.toString();

    }

}
