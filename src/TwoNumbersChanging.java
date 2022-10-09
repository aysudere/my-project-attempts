import java.util.Scanner;

public class TwoNumbersChanging {
    public static void main(String[] args) {
        /*
        kullanıcıdan aldığınız iki sayının değerini değiştirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number 1 : ");
        int n1 = scanner.nextInt();
        System.out.println("Your number 1 : " + n1);

        System.out.println("Please enter your number 2 :");
        int n2 = scanner.nextInt();
        System.out.println("Your number 2 : " + n2);

        int change;
        change = n1;
        n1 = n2;
        n2 = change;

        System.out.println("Now your number 1 : " + n1);
        System.out.println("Now your number 2 : " + n2);


    }
}
