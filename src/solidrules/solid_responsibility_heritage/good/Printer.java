package solidrules.solid_responsibility_heritage.good;

public class Printer {
    public void print(Printable printable) {
        System.out.println(printable.getContent());
    }
}
