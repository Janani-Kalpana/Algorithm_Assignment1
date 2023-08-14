public class Algo2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

        // Initialize min and max with the first element of the array
        int min = nums[0];
        int max = nums[0];

        // Iterate through the array to find the min and max
        for (int num : nums) {
            if (num < min) {
                min = num;  // Update min if a smaller value is found
            }
            if (num > max) {
                max = num;  // Update max if a larger value is found
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
