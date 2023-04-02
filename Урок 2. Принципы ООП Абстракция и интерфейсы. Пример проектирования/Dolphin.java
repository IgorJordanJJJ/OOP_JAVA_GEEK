public class Dolphin extends Predator implements Swimming{

    private int speed;
    public Dolphin(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public String speak() {
        return "Екекек-кек-кекек";
    }

    @Override
    public String feed() {
        return "Рыба";
    }

    @Override
    public int speedSwim() {
        return speed;
    }
    
}
