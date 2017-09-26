class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  
  //TEMPLATE
  /* Fields:
   *   this.head    --GroceryNode
   *   this.size   --int
   * 
   * Methods:
   *   this.add(GroceryItem)      --boolean
   *   this.remove(String)        --boolean
   *   this.markAsBought(String)  --boolean
   *   this.display()             --void
   * 
   * Fields on GroceryNode:
   *   this.data        --GroceryItem
   *   this.next        --GroceryNode
   * 
   * Methods on item:
   *   this.addQuantity(int quantity)  --void
   *   this.toString()                 --String
   *   this.equals(Object o)           --boolean
   *   this.isBoughtTrue()             --boolean
   */
  
  //GroceryItem -> boolean
  //Returns true when this GroceryItem has been added to the list
  public boolean add(GroceryItem item) {
    GroceryNode newNode = new GroceryNode(item, head);
    head = newNode;
    this.size++;
    return true;
  }      
  
  //String -> boolean
  //Returns true once item that matches with this name has been removed from the list
  public boolean remove(String name) {
    if (this.size == 0){
      return false;
    }
    
    GroceryNode previous = head;
    GroceryNode current = head.next;
    
    if (previous.data.equals(new GroceryItem(name, 0))) {
      
      previous = null;
      head = current;
      this.size--;
      return true;
      
    }
    
    while (current != null) {
      if (current.data.equals(new GroceryItem(name, 0))) {
        
        current = current.next;
        previous.next = current;
        
        this.size--;
        return true;
      }
      
      previous = current;
      current = current.next;

    }
    return false;
  }
  
  //String -> boolean
  public boolean markAsBought(String name) {
    GroceryNode current = head;
    
    while (current != null) {
      if (current.data.equals(new GroceryItem(name, 0))) {
        current.data.isBoughtTrue();
        return true;
      }
      current = current.next;
    }
    return false;
  }
  
  // -> void
  //Displays the Linked List
  public void display() {
    GroceryNode current = head;
    while (current != null) {
      System.out.println(current.data);
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