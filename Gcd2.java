// No Recursive //

import java.util.Scanner;

public class Gcd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 =");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 =");
        int num2 = sc.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println("Uoc chung lon nhat: " + gcd);
        sc.close();
    }
    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    
}
