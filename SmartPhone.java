public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand) {
		super(brand);
	}
	
	public void browseWeb(String website) {
		System.out.println("Connecting to " + website);
	}	
	
	public String findPosition() {
		return "I found you, you are ....";
	}	
	
	@Override
	public void call(String number) {
		if (number.substring(0,2).equals("00")) {
			System.out.println("Calling " + number + " through the internet to save money");
		} else {
			super.call(number);
		  }	
			
	}	
			
	
}	