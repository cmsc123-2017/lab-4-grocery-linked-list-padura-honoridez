import junit.framework.TestCase;

public class GroceryListLinkedTest extends TestCase {
  
  public void testAddFirst() {
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    GroceryItem tomato = new GroceryItem("Tomato", 2);
    
    GroceryListLinked veges = new GroceryListLinked();
    
    assertEquals(true, veges.add(carrot));
    assertEquals(true, veges.add(cabbage));
    assertEquals(true, veges.add(squash));
    assertEquals(true, veges.add(okra));
    assertEquals(true, veges.add(eggplant));
  }
  
  public void testRemove() {
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    GroceryItem tomato = new GroceryItem("Tomato", 2);
    
    GroceryListLinked veges = new GroceryListLinked();
    
    veges.add(carrot);
    veges.add(cabbage);
    veges.add(squash);
    veges.add(okra);
    veges.add(eggplant);
    veges.add(gourd);
    veges.add(spinach);
    veges.add(shoots);
    veges.add(gabi);
    veges.add(tomato);
    
    //assertEquals();
  }
  
  public void testDisplay() {
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    GroceryItem tomato = new GroceryItem("Tomato", 2);
    
    GroceryListLinked veges = new GroceryListLinked();
    
    
  }
  
}
