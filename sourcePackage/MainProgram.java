package sourcePackage;
import java.util.Scanner;

import sourcePackage.Resources;

public class MainProgram{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to abans epic menu driven program! ");
        System.out.println(
                "PRESS NUMBER ASSOCIATED WITH FUNCTION LISTED \n 1: Pascal triangle \n 2: Check Leap Year \n 3: Random Number Generator \n 4: Bubble Sort Strings \n 5: Prime numbers \n 6: Amstrong number \n 7: find Circumfrence \n 8: Finding Average \n 9: Integer To Digits \n 10:(fun) get IP");
        switch (sc.nextInt()) {
            // functions go in here
            case 1:
                Resources.PascalTriangle();
                break;

            case 2:
                Resources.IsLeapYear();
                break;
            case 3:
                Resources.RandomGenerate();
                break;
            case 4:
                Resources.BubbleSortStrings();
                break;
            case 5:
                Resources.PrimeNumbers();
                break;
            case 6:
                Resources.Amstrong();
                break;
            case 7:
                Resources.Circumfrence();
                break;
            case 8:
                Resources.Average();
                break;
            case 9:
                Resources.IntToDigits();
                break;
            case 10:
                try {
                    Resources.getIP();
                } catch (Exception e) {
                    System.out.println("oopsie");
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("fatal error,try again");
        }

        sc.close();
    }
}