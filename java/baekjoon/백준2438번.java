package baekjoon;

import java.util.Scanner;

public class 백준2438번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int j = 1; j <= n; j++)
        {
            for (int i = 1; i <= j; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

