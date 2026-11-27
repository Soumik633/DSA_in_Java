package LC_Q50_Pow_Of_A_Num;

import java.util.Scanner;

public class Pow_Of_A_Num {

    public double myPow(double x, int n) {
        long power = n;

        if (power == 0) {
            return 1.0;
        }

        boolean isNegative = power < 0;

        if (isNegative) {
            power = -power;
        }

        double ans = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans = ans * x;
            }

            x *= x;
            power >>= 1;
        }

        return isNegative ? 1.0 / ans : ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x:- ");
        double x = sc.nextDouble();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Pow_Of_A_Num obj = new Pow_Of_A_Num();

        double result = obj.myPow(x, n);

        System.out.println("Result: " + result);

        sc.close();
    }
}