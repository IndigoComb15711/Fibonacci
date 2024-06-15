// Recursive //

import java.util.Scanner;

public class Per1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.println("So hoan vi n phan tu la: " + Hoanvi(n));
        sc.close();
    }
    public static int Hoanvi(int m) {
        if (m == 1) 
            return 1;
            return (m * Hoanvi(m-1));
    }
}