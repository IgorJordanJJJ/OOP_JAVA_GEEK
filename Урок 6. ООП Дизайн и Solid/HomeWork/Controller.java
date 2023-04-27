

public class Controller {
    private Persister persister;
    private User user;

    public Controller(Persister persister){
        this.persister=persister;
        this.user=persister.getUser();
    }
    public void savePersister(){
        this.persister.save(this.user);

    }
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
