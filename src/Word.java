public class Word implements IPrintable {

    private final String str;

    Word(String str) {
        this.str = str;
    }

    public void Print(IPrinter p) {
        p.doPrint(str);
    }

}



