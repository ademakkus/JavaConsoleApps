public abstract class item {


    public item(Double price, String name) {
        Price = price;
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private    Double Price;
private    String Name;
public item(String name,Double price){

this.Name=name;
this.Price=price;


    }

public abstract String toString();


}

