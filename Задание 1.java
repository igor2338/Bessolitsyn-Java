import java.util.Scanner;
/*
Составить алгоритм: если введенное число больше 7, то вывести "Привет"
*/
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print ("Введите число: ");
        if (console.hasNextDouble()){
        double num = console.nextDouble();
            if (num > 7)
                System.out.println("Привет");
        }

    }
}