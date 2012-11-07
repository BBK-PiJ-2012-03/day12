import java.util.*;

public class MobilePhone extends OldPhone {
	private ArrayList<String> myArray = new ArrayList<String>();
	private int counter = 0;

	public MobilePhone(String brand) {
		super(brand);
	}
	
	public void ringAlarm(String sound) {
		System.out.println("Time to wake up " + sound);
	}
	
	public void playGame(String game) {
		System.out.println("Lets start playing " +game);
	}	
	
	@Override
	public void call(String number) {
		System.out.println("Calling " + number);
		if (counter > 9) {
		myArray.remove(0);
		}
		
		counter++;
		myArray.add(number);
		
		
	}
	
	public void printLastNumbers() {
		//String [] array2print = new String[10];
		//array2print = myArray;
		System.out.println(myArray);
		
	}	
}	