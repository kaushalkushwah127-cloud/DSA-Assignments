import java.util.Scanner;

public class RecursiveBinarySearch {

    static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            int leftResult = binarySearch(arr, target, low, mid - 1);

            if (leftResult != -1) {
                return leftResult;
            }

            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, high);
        }

        return binarySearch(arr, target, low, mid - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(binarySearch(arr, target, 0, n - 1));

        sc.close();
    }
}
