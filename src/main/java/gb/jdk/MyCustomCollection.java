package gb.jdk;

import java.util.Iterator;

public class MyCustomCollection<E> implements Iterable<E> {
    private final int SIZE = 10;
    private Object[] array = new Object[SIZE];
    private int pivot = 0;

    public void add(E item) {
        if (pivot == array.length - 1)
            resize(array.length * 2);
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
        if (array.length > SIZE && pivot < array.length / 2)
            resize(array.length / 2);
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
    public Iterator<E> iterator() {
        return new Iterator<>() {

            private int currentIndex = 0;

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
        };
    }

    // Далее тестирование кода
    public static void main(String[] args) {
        String t1 = "tt1";
        String t2 = "tt2";
        String t3 = "tt3";
        String t4 = "tt4";
        Integer kk = 55555;
        MyCustomCollection<Object> col = new MyCustomCollection<>();
        col.add(t1);
        col.add(kk);
        col.add(t2);
        col.add(t3);
        col.add(t4);
        System.out.println(col.get(0));
        System.out.println(col.get(1));
        System.out.println(col.get(3));
        System.out.println(col.size());
        col.remove(3);
        System.out.println(col.get(3));
        System.out.println(col.size());

        System.out.println("--- Iteration ---");
        for (Object item : col) {
            System.out.println(item + " " + item.getClass().getSimpleName());
        }

    }
}