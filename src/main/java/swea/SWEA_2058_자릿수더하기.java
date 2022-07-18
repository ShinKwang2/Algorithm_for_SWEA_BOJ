package swea;

import java.util.Scanner;

public class SWEA_2058_자릿수더하기 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int sum = 0;
        while (N != 0) {
            sum += (N % 10);
            N /= 10;
        }

        System.out.println(sum);
    }
}
