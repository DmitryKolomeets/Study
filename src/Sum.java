import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Введите  первое число: ");
        int num1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.printf("Сумма двух чисел равна = %d \n", num1 + num2 );
        in.close();

    }
}
