public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
        return this;
    }

    public ComplexNumber subtract(ComplexNumber other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
        return this;
    }

    public String toString() {
        String sign = (imaginary < 0) ? "-" : "+";
        return String.format("%.2f %s %.2fi", real, sign, Math.abs(imaginary));
    }
}
