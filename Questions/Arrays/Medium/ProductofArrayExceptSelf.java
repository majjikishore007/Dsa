package Medium;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int before[] = new int[nums.length];
        before[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            before[i] = before[i - 1] * nums[i - 1];
        }
        int after[] = new int[nums.length];
        after[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            after[i] = nums[i + 1] * after[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            before[i] = before[i] * after[i];
        }
        return before;
    }
}
