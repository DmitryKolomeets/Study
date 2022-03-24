import java.util.Scanner;

public class Bank {

public static void main(String[] args) {

    double stavka = 17.5; // Interest rate per year

    Scanner in = new Scanner(System.in);

    System.out.println("Введите имя: ");
    String name = in.nextLine();

    System.out.println("Введите фамилию: ");
    String surname = in.nextLine();

    System.out.println("Введите сумму взноса: ");
    double vznos = in.nextDouble();

    double procent = vznos / 100;                          // We count 1% of the deposit amount
    double deposit = vznos + (stavka * procent);           // We count the deposit for the year

    System.out.println(name + " " + surname +" Ваш депозит за 1 год составит: " + deposit);          // We display the deposit for 1 year
    System.out.println(name + " " + surname +" Ваш депозит за 5 лет составит: " + (deposit * 5));    // We display the deposit for 5 year
    System.out.println(name + " " + surname +" Ваш депозит за 10 лет составит: " + (deposit * 10));  // We display the deposit for 10 year
    in.close();



    }
}
