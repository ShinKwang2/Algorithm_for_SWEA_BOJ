package swea;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2063_중간값찾기 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr);
        int middle = T / 2;
        System.out.println(arr[middle]);
    }
}
