public class EmployeeScript {

	public static void main(String[] args) {
	EmployeeScript script = new EmployeeScript();
	script.launch();
	}
 
	public void launch() {
	DoublyLinkedListImpl<String> start = null;

	DoublyLinkedListImpl<String> firstEmpl = new DoublyLinkedListImpl<String>("John");
	start = firstEmpl;
	
	DoublyLinkedListImpl<String> secondEmpl = new DoublyLinkedListImpl<String>("Paul");
	start.add(secondEmpl);

	DoublyLinkedListImpl<String> thirdEmpl = new DoublyLinkedListImpl<String>("Mary");
	start.add(thirdEmpl);

	DoublyLinkedListImpl<String> forthEmpl = new DoublyLinkedListImpl<String>("Anna");
	start.add(forthEmpl);

	DoublyLinkedListImpl<String> fifthEmpl = new DoublyLinkedListImpl<String>("Tom");
	start.add(fifthEmpl);

	start.delete(secondEmpl);

	start.traverseForward(start);
	start.traverseBackward(fifthEmpl);
	}
}	