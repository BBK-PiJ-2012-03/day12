public class ComparatorScript {

	public static void main(String[] args) {
		ComparatorScript script = new ComparatorScript();
		script.launch();
	}
 
	public void launch() {
		Comparator myComp = new Comparator();
		System.out.println("Calling the int getMax method to compare 1 and 2, the result is " +myComp.getMax(1,2));
		System.out.println("Calling the double getMax method to compare 1 and 2, the result is " + myComp.getMax(1.0,2.0));
		System.out.println("Calling the String getMax method to compare 1 and 2, the result is " + myComp.getMax("1","2"));
	}	
}	