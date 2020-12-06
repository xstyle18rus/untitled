import java.util.Scanner;

public class Dz2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your task is to enter 2 numbers from 0 to 9, so that the sum of these numbers is in the range from 10 to 20.");
        System.out.println("Enter the 1st number");
        byte a = scanner.nextByte();
        System.out.println("Enter the 2nd number");
        byte b = scanner.nextByte();
        int c = a + b;
        if (c >= 10 && c <= 20){
            System.out.println("Congratulations, the value is correct " + c);

        } else {
            System.out.println("Wrong");
        }
    }
}
