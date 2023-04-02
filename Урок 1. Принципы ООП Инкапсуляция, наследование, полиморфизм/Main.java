public class Main {

    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("Tea", 25, 5))
            .addProduct(new Product("Cofe", 45, 4))
            .addProduct(new Milk("milk", 45,2))
            .addProduct(new Soymilk("soymilk", 45, 2))
            .addProduct(new Сookies("Вкусно", 45, 3,"Яшкино"))
            .addProduct(new Product("Bread", 56,5));
        System.out.println("До продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart, "milk");
        PrintSell(mart, "milk");
        PrintSell(mart, "milk");
        System.out.println("После продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart, "Bread");
        System.out.println("После продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart, "milk");
        System.out.println("После продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart, "mil");
        System.out.println("После продажи");
        System.out.println(mart);
        
    }
    public static void PrintSell ( VendingMachine machine ,String nameprod) {
        try{
            System.out.println(machine.sell(nameprod));
        } catch (Exception e){
            System.out.println("Товар не найден");
        }
        
    }
}