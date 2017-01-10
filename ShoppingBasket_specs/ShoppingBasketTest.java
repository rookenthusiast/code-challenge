import static org.junit.Assert.*;
import org.junit.*;
import ShoppingBasket.*;

public class ShoppingBasketTest{
  ShoppingBasket shoppingBasket;

  @Before
  public void before(){
    shoppingBasket = new ShoppingBasket();
  }

  @Test
  public void canGetBasket(){
    assertEquals(0, shoppingBasket.basketCount());
  }
}