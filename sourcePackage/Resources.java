package sourcePackage;
import java.net.InetAddress;
import java.util.Random;
import java.util.Scanner;


public class Resources {
    public static Scanner sc = new Scanner(System.in);
    // function for 1

    static void PascalTriangle() {
        int no_row, c = 1, blk, i, j;

        System.out.print("Input number of rows: ");
        no_row = sc.nextInt();

        for (i = 0; i < no_row; i++) {
            for (blk = 1; blk <= no_row - i; blk++)
                System.out.print(" ");

            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;

                else
                    c = c * (i - j + 1) / j;

                System.out.print(" " + c);
            }

            System.out.print("\n");
        }
    }

    // function for 2
    static void IsLeapYear() {
        int year;

        System.out.println("Enter any Year: ");
        year = sc.nextInt();
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;

                else
                    isLeap = false;
            }

            else
                isLeap = true;
        }

        else {
            isLeap = false;
        }

        if (isLeap)
            System.out.println(year + " is a Leap Year.");

        else
            System.out.println(year + " is not a Leap Year.");
    }

    // function for 3

    static void RandomGenerate() {
        int counter;
        Random rnum = new Random();
        // generate 5 random numbers between 0 and 200.
        System.out.println("Random Numbers:");
        System.out.println("***************");
        for (counter = 1; counter <= 5; counter++) {
            System.out.println(rnum.nextInt(200));
        }
    }

    // function for 4

    static void BubbleSortStrings() {
        String str[] = { "Aban", "Gyan", "Nehan", "Felix", "Zach" };
        String temp;
        System.out.println("Strings in sorted order:");
        for (int j = 0; j < str.length; j++) {
            for (int i = j + 1; i < str.length; i++) {
                // comparing adjacent strings
                if (str[i].compareTo(str[j]) < 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
            System.out.println(str[j]);
        }
    }

    // function for 5
    static void PrimeNumbers() {
        int n;
        int status = 1;
        int num = 3;
        // For capturing the value of n
        System.out.println("Enter the value of n:");
        // The entered value is stored in the var n
        n = sc.nextInt();
        if (n >= 1) {
            System.out.println("First " + n + " prime numbers are:");
            // 2 is a known prime number
            System.out.println(2);
        }

        for (int i = 2; i <= n;) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }

    // function for 6
    static void Amstrong() {
        System.out.println("Enter the number");
        int num = sc.nextInt(), number, temp, total = 0;

        number = num;
        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }

        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }

    // function for 7
    static void Circumfrence() {
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        // Area = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        // Circumference = 2*PI*radius
        double circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of the circle is:" + circumference);
    }

    // function for 8
    static void Average() {
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("the average is" + average);
    }

    // function for 9
    static void IntToDigits() {
        System.out.print("Enter any number:");
        int num = sc.nextInt(), temp, digit, count = 0;
        temp = num;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        while (temp > 0) {
            digit = temp % 10;
            System.out.println("Digit at place " + count + " is: " + digit);
            temp = temp / 10;
            count--;
        }
    }

    // function for 10
    static void getIP() throws Exception {
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println("My IP Address is:");
        System.out.println(myIP.getHostAddress());
    }
}