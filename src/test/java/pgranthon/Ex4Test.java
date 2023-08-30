package pgranthon;

import org.junit.jupiter.api.Test;

import pgranthon.ex4.Complex;

import static org.junit.jupiter.api.Assertions.*;

public class Ex4Test {

    @Test public void testComplexInitialization() {
        Complex c1 = new Complex(3.0, 4.0);
        assertEquals(3, c1.getReal());
        assertEquals(4, c1.getImaginary());

        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(1, c2.getReal());
        assertEquals(2, c2.getImaginary());
    }

    @Test public void testGetMagnitude() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.getMagnitude(), 0.01);
    }

    @Test public void testGetAngle() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(0.93, c.getAngle(), 0.01);
    }

    @Test public void testAdd() {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex sum = c1.add(c2);
        System.out.println("" + new Complex(4.0, 6.0) + " | " + sum);
        assertEquals(4, sum.getReal());
        assertEquals(6, sum.getImaginary());
    }

    @Test public void testSubtract() {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex diff = c1.subtract(c2);
        assertEquals(2, diff.getReal());
        assertEquals(2, diff.getImaginary());
    }

    @Test public void testMultiply() {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex product = c1.multiply(c2);
        assertEquals(-5, product.getReal());
        assertEquals(10, product.getImaginary());
    }

    @Test public void testDivide() {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex quotient = c1.divide(c2);
        assertEquals(2.2, quotient.getReal());
        assertEquals(-0.4, quotient.getImaginary());
    }

    @Test public void testAdditiveInverse() {
        Complex c = new Complex(3.0, 4.0);
        Complex negC = c.additiveInverse();
        assertEquals(-3, negC.getReal());
        assertEquals(-4, negC.getImaginary());
    }
}
