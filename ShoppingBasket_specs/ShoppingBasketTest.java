import static org.junit.Assert.*;
import org.junit.*;
import ShoppingBasket.*;

public class ShoppingBasketTest{
  ShoppingBasket shoppingBasket;
  Food item1;
  Food item2;

  @Before
  public void before(){
    shoppingBasket = new ShoppingBasket();
    item1 = new Food("bread", 70);
    item2 = new Food("milk", 1);
  }

  @Test
  public void canGetBasket(){
    assertEquals(0, shoppingBasket.basketCount());
  }

  @Test
  public void canAddToBasket(){
    
    shoppingBasket.addToBasket(item1);
    shoppingBasket.addToBasket(item2);
    
    assertEquals(2,shoppingBasket.basketCount());
    assertEquals("bread", shoppingBasket.getItemByName("bread").getName());
  }

  @Test
  public void canRemoveFromBasket(){
    shoppingBasket.addToBasket(item1);
    shoppingBasket.addToBasket(item2);

    assertEquals(2,shoppingBasket.basketCount());

    shoppingBasket.removeFromBasket("bread");

    assertEquals(1,shoppingBasket.basketCount());

  }


}