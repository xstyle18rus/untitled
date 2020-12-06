import java.util.Scanner;

public class Dz6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        short a = scanner.nextShort();
        byte c = 4;
        short e = 400;
        short r = 100;
        int b = a / c;
        float d = a % c;
        int q = a / e;
        float w = a % e;
        int t = a / r;
        float y = a % r;
//        System.out.println("%: " + a % c);
        if (w > 0 && d > 0 && y <= 0){
            System.out.println("not a leap year");
        }
        else if (d <= 0 && w <= 0 && y <= 0){
            System.out.println("leap year12");
        } else {
            System.out.println("leap year");

        }


    }
}
