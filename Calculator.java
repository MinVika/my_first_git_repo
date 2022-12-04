import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    System.out.print ("Введите первое число: ");
    float num1 = scan.nextFloat();
    System.out.print("Введите второе число: ");
    float num2 = scan.nextFloat();
    float res1 = num1 + num2;
    float res2 = num1 - num2;
    float res3 = num1 * num2;
    float res4 = num1 / num2;
    System.out.println ("Результат: ");
    System.out.println ("Добавление: " + res1 + "\n" + "Вычитание: " + res2 + "\n" + "Умнежение: " + res3 + "\n" + "Деление: " + res4);








    }

}
