import java.util.Arrays;

public class leftAndRight {
    
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
       
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        leftAndRight solution = new leftAndRight(); // Create an instance of the correct class

        // Example input array
        int[] nums = {10,4,8,3};

        // Calculate left-right differences using the provided method
        int[] result = solution.leftRightDifference(nums);

        // Print the results
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Left-Right Differences: " + Arrays.toString(result));
    }
}
