import java.util.Scanner;

public class AdvancedGradeCalculation {
    public static void main(String[] args) {
        /*
        kullanıcıdan v1 v2 ve final alınarak harf notu hesaplanır

        v1 % 30
        v2 % 30
        f % 40

        DD alma ve okul ort 2.5 altındaysa ekrana tavsiye mesajı
         */

        System.out.println("This is advanced grade calculation");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your midterm 1 : ");
        int m1 = scanner.nextInt();

        System.out.println("Please enter your midterm 2 : ");
        int m2 = scanner.nextInt();

        System.out.println("Please enter your final : ");
        int f = scanner.nextInt();

        System.out.println("Your school average : ");
        double average = scanner.nextDouble();

        double total = (m1 * 0.3) + (m2 * 0.3) + (f * 0.4);

        if(total >= 90) {
            System.out.println("Your total : AA");
        }
        else if(total >= 85) {
            System.out.println("Your total : BA");
        }
        else if(total >= 80) {
            System.out.println("Your total : BB");
        }
        else if(total >= 75) {
            System.out.println("Your total : CB");
        }
        else if(total >= 70) {
            System.out.println("Your total : CC");
        }
        else if(total >= 65) {
            System.out.println("Your total : DC");
        }
        else if(total >= 60) {
            System.out.println("Your total : DD");
            if(average < 2.5) {
                System.out.println("You need to work about for this lesson");
            }
        }
        else if(total >= 55) {
            System.out.println("Your total : FD");
        }
        else {
            System.out.println("Your total : FF");
        }




    }
}
