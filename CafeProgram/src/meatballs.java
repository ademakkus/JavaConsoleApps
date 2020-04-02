public class meatballs extends item {


    public meatballs(String name, Double price, Double portion) {
        super(name, price);
        Portion = portion;
    }

    public Double getPortion() {
        return Portion;
    }

    public void setPortion(Double portion) {
        Portion = portion;
    }

    private  Double Portion;

    private meatballs(Double price, String name, Double portion) {
        super(name, price);
        Portion = portion;
    }
    public Double Calculate(Double price,Double portion)
    {
       // System.out.println("Please enter the items :"+getName());
        //System.out.println("");
        return price*portion;
    }

    @Override
    public String toString() {
        return Portion.toString();
    }
}
