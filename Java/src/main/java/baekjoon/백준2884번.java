package baekjoon;

import java.util.Scanner;

public class 백준2884번 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        if (m < 45) { // m 이 45 분 보다 작을 시
            h--;      // h 를 -1
            m = 60 - (45 - m); // m 은 60 - ( 45 - 입력값 )  ex ) m이 20 이면 60 - (45 - 20) = 35

            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}