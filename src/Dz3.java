import java.util.Scanner;

public class Dz3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number");
        int a = scanner.nextInt();
        if (a >= 0){
            System.out.println("Positive number");
        } else {
            System.out.println("Number negative");
        }
    }
}
