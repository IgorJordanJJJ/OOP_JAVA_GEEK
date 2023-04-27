


public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalcLoggerFactory(new Logger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}