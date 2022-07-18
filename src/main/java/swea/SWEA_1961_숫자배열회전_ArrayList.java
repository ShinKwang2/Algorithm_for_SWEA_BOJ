package swea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_1961_숫자배열회전_ArrayList {
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
            List<String> arr90 = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String str90 = "";
                for (int j = N - 1; j >= 0; j--) {
                    str90 += String.valueOf(arr[j][i]);
                }
                arr90.add(str90);
            }

            List<String> arr180 = new ArrayList<>();
            for (int i = N - 1; i >= 0; i--) {
                String str180 = "";
                for (int j = N - 1; j >= 0; j--) {
                    str180 += String.valueOf(arr[i][j]);
                }
                arr180.add(str180);
            }

            List<String> arr270 = new ArrayList<>();
            for (int i = N - 1; i >= 0; i--) {
                String str270 = "";
                for (int j = 0; j < N; j++) {
                    str270 += String.valueOf(arr[j][i]);
                }
                arr270.add(str270);
            }


            System.out.println("#" + tc);
            for (int i = 0; i < arr90.size(); i++) {
                System.out.println(arr90.get(i) + " " + arr180.get(i) + " " + arr270.get(i));
            }
        }
    }
}
