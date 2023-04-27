import java.io.StringReader;
import java.util.Scanner;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;

    private ComplexNumber othercomplex = new ComplexNumber(0,0);

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double primaryArgreal = promptDoub("Введите действительную часть первого аргумента: ");
            double primaryArgimg = promptDoub("Введите мнимую часть первого аргумента: ");
            Calculabel calculator = calculableFactory.create(new ComplexNumber(primaryArgreal,primaryArgimg));
            while (true) {
                String cmd = prompt("Введите команду (-, +, =) : ");
                if (cmd.equals("-")) {
                    othercomplex.setReal(promptDoub("Введите действительную часть второго аргумента: "));
                    othercomplex.setImaginary(promptDoub("Введите мнимую часть второго аргумента: "));
                    calculator.subtract(othercomplex);
                    continue;
                }
                if (cmd.equals("+")) {
                    othercomplex.setReal(promptDoub("Введите действительную часть второго аргумента: "));
                    othercomplex.setImaginary(promptDoub("Введите мнимую часть второго аргумента: "));
                    calculator.sum(othercomplex);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
                break;
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine().toLowerCase();
    }

    private double promptDoub(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
