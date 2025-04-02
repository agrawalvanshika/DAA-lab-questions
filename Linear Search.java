public class LinearSearch {
    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == x) return i;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        System.out.println("Element found at index: " + search(arr, 10));
    }
}
