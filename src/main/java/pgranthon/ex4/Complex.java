package pgranthon.ex4;

public class Complex {
    private double real;
    private double imag;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real) {
        this(real, 0);
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() { return real; }
    public double getImaginary() { return imag; }
    public double getMagnitude() { return Math.sqrt(real * real + imag * imag); }
    public double getAngle() { return Math.atan2(imag, real); }

    public Complex additiveInverse() { return new Complex(-real, -imag); }

    public Complex add (Complex other) { return new Complex(real + other.real, imag + other.imag); }
    public Complex subtract (Complex other) { return new Complex(real - other.real, imag - other.imag); }

    public Complex multiply (Complex other) {
        double newReal = real * other.real - imag * other.imag;
        double newImag = real * other.imag + imag * other.real;
        return new Complex(newReal, newImag);
    }

    public Complex divide (Complex other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        double newReal = (real * other.real + imag * other.imag) / denominator;
        double newImag = (imag * other.real - real * other.imag) / denominator;
        return new Complex(newReal, newImag);
    }

    @Override public String toString() { return "(" + real + "," + imag + ")"; }
}
