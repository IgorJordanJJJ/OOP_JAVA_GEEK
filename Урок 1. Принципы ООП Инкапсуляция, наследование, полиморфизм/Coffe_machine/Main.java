

public class Main
{
    public static void main(String[] args) {
        CoffeMachine nach = new CoffeMachine();
        nach.addCoffe(new CoffeGeneral("Cofe",50,50,50))
            .addCoffe(new ClasikCoffe())
            .addCoffe(new ExpressoCoffe())
            .addCoffe(new CoffeGeneral("Cofe2",50,50,50));

    nach.addWater(500);
    
    System.out.println("До продажи");
    System.out.println(nach);
    System.out.println();
    PrintSell(nach, "Classik Coffe");
    System.out.println("После продажи");
    System.out.println(nach);
    System.out.println();
    }


    public static void PrintSell ( CoffeMachine machine ,String nameprod) {
        try{
            System.out.println(machine.sell(nameprod));
        } catch (Exception e){
            System.out.println("Товар не найден");
        }
        
    }
}