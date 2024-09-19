import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        long product = calculateProduct(n);
        System.out.println("Произведение чисел от 1 до " + n + " равно " + product);

        scanner.close();
    }

    public static long calculateProduct(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}