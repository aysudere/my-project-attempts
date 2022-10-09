import java.util.Scanner;

public class FindTheHypotenuse {
    public static void main(String[] args) {

        System.out.println("This program for finding the hypotenuse");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter side length 1 : ");
        int len1 = scanner.nextInt();

        System.out.println("Please enter side length 2 :");
        int len2 = scanner.nextInt();

        double hypo = Math.sqrt((len1 * len1) + (len2 * len2));
        System.out.println("Your hypotenuse : " + hypo);
    }
}
