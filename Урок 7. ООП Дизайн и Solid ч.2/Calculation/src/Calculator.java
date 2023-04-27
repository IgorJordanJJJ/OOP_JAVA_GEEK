public class Calculator implements Calculabel{
    private ComplexNumber complexNumber;

    public Calculator(ComplexNumber complexNumber){
        this.complexNumber = complexNumber;
    }
    @Override
    public Calculabel sum(ComplexNumber numbersum) {
        this.complexNumber.add(numbersum);
        return this;
    }

    @Override
    public Calculabel subtract(ComplexNumber numbersub) {
        this.complexNumber.subtract(numbersub);
        return this;
    }

    @Override
    public String getResult() {
        return this.complexNumber.toString();
    }
}
