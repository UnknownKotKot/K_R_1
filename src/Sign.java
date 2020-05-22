public class Sign implements IPrintable {
    private final char sgn;

    Sign(char sgn) {
        this.sgn = sgn;
    }

    public void Print(IPrinter p) {
        p.doPrint(sgn);
    }
}


