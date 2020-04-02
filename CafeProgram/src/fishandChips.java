public class fishandChips extends item {
    private   Double Portion;
    public fishandChips(String name,Double price, Double portion) {
        super(name,price);
        Portion = portion;

    }

    public Double getPortion() {
        return Portion;
    }

    public void setPortion(Double portion) {
        Portion = portion;
    }


    @Override
    public String toString() {

        return Portion.toString();
    }
}
