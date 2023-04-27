public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister(user);
		Controller controller = new Controller(persister);
		controller.report();
		controller.savePersister();
	}
}