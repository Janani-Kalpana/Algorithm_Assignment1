import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        // Create a new array with the same length as nums
        int[] reversedArray = new int[nums.length];

        // Populate the new array in the opposite sequence
        for (int i = 0; i < nums.length; i++) {
            reversedArray[i] = nums[nums.length - 1 - i];
        }

        // Assign the memory location of the new array to nums
        nums = reversedArray;

        // Print the nums array
        System.out.println("nums array in the opposite sequence: " + Arrays.toString(nums));
    }
}
