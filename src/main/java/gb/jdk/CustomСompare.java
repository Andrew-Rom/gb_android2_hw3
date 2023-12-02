package gb.jdk;

import java.util.Arrays;

public class CustomСompare {

    private static <E> boolean compareArrays(E[] array1, E[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].getClass().getSimpleName().equals(array2[i].getClass().getSimpleName())) {
                return false;
            }
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String [] arr1 = {"1", "2", "3"};
        String [] arr2 = {"1", "2", "3"};
        String [] arr3 = {"1", "2", "3", "4"};
        Integer [] arr4 = {1, 2, 3};
        Double[] arr5 = {1.0, 2.0, 3.0};
        Object[] arr6 = {1, 2, 3};
        Float[] arr7 = {1.0f, 2.0f, 3.0f};
        Number[] arr8 = {1.0f, 2.0f, 3.0f};
        Number[] arr9 = {1.0, 2.0, 3.0};

        System.out.println(Arrays.toString(arr1) + "\t"
                + Arrays.toString(arr2) + "\t"
                +  CustomСompare.compareArrays(arr1, arr2));

        System.out.println(Arrays.toString(arr1) + "\t"
                + Arrays.toString(arr3) + "\t"
                +  CustomСompare.compareArrays(arr1, arr3));

        System.out.println(Arrays.toString(arr1) + "\t"
                + Arrays.toString(arr4) + "\t"
                +  CustomСompare.compareArrays(arr1, arr4));

        System.out.println(Arrays.toString(arr4) + "\t"
                + Arrays.toString(arr5) + "\t"
                +  CustomСompare.compareArrays(arr4, arr5));

        System.out.println(Arrays.toString(arr4) + "\t"
                + Arrays.toString(arr6) + "\t"
                +  CustomСompare.compareArrays(arr4, arr6));

        System.out.println(Arrays.toString(arr5) + "\t"
                + Arrays.toString(arr7) + "\t"
                +  CustomСompare.compareArrays(arr5, arr7));

        System.out.println(Arrays.toString(arr7) + "\t"
                + Arrays.toString(arr8) + "\t"
                +  CustomСompare.compareArrays(arr7, arr8));

        System.out.println(Arrays.toString(arr5) + "\t"
                + Arrays.toString(arr9) + "\t"
                +  CustomСompare.compareArrays(arr5, arr9));

    }
}
