package definition.inheritance;

public class HelloScotland {
	
	private String firstMessage;
	private String secondMessage;
	private String thirdMessage;
	

	public void setFirstMessage(String firstMessage) {
		this.firstMessage = firstMessage;
	}

	public void setSecondMessage(String secondMessage) {
		this.secondMessage = secondMessage;
	}
	
	public void setThirdMessage(String thirdMessage) {
		this.thirdMessage = thirdMessage;
	}
	
	public void getFirstMessage() {
		System.out.println("Scotland First Message: " + firstMessage);
	}
	
	public void getSecondMessage() {
		System.out.println("Scotland Second Message: " + secondMessage);
	}
	
	public void getThirdMessage() {
		System.out.println("Scotland Third Message: " + thirdMessage);
	}

}
