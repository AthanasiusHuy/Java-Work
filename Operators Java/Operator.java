import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //bai 1
        int length = 5;
        int width = 7;
        int perimeter = 2 * length + 2 * width;
        int area = length * width;
        System.out.println("PERIMETER: " + perimeter + " " + "AREA: " + area);

        // bai 2
        int a = 2;
        int b = 3;
        int c = 5;
        perimeter = a + b + c;
        System.out.println("PERIMETER " + perimeter);

        // bai 3
        double result;
        result = (((8 + 2345) / 3) - 5) * 5;
        System.out.println(result);

        // bai 4
        perimeter = 0;
        area = 1;
        perimeter += 2 * length;
        perimeter += 2 * width;
        area *= length;
        area *= width;

        System.out.println("PERIMETER: " + perimeter + " " + "AREA: " + area);

        perimeter = 0;
        perimeter += a;
        perimeter += b;
        perimeter += c;

        System.out.println("PERIMETER " + perimeter);

        // bai 5
        boolean check;
        check = 23 == 45;
        System.out.println(check);

        // // bai 6
        result = Math.pow(7, 5);
        System.out.println(result);

        // // bai 7
        a = 55;
        b = 70;
        boolean check2;
        check = a < 50;
        check2 = a < b;
        System.out.println(check + " " + check2);

        // bai 8
        if (check == true || check2 == true) {
        System.out.println("Yes");
        }

        // // bai 9
        double total;
        int sub1 = 78, sub2 = 45, sub3 = 62;
        total = sub1 + sub2 + sub3;

        // bai 10

        System.out.println("Input a: ");
        a = scanner.nextInt();
        System.out.println("Input b: ");
        b = scanner.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Out: " + a + " " + b);

        // bai 11
        int girl;
        girl = 45 - 20;
        System.out.println("Girl Get A: " + girl);

        // bai 12
        int digit;
        int num1, num2, num3, num4;
        System.out.println("Enter 5 digit");
        digit = scanner.nextInt();
        num1 = digit / 10000;
        num4 = (digit % 100) / 10;
        System.out.println(num1 + num4);

        // bai 13
        System.out.println("Enter 4 digit");
        digit = scanner.nextInt();
        System.out.println(digit + 2222);

        // bai 14
        System.out.println("Enter 3 digit");
        digit = scanner.nextInt();
        num1 = digit / 100;
        num2 = (digit % 100) / 10;
        num3 = (digit % 10);
        System.out.println(num1 + num2 + num3);

        // bai 15
        System.out.println("Enter 3 digit");
        digit = scanner.nextInt();
        num1 = digit / 100;
        num2 = (digit % 100) / 10;
        num3 = (digit % 10);
        num1 = num1 ^ num3;
        num3 = num1 ^ num3;
        num1 = num1 ^ num3;
        System.out.println(num1 * 100 + num2 * 10 + num3);    
    }
}