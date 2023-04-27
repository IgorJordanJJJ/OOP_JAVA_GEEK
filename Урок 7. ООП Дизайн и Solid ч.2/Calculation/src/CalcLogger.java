public class CalcLogger implements Calculabel{

    private Loggable loggable;
    private Calculabel calculabel;

    public CalcLogger(Calculabel calculabel, Loggable loggable){
        this.calculabel=calculabel;
        this.loggable = loggable;
        loggable.log(String.format("Число %s \n", calculabel.getResult()));
    }
    @Override
    public Calculabel sum(ComplexNumber numbersum) {
        this.calculabel.sum(numbersum);
        String arg = calculabel.getResult();
        loggable.log(String.format("Получили результат: %s \n", arg));
        return this.calculabel;
    }

    @Override
    public Calculabel subtract(ComplexNumber numbersub) {
        this.calculabel.subtract(numbersub);
        String arg = calculabel.getResult();
        loggable.log(String.format("Получили результат: %s \n", arg));
        return this.calculabel;
    }

    @Override
    public String getResult() {
        String arg = calculabel.getResult();
        loggable.log(String.format("Получили результат: %s \n", arg));
        return calculabel.getResult();
    }
}
