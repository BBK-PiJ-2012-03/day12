public interface DoublyLinkedList<T> {

//adds an Element

	void add(DoublyLinkedList<T> newElement);
	
	
//deletes an Element

	boolean delete(DoublyLinkedList<T> newElement); 


//Prints the list from the beggining to the end

	void traverseForward(DoublyLinkedList<T> newElement); 
	

//Prints the list backwards
	
	void traverseBackward(DoublyLinkedList<T> newElement); 
	

}