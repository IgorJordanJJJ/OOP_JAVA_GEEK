import java.util.ArrayList;

public class CoffeMachine {
    
    private ArrayList<CoffeGeneral> coffelist = new ArrayList<>();
    private double bank =0;
    private double barrelwater =0;
    private double temprachemachine =0;

    public CoffeMachine addCoffe(CoffeGeneral coffe){
        coffelist.add(coffe);
        return this;
    }

    public CoffeGeneral searchCofe(String name){
        for(CoffeGeneral cf: coffelist){
            if(cf.getName().equals(name)){
                return cf;
            }
        }
        return null;
    }

    public CoffeGeneral sell(String name) throws Exception{
        CoffeGeneral cf = searchCofe(name);
        try {
            bank += cf.getPrice();
            if(chekWater(cf)){
                HeatWater(cf.getTemperatura());
                standWater(cf);
                CoolWater();
            }
            else{
                System.out.println("Нет воды");
            }
            
        } catch (NullPointerException e) {
            System.out.println("Товвар не найден");
            throw new Exception("Товар не найден", e);
        }
        return cf;
    }


    public void HeatWater(double temperatura){
        this.temprachemachine = temperatura;
        System.out.println(getTempracheWater());
    }

    public void CoolWater(){
        this.temprachemachine = 0;
        System.out.println(getTempracheWater());
    }

    public void addWater(double water){
        barrelwater += water;
        System.out.println(getBarrelwater());
    }
    
    public boolean chekWater(CoffeGeneral cf){
        double flag =  barrelwater - cf.getValuem();
        return flag>0;
    }
    
    public void standWater(CoffeGeneral cf){
        barrelwater = barrelwater -cf.getValuem();
        System.out.println(getBarrelwater());

    }

    public String getBarrelwater() {
        return String.format("В маштне %.2f литров", barrelwater);
    }

    public String getTempracheWater() {
        return String.format("В маштне %.2f Температура", temprachemachine);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(CoffeGeneral item: coffelist){
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате %.2f рублей", bank));
        return res.toString();
    }

}
