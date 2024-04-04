import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.println("Введите первое число:");
        num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        num2 = scanner.nextDouble();

        Calculator calculator = new Calculator();
        
        System.out.println("Выберите операцию: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Неправильная операция!");
                return;
        }

        System.out.println("Результат: " + result);
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Деление на ноль!");
            return 0; 
        }
        return num1 / num2;
    }
}
