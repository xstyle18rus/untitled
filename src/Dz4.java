import java.util.Scanner;

public class Dz4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number");
        int a = scanner.nextInt();
        System.out.println(isNumber(a));
//        if (a >= 0){
//            System.out.println(false);
//        } else {
//            System.out.println(true);
//        }
    }

    static boolean isNumber(int a){
        if (a >= 0){
            return false;
        } else {
            return true;
        }

    }

}
