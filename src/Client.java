public class Client {

    public static void main(String[] args) {


        IPrintable[] w = new IPrintable[]{

                new Word("Тестируем"),
                new Sign(' '),
                new Word("мою"),
                new Sign(' '),
                new Word("архитектуру"),
                new Sign('!')};

        Text t1 = new Text(w);

        t1.Print(new PrinterDefault());
        t1.Print(new PrinterSpecial());


        IPrinter ipd = new IPdelegate(new PrinterSpecial());

        t1.Print(ipd);
        char s = '1';
        Sign s1 = new Sign(s);
        s1.Print(new PrinterDefault());




    }

}
