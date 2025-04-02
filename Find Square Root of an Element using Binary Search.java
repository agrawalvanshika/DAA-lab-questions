public class SqrtBinarySearch {
    public static int sqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 25;
        System.out.println("Square Root: " + sqrt(x));
    }
}

