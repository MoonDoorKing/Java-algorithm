package programmers;

import java.util.Scanner;

public class 별찍기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int d=0; d < b; d++)
        {
            for(int i=0; i < a; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}