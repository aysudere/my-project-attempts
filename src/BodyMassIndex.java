import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        /*
        kullanıcıdan alınan boy ve kilo indekslerine göre beden kitle indeksi hesaplanır
        bki : kilo / boy * boy
        bki < 18.5 zayıf
        18.5 < bki <25 normal
        25 < bki < 30 kilolu
        30 < bki obez
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculate your body mass index");
        System.out.println("Please enter your weight : ");
        int weight = scanner.nextInt();

        System.out.println("Please enter your height : ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your body mass index : " + bmi);

        if(bmi < 18.5) {
            System.out.println("You are slim");
        }
        else if(18.5 <= bmi && bmi < 25) {
            System.out.println("You are normal");
        }
        else if (25 <= bmi && bmi < 30) {
            System.out.println("You are fat");
        }
        else {
            System.out.println("You are obese");
        }
    }
}


