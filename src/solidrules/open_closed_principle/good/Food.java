package solidrules.open_closed_principle.good;

public class Food extends Product{
    @Override
    public double calculateTaxIncludedPrice() {
        return getBasePrice()*1.08;
    }
}