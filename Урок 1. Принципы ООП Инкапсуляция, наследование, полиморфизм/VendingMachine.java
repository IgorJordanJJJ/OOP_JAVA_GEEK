import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    private List<Product> products = new ArrayList<>();

    private double money =0;


    public VendingMachine addProduct (Product product){
        products.add(product);
        return this;
    }

    public Product searchProduct (String name){
        for (Product product : products) {
            if(product.getName().equals(name)){
                return product;
            }

        }
        return null;
    }

    public Product sell (String name) throws Exception{
        Product target =  searchProduct(name);
        try{
            this.money += target.getPrice();
            if(!target.sellCounter()){
                products.remove(target);
            }
        } catch (NullPointerException e){
            System.out.println("Товвар не найден");
            throw new Exception("Товар не найден", e);
        }
        return target;

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(Product item:products){
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате сейчас %.2f рублей", money));
        return res.toString();
    }

}
