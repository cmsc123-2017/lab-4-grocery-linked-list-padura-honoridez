class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  GroceryNode current = head;
  
  GroceryListLinked() {}
  
  //GroceryItem -> boolean
  //Returns true when this GroceryItem has been added to the list
  public boolean add(GroceryItem item) {
    GroceryNode newNode = new GroceryNode(item, head);
    head = newNode;
    return true;
  }      
  
  //String -> boolean
  //Returns true once item that matches with this name has been removed from the list
  public boolean remove(String name) {
    //Removes the first instance of the object item from the
    //calling list, if present. 
    //Returns tru if item is present, false if not.
    
    //previous.next = current. next;
    return false;
  }
  
  public boolean markAsBought(String name) {
    return false;
  }
  
  public void display() {
    while (current != null) {
      System.out.println(current);
      current = current.next;
    }
  }
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
}