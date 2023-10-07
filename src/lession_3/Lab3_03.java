package lession_3;

import java.util.Arrays;

public class Lab3_03 {
    public static void main(String[] args) {
        int[] intArrSort = new int[]{12, 34, 1, 16, 28};
        for (int i = 0; i < intArrSort.length; i++) {
            for (int j = 0; j < intArrSort.length - 1; j++) {
                int temp = intArrSort[j];
                if (intArrSort[j] > intArrSort[j + 1]) {
                    intArrSort[j] = intArrSort[j + 1];
                    intArrSort[j + 1] = temp;
                }
            }
        }
        for (int i : intArrSort) {
            System.out.println(i);
        }
    }
}

