public class MoveZeros {
    public static void moveZerosToEnd(int[] nums) {
        int index = 0; // Pointer to place non-zero elements
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZerosToEnd(nums);
        for (int num : nums) System.out.print(num + " ");
    }
}
