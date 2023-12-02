package gb.jdk;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;

public class General<T extends Comparable, V extends InputStream & DataInput, K extends Number> {
    public T t;
    public V v;
    public K k;

    public General(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void getInfo() {
        System.out.println("Value: " + getT() + " (type: " + t.getClass().getSimpleName() + ").");
        System.out.println("Value: " + getV() + " (type: " + v.getClass().getSimpleName() + ").");
        System.out.println("Value: " + getK() + " (type: " + k.getClass().getSimpleName() + ").");
    }

    public static void main(String[] args) {
        String tt = "ttt";
        DataInputStream vv = new DataInputStream(System.in);
        Integer kk = 5;
        General<String, DataInputStream, Number> general = new General<>(tt, vv, kk);
        general.getInfo();
    }

}
