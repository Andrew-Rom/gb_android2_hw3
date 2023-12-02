package gb.jdk;

public class MyCustomCalc {
    public static <W extends Number, X extends Number> Integer sum(W n1, X n2) {
        return n1.intValue() + n2.intValue();
    }

    public static <W extends Number, X extends Number> Integer multiply(W n1, X n2) {
        return n1.intValue() * n2.intValue();
    }

    public static <W extends Number, X extends Number> Float divide(W n1, X n2) {
        if (n2.floatValue() == 0) {
            throw new ArithmeticException("Zero cannot divide any number");
        }
        return n1.floatValue() / n2.floatValue();
    }

    public static <W extends Number, X extends Number> Integer subtract(W n1, X n2) {
        return n1.intValue() - n2.intValue();
    }

    public static void main(String[] args) {
        System.out.println(MyCustomCalc.sum(111, 222));
        System.out.println(MyCustomCalc.subtract(123, 23));
        System.out.println(MyCustomCalc.subtract(23, 123));
        System.out.println(MyCustomCalc.multiply(11, 3));
        System.out.println(MyCustomCalc.divide(12, 3));
        System.out.println(MyCustomCalc.divide(11, 2));
        System.out.println(MyCustomCalc.divide(2, 0)); // exception is expected
    }

}
