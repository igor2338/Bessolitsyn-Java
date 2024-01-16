import java.util.Random;

/*
Составить алгоритм: на входе есть числовой массив, необходимо
вывести элементы массива кратные 3
*/
public class Main {
    public static void main(String[] args) {
        boolean v = false;
        int [] array = new int [10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(10);
            if (array[i] == 0)
                continue;
            if (array[i] % 3 == 0) {
                v = true;
                System.out.print(array[i] + " ");
            }
        }
        if (v == false)
            System.out.print("Числа кратные 3-м в массиве отсутствуют.");

    }
}