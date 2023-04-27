public class Persister{
	private User user;
	
	public Persister(User user){
		this.user = user;
	}
	
	public void save(User user){
		System.out.println("Save user: " + user.getName());
	}

	public User getUser(){
		return this.user;
	}
}