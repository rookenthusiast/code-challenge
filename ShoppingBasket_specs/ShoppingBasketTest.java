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
    item1 = new Food("bread", 0.70);
    item2 = new Food("milk", 1.20);
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

  @Test
  public void canEmptyBasket(){
    shoppingBasket.addToBasket(item1);
    shoppingBasket.addToBasket(item2);
    assertEquals(2,shoppingBasket.basketCount());
    shoppingBasket.emptyBasket();
    assertEquals(0,shoppingBasket.basketCount());
  }

  @Test
  public void canGetCost(){
    shoppingBasket.addToBasket(item1);
    shoppingBasket.addToBasket(item2);
    assertEquals(2,shoppingBasket.basketCount());
    assertEquals(1.9,shoppingBasket.shoppingCost(),0.01);
  }

  @Test
  public void tenPercentOffShopping(){
    assertEquals(19.80,shoppingBasket.tenPercentReductionOnCost(22.00),0.01);

    assertEquals(36.45,shoppingBasket.tenPercentReductionOnCost(40.50),0.01);
  }






}