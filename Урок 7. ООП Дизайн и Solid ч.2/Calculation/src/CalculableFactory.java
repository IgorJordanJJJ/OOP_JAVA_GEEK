public class CalculableFactory implements ICalculableFactory {

    @Override
    public Calculabel create(ComplexNumber complexNumber) {
        return new Calculator(complexNumber);
    }
}
