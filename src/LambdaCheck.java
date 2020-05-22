public class LambdaCheck {

    static MyValue myVal = () -> 98.6;

    public static void main(String[] args) {
        System.out.println(myVal.getValue());
    }

}
