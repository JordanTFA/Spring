package definition.inheritance;

public class HelloWorld {
	
	private String firstMessage;
	private String secondMessage;
	

	public void setFirstMessage(String firstMessage) {
		this.firstMessage = firstMessage;
	}

	public void setSecondMessage(String secondMessage) {
		this.secondMessage = secondMessage;
	}
	
	public void getFirstMessage() {
		System.out.println("First Message: " + firstMessage);
	}
	
	public void getSecondMessage() {
		System.out.println("Second Message: " + secondMessage);
	}
}