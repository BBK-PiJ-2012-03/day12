public class DoublyLinkedListImpl<T> implements DoublyLinkedList<T>{
  private T newElement;
  private DoublyLinkedListImpl<T> nextElement;
  private DoublyLinkedListImpl<T> previousElement;

	public DoublyLinkedListImpl (T newElement) {
		this.nextElement = null;
		this.previousElement = null;
		this.newElement = newElement;
	}

	public void add(DoublyLinkedList<T> newElement) {
		DoublyLinkedListImpl<T> temp = (DoublyLinkedListImpl<T>) newElement;
	 
		if (this.nextElement == null) {
		// this means this is the last Element in the list
		this.nextElement = temp;
		temp.previousElement = this;
		} else {
		  this.nextElement.add(temp);
		  }
	}

	public boolean delete(DoublyLinkedList<T> newElement) {
		DoublyLinkedListImpl<T> temp = (DoublyLinkedListImpl<T>) newElement;
	
	if (this.nextElement == null) {
	  //Element to remove was not found
	  return false;
	} else if (this.nextElement.equals(temp)) {
	  //We found it! It is the next one!
	  // Now link this Element to the one after the next, and the one after the next, to this.
	  this.nextElement = nextElement.nextElement;
	  this.nextElement.previousElement = this;
	  return true;
	} else {
	  return this.nextElement.delete(temp);
	  }
	}

	@Override
	public String toString() {
		return newElement.toString();
	}	
	
		public void traverseForward(DoublyLinkedList<T> newElement) {
				DoublyLinkedListImpl<T> temp = (DoublyLinkedListImpl<T>) newElement;
		
			 while (temp != null) {
				System.out.println(temp.toString());
				temp = temp.nextElement;
			}
		}

		public void traverseBackward(DoublyLinkedList<T> newElement) {
			DoublyLinkedListImpl<T> temp = (DoublyLinkedListImpl<T>) newElement;
		
			while (temp != null) {
				System.out.println(temp); 
				temp = temp.previousElement; 
			}
		}
}		