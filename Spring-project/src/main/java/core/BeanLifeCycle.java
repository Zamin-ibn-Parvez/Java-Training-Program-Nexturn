package core;

public class BeanLifeCycle {
	
	private String Username;

	public void setUsername(String username) {
		Username = username;
	}
	
	public String getUsername() {
		return Username;
	}
	
	public void welcome() {
		System.out.println("** init method executed **");
	}
	
	public void sayBye() {
		System.out.println("** destroy method invoked **");
	}

}
