package LC_Q258_AddDigits;

import java.util.Scanner;

public class AddDigits {

    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        AddDigits obj = new AddDigits();

        int result = obj.addDigits(num);

        System.out.println("Single Digit Sum: " + result);

        sc.close();
    }
}
