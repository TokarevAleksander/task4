import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();
        calculator.setNum1(num1);

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        calculator.setNum2(num2);

        System.out.println("Выберите операцию: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;
        try {
            switch (operation) {
                case '+':
                    result = calculator.add();
                    break;
                case '-':
                    result = calculator.subtract();
                    break;
                case '*':
                    result = calculator.multiply();
                    break;
                case '/':
                    result = calculator.divide();
                    break;
                default:
                    System.out.println("Неправильная операция!");
                    return;
            }

            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
