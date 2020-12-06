import java.util.Scanner;

public class Dz1 {

    public static void main(String[] args) {
        byte b1 = 127;
//	    от -128 до 127
        short s1 = 123;
//	    от -32,768 до 32,767
        int i1 = 123456;
        long l1 = 123456789;
        double d1 = 45;
//        нецелое число
        float f2 = 43213.5643F;
//        определение погрешности = F;  в конце
        boolean isDa = true;
        boolean isNet = false;
//        ссылка на истина или ложь
        char c1 = 'y';
//        char = 1 символ в ''

        String dZ = "Homework";
        System.out.println(dZ);
        System.out.println("Evaluate expression a * (b + (c / d))");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number a");
        float a = scanner.nextFloat();
        System.out.println("Insert the number b");
        float b = scanner.nextFloat();
        System.out.println("Insert the number с");
        float c = scanner.nextFloat();
        System.out.println("Insert the number d");
        float d = scanner.nextFloat();
        float result = a * (b + (c / d));
        System.out.println("Expression result = " + result);

    }

}
