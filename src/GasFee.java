import java.util.Scanner;

public class GasFee {
    public static void main(String[] args) {
        /*
        aracın km başına ne kadar yaptığı
        ve kaç km yaptığı bilgilerini alarak kaç para ödemesi gerektiği
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate your gas fee");

        System.out.println("How many km did you drive :");
        double km = scanner.nextDouble();

        System.out.println("How many liters of fuel do you use per km?");
        double fuel = scanner.nextDouble();

        double total = km * fuel;
        System.out.println("The fee you have to pay : " + total + "TL");

    }
}
