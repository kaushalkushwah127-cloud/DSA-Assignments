import java.util.Scanner;

public class MaximumElementArray {

    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int max = findMax(arr, index + 1);

        return Math.max(arr[index], max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMax(arr, 0));

        sc.close();
    }
}
