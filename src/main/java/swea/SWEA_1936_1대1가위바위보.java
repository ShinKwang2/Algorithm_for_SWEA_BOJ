package swea;

import java.util.Scanner;

public class SWEA_1936_1대1가위바위보 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();

        if (a - b == 1 || a - b == -2)
            System.out.println("A");
        else
            System.out.println("B");
    }
}
