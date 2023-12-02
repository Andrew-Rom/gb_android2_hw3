package gb.jdk;

public class MyCustomCalc {
    public static <W extends Number, X extends Number> Double sum(W n1, X n2) {
        return n1.doubleValue() + n2.doubleValue();
    }

    public static <W extends Number, X extends Number> Double multiply(W n1, X n2) {
        return n1.doubleValue() * n2.doubleValue();
    }

    public static <W extends Number, X extends Number> Double divide(W n1, X n2) {
        if (n2.doubleValue() == 0) {
            throw new ArithmeticException("Zero cannot divide any number");
        }
        return n1.doubleValue() / n2.doubleValue();
    }

    public static <W extends Number, X extends Number> Double subtract(W n1, X n2) {
        return n1.doubleValue() - n2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(MyCustomCalc.sum(111, 222.0));
        System.out.println(MyCustomCalc.subtract(123, 23));
        System.out.println(MyCustomCalc.subtract(23, 123.0f));
        System.out.println(MyCustomCalc.multiply(11.9d, 3));
        System.out.println(MyCustomCalc.divide(12, 3));
        System.out.println(MyCustomCalc.divide(11, 2));
        System.out.println(MyCustomCalc.divide(2, 0)); // exception is expected
    }

}
