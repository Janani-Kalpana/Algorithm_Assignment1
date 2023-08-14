import java.util.Arrays;

public class Algo4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        // Invert the order of elements within the same array
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            // Swap elements at start and end pointers
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        // Print the nums array
        System.out.println("Inverted nums array: " + Arrays.toString(nums));
    }
}

