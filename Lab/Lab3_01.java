public class Lab3_01 {
    public static void main(String[] args) {
        int[] myIntArr = new int[]{1, 2, 3, 4, 5};
        int evenNumb = 0;
        int oddNumb = 0;

        for (int num : myIntArr) {

            if (num % 2 == 0) {
                evenNumb++;
            } else {
                oddNumb++;
            }
        }

        System.out.println("Even numbers: " + evenNumb);
        System.out.println("Odd numbers: " + oddNumb);
    }
}

