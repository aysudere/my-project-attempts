import java.util.Scanner;

public class FindMaximumNumber {
    public static void main(String[] args) {

        System.out.println("This program for find the maximum number");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1 : ");
        int n1 = scanner.nextInt();

        System.out.println("Please enter number 2 :");
        int n2 = scanner.nextInt();

        System.out.println("Please enter number 3 :");
        int n3 = scanner.nextInt();

        int maks = 1;
        if(n1 >= n2 && n1 >= n3) {
            maks = n1;
            System.out.println("Biggest number : " + maks);
        }
        else if(n2 >= n1 && n2 >= n3) {
            maks = n2;
            System.out.println("Biggest number : " + maks);
        }
        else {
            maks = n3;
            System.out.println("Biggest number : " + maks);
        }
    }
}
