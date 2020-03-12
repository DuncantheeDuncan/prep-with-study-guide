package codes;

import java.util.Scanner;

public class FibonacciSeries {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of Fabonacca series: ");
        int n = scanner.nextInt();
        int t1 =0;
        int t2 =1;
        System.out.println("first "+ n + " terms: ");
        for (int i = 1;i <= n; i++){
            System.out.print(t1+ " , ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
