public class IDScript {

	public static void main(String[] args) {
	IDScript script = new IDScript();
	script.launch();
	}
 
	public void launch() {
	DoublyLinkedListImpl<Integer> start = null;

	DoublyLinkedListImpl<Integer> firstID = new DoublyLinkedListImpl<Integer>(1);
	start = firstID;
	
	DoublyLinkedListImpl<Integer> secondID = new DoublyLinkedListImpl<Integer>(2);
	start.add(secondID);

	DoublyLinkedListImpl<Integer> thirdID = new DoublyLinkedListImpl<Integer>(3);
	start.add(thirdID);

	DoublyLinkedListImpl<Integer> forthID = new DoublyLinkedListImpl<Integer>(4);
	start.add(forthID);

	DoublyLinkedListImpl<Integer> fifthID = new DoublyLinkedListImpl<Integer>(5);
	start.add(fifthID);

	start.delete(secondID);

	start.traverseForward(start);
	start.traverseBackward(fifthID);
	}
}	