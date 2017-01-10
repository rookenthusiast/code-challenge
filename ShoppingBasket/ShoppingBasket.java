package ShoppingBasket;
import java.util.*;

public class ShoppingBasket {

  ArrayList<Shopable> basket;

  public ShoppingBasket(){
    this.basket = new ArrayList<Shopable>();
  }

  public ArrayList getBasket(){
    return basket;
  }

  public void addToBasket(Shopable item){
    basket.add(item);
  }

  public void  removeFromBasket(Shopable item){
    for (Shopable product : basket ){
      if (product.equals(item)){
        basket.remove(product);
      }
    }
  }

  public int basketCount() {
    int count =0;
    for (Shopable item : basket){
      if (item != null) {
        count++;
      }
    }
    return count;
  }


}
