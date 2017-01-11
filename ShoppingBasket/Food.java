package ShoppingBasket;

public class Food{

  String name;
  double price;

  public Food(String name, double price){
    this.name = name;
    this.price = price;
  }

  public String getName(){
    return this.name;
  }

  public double price(){
    return this.price;
  }
  
}