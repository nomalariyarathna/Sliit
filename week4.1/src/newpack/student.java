package newpack;

public class student {
	
	//instance to send outside
	private static student instance=new student();
	private String name;
	
	//the private Constructor 
	private student() {
		this.name="nomal";
	}
	
	//method to send the student instance to the outside
	public static student getInstance() {
		return instance;
	}
	public void displayDetails() {
		System.out.println("Name of the student:" +this.name);
	}
		
	}


