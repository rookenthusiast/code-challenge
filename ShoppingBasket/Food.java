package ShoppingBasket;

public class Food{

  String name;
  int price;

  public Food(String name, int price){
    this.name = name;
    this.price = price;
  }

  public String getName(){
    return this.name;
  }

  public int price(){
    return this.price;
  }
  
}