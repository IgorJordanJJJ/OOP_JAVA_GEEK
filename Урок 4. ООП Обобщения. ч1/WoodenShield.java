public class WoodenShield implements Defensively {

    @Override
    public int protection() {
        return 3;
    }
    @Override
    public String toString() {
        return String.format("Щит деревянный (макс.защита %d)", this.protection());
    }
}
