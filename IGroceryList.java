interface IGroceryList {
  boolean add(GroceryItem item);
  
  boolean remove(String name);
  
  boolean markAsBought(String name);
  
  void display();
  
  int indexOf(String name);
  
  boolean addIndex(GroceryItem item, int insert);
}