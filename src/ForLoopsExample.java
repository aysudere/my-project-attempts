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
    }
}
