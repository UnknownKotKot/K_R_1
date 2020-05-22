public class IPdelegate implements IPrinterDelegate{


    private final IPrinter printer;

    IPdelegate(IPrinter table){

        this.printer =table;
    }

    public void delPrint(Text p) {
        p.Print(this);
    }
    public void delPrint(Sign p) {
        p.Print(this);
    }

    @Override
    public void doPrint(String p) {
        printer.doPrint(p);
    }

    @Override
    public void doPrint(char p) {
        printer.doPrint(p);
    }
}
