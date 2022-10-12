import java.util.Scanner;

public class ForLoopsExample {
    public static void main(String[] args) {
        // This program will print 1 to 10
        for(int a = 1; a <= 10; a ++) {
            System.out.println(a);
        }

        //This program will try to print “Hello World” 5 times.
        for(int b = 1;  b <=5; b++) {
            System.out.println("Hello World");
        }

        //The following program prints the sum of x ranging from 1 to 20.
        int sum = 0;
        for(int c = 1; c <= 20; c++) {
            sum += c;
        }
        System.out.println("Sum : " + sum);

        for(int d=1; d<=5; d++){
            for(int e=1; e<=d; e++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }

        int term=6;
        for(int f=1; f<=term; f++){
            for(int g=term; g>=f; g--){
                System.out.print("* ");
            }
            System.out.println();//new line
        }

        //Write a program to find the sum of 5 integers.

        int sum1 = 0;
        Scanner scanner = new Scanner(System.in);
        for(int h = 1; h <= 5; h++) {
            System.out.println("Please enter int : ");
            int num = scanner.nextInt();
            sum1 += num;
        }
        System.out.println("Sum : " + sum1);

        //Write a java program to calculate the factorial value of given number. Factorial x –> x * x-1 * x-2…x*1

        int sum2 = 1;
        System.out.println("Please enter num : ");
        int num1 = scanner.nextInt();
        for(int k = 1; k <= num1 ; k++) {
            sum2 *= k;
        }
        System.out.println("Your total : " + sum2);


    }
}
