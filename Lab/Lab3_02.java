public class Lab3_02 {
    public static void main(String[] args) {

        int[] intArr = new int[]{1, 2, 3, 4, 5};
        int min = intArr[0]; // Assume the first element is the minimum
        int max = intArr[0]; // Assume the first element is the maximum

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            }
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
