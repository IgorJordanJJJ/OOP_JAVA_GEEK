public class IronShield implements Defensively {
    @Override
    public int protection() {
        return 6;
    }
    @Override
    public String toString() {
        return String.format("Щит железный (макс.защита %d)", this.protection());
    }
}
