package gb.jdk;

import java.util.Arrays;
import java.util.Iterator;

public class MyCustomCollection<E> implements Iterable<E> {
    private final int SIZE = 10;
    private final int CORRECTOR = 2;
    private Object[] array = new Object[SIZE];
    private int pivot = 0;

    public void add(E item) {
        if (pivot == array.length - 1)
            resize(array.length * CORRECTOR);
        array[pivot++] = item;
    }

    public E get(int index) {
        return (E) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pivot; i++)
            array[i] = array[i + 1];
        array[pivot] = null;
        pivot--;
        if (array.length > SIZE && pivot < array.length / CORRECTOR)
            resize(array.length / CORRECTOR);
    }

    public int size() {
        return pivot;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pivot);
        array = newArray;
    }

    @Override
    public String toString() {
        return Arrays.stream(array).limit(pivot).toList().toString();
    }

    class MyIterator implements Iterator<E> {
        private int currentIndex;

        public MyIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size() && array[currentIndex] != null;
        }

        @Override
        public E next() {
            return (E) array[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }


    // Realization below
    public static void main(String[] args) {
        String t1 = "tt1";
        String t2 = "tt2";
        String t3 = "tt3";
        String t4 = "tt4";
        Integer kk = 555;
        MyCustomCollection<Object> col = new MyCustomCollection<>();
        col.add(t1);
        col.add(kk);
        col.add(t2);
        col.add(t3);
        col.add(t4);

        System.out.println(col);

        System.out.println("\n--- Contents of the collection ---");
        for (Object item : col) {
            System.out.println(item + " " + item.getClass().getSimpleName());
        }
        System.out.println("size: " + col.size());

        System.out.println("\nItem [" + col.get(3) + "] was removed.");
        col.remove(3);

        System.out.println("\n--- New contents of the collection ---");
        for (Object item : col) {
            System.out.println(item + " " + item.getClass().getSimpleName());
        }
        System.out.println("size: " + col.size());

    }
}
