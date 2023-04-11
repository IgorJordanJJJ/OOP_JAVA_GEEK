public class DiamondShield implements Defensively {
    @Override
    public int protection() {
        return 9;
    }
    @Override
    public String toString() {
        return String.format("Щит алмазный (макс.защита %d)", this.protection());
    }
}
