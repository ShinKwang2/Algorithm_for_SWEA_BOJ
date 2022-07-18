package swea;

import java.util.Scanner;

public class SWEA_1961_숫자배열회전 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = kb.nextInt();
            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = kb.nextInt();
                }
            }



            //세팅 완료

            String str90 = "";
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j >= 0; j--) {
                    str90 += String.valueOf(arr[j][i]);
                }
                str90 += " ";
            }

            String str180 = "";
            for (int i = N - 1; i >= 0; i--) {
                for (int j = N - 1; j >= 0; j--) {
                    str180 += String.valueOf(arr[i][j]);
                }
                str180 += " ";
            }
//
            String str270 = "";
            for (int i = N - 1; i >= 0; i--) {
                for (int j = 0; j < N; j++) {
                    str270 += String.valueOf(arr[j][i]);
                }
                str270 += " ";
            }


            System.out.println("#" + tc);
            String[] s90 = str90.split(" ");
            String[] s180 = str180.split(" ");
            String[] s270 = str270.split(" ");

            for (int i = 0; i < N; i++) {
                System.out.println(s90[i] + " " + s180[i] + " " + s270[i]);
            }
        }
    }
}
