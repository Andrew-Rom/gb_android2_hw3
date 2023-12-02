package gb.jdk;

public class Pair<E, T> {
    private final E item1;
    private final T item2;

    public Pair(E item1, T item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public E getFirst() {
        return item1;
    }

    public T getSecond() {
        return item2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "First item=" + item1 +
                ", Second item=" + item2 +
                '}';
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("first", 2);
        Pair<Double, Float> pair2 = new Pair<>(1.2, 1.2f);
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair1.getFirst());
        System.out.println(pair2.getSecond() + " - " + pair2.getSecond().getClass().getSimpleName());
    }
}
