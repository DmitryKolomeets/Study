import java.util.Scanner;

public class Bank {

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Введите имя: ");
    String name = in.nextLine();

    System.out.println("Введите фамилию: ");
    String surname = in.nextLine();

    System.out.println("Введите сумму взноса: ");
    double vznos = in.nextDouble();

    System.out.println("Введите процент ставки взноса: ");
    double stavka = in.nextDouble();

    double procent = vznos / 100;                          // We count 1% of the deposit amount
    double deposit = vznos + (stavka * procent);           // We count the deposit for the year

    System.out.println(name + " " + surname +" Ваш депозит за год составит: " + deposit);
    in.close();



    }
}
