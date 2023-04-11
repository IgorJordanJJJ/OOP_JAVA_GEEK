public class Archer extends Warrior<Throwing, Defensively>{
    public Archer(String name, int hp, Throwing weapon, Defensively defensively) {
        super(name, hp, weapon, defensively);
    }

    public int range(){
        return rnd.nextInt(this.weapon.range)+1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
