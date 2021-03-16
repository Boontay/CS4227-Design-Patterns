package solidrules.dependency_inversion_principle.bad;

public class PrinterDesk {
    private DotMatrixPrinterPrinter printer;

    public PrinterDesk(DotMatrixPrinterPrinter printer) {
        super();
        this.printer = printer;
    }

    public void printFile(){
        printer.print("File Content");
    }
}
