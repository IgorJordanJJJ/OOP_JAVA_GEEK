public class Shield implements Defensively {

    @Override
    public int protection() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("Щит безымянный (макс.защита %d)", this.protection());
    }
    
}
