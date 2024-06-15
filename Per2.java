// No Recursive //

import java.util.Scanner;

public class Per2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        int hoanvi = n;
        for (int i = 1; i < n; i++) {
            hoanvi = hoanvi * (n - i);
        }
        System.out.println("So hoan vi n phan tu la: " + hoanvi);
        sc.close();
    }
}
