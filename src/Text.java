import javafx.print.Printer;

public class Text implements IPrintable {
    IPrintable[] table ;

    Text(IPrintable[] table) {
        this.table = table;
    }

    public void Print(IPrinter s) {
        int l ;
        l = table.length;
        for (int i = 0; i < l; i++) {
            table[i].Print(s);
        }
            }


}
