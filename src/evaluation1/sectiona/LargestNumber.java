package evaluation1.sectiona;

import java.util.Arrays;

public class LargestNumber {
    public static int findLargest(int[] numbers) {

        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];

            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 3, 10};
        Arrays.sort(arr);
        int largestNumber = findLargest(arr);
        System.out.println("The largest number is: " + largestNumber);

    }
}
