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

  public void emptyBasket(){
    basket.clear();
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

  public double initialShoppingCost(){
    double total = 0;
    for (Food item : basket){
     total += item.price;
   }
   return total;
 }

 public int checkInstancesOfProduct(String product){
  int counter = 0;
  for (Food item : basket){
    if(item.getName().equals(product)){
      counter += 1;
    }
  }
  return counter;
}

// public double buyOneGetOneFreeFilter(int items){

//   if(items/2.equals(true)){
    
//   }
// }


public double tenPercentReductionOnCost(double cost){
  double total = 0;
  if (cost > 20.00){
    total += (cost / 10);
  }
  return cost -= total;
}

public double totalShoppingCost(){
  subTotal = initialShoppingCost();
  tenPercentDiscountCheck = tenPercentReductionOnCost(subTotal);
  return tenPercentDiscountCheck;
}


}
