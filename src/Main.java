import java.util.Scanner;

public class Main {
    double EPS = 1e-9;
    public static double calculate(int n, int depth) {
        if (depth == 0) {
            // Базовый случай: дальше корней нет
            return 0.0;
        }
        double inner = calculate(n + 1, depth - 1);
        System.out.println("Calc sqrt(" + (6.0 + n) + " + " + (n + 2) + " * in_sqrt==" + inner + ")" );
        return Math.sqrt((6.0 + n) + (n + 2) * inner);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите глубину вложенности N: ");
        int depth = scanner.nextInt();
        scanner.close();

        double result = calculate(0, depth);
        System.out.printf(
                "При глубине вложенности %d значение выражения ≈ %.10f%n",
                depth, result
        );
    }
}
