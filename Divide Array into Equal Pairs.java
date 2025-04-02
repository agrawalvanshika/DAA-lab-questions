import java.util.HashMap;

public class DivideArrayEqualPairs {
    public static boolean canDivideIntoPairs(int[] nums) {
        if (nums.length % 2 != 0) return false;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int count : freqMap.values()) {
            if (count % 2 != 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 3, 2, 2, 4, 4};
        System.out.println("Can divide into equal pairs: " + canDivideIntoPairs(nums));
    }
}
