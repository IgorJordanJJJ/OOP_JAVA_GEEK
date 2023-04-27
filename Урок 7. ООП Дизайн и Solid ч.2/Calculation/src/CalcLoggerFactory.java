public class CalcLoggerFactory implements ICalculableFactory{
    private Loggable loggable;

    public CalcLoggerFactory(Loggable loggable) {
        this.loggable = loggable;
    }

    @Override
    public Calculabel create(ComplexNumber complexNumber) {
        return new CalcLogger(new Calculator(complexNumber), loggable);
    }
}
