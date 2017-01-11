package ShoppingBasket;
import java.util.*;

public class ShoppingBasket {

  ArrayList<Food> basket;


  public ShoppingBasket(){
    this.basket = new ArrayList<Food>();
  }

  public ArrayList getBasket(){
    return basket;
  }

  public void addToBasket(Food item){
    basket.add(item);
  }

  public Food getItemByName(String name){
    for (Food product : basket){
      if (product.getName().equals(name)){
        return product;
      }
    }
    return null;
  }

  public void  removeFromBasket(String item){
    for (Food product : basket ){
      if (product.getName().equals(item)){
        basket.remove(product);
      }
    }
  }

  public int basketCount() {
    int count =0;
    for (Food item : basket){
      if (item != null) {
        count++;
      }
    }
    return count;
  }


}
