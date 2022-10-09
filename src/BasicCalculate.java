import java.util.Scanner;

public class BasicCalculate {
    public static void main(String[] args) {
        /*
        switch case kullanarak basit hesap makinesi
         */

        System.out.println("Your option : " +
                " 1.+" +
                " 2.-" +
                " 3.*" +
                " 4./");
        System.out.println("Please switch your option : ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        System.out.println("Please enter your number 1 : ");
        int n1 = scanner.nextInt();

        System.out.println("Please enter your number 2 :");
        int n2 = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Result : " + (n1+n2));
                break;
            case 2:
                System.out.println("Result : " + (n1-n2));
                break;
            case 3:
                System.out.println("Result : " + (n1*n2));
                break;
            case 4:
                System.out.println("Result : " + (double)(n1/n2));
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
