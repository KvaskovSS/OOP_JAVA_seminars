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

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realSum = real + other.real;
        double imaginarySum = imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double realDiff = real - other.real;
        double imaginaryDiff = imaginary - other.imaginary;
        return new ComplexNumber(realDiff, imaginaryDiff);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}