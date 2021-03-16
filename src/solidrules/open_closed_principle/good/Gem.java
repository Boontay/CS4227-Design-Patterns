package solidrules.open_closed_principle.good;

public class Gem extends Product{
    @Override
    public double calculateTaxIncludedPrice() {
        return getBasePrice();
    }
}
