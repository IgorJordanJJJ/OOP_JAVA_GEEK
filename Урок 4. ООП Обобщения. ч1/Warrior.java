import java.util.Random;

public abstract class Warrior<T extends Weapon, D extends Defensively> extends Personage{
protected static Random rnd = new Random();
    protected T weapon;
    protected D defensively;
    public Warrior(String name, int hp, T weapon, D defensively) {
        super(name, hp);
        this.weapon = weapon;
        this.defensively = defensively;
    }
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    public int block(){
        return defensively.protection();
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon));
            if(defensively.protection() != 0){res.append(String.format("\n\tИмеет при себе: %s", this.defensively));}
        return res.toString();
    }
}
