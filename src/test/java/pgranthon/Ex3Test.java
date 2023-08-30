package pgranthon;

import org.junit.jupiter.api.Test;

import pgranthon.ex3.Empregado;

import static org.junit.jupiter.api.Assertions.*;

public class Ex3Test {

    @Test public void testSalaryIncrease() {
        Empregado empregado1 = new Empregado("John", "Snow", 2000.0);
        Empregado empregado2 = new Empregado("Walter", "White", 1800.0);

        System.out.println("Salários iniciais:");
        System.out.println("Empregado 1: " + empregado1.getSalarioMensal());
        System.out.println("Empregado 2: " + empregado2.getSalarioMensal());

        empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.1);
        empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.1);

        System.out.println("Salários após aumento de 10%:");
        System.out.println("Empregado 1: " + empregado1.getSalarioMensal());
        System.out.println("Empregado 2: " + empregado2.getSalarioMensal());

        assertEquals(2200.0, empregado1.getSalarioMensal(), 0.01);
        assertEquals(1980.0, empregado2.getSalarioMensal(), 0.01);
    }


    @Test public void testGetFirstName() {
        Empregado empregado = new Empregado("John", "Doe", 2000.0);
        assertEquals("John", empregado.getFirstName());
    }

    @Test public void testGetLastName() {
        Empregado empregado = new Empregado("Jane", "Smith", 1800.0);
        assertEquals("Smith", empregado.getLastName());
    }

    @Test public void testGetSalarioMensal() {
        Empregado empregado = new Empregado("Alice", "Johnson", 2500.0);
        assertEquals(2500.0, empregado.getSalarioMensal());
    }

    @Test public void testSetFirstName() {
        Empregado empregado = new Empregado("Robert", "Brown", 2200.0);
        empregado.setFirstName("Michael");
        assertEquals("Michael", empregado.getFirstName());
    }

    @Test public void testSetLastName() {
        Empregado empregado = new Empregado("Emily", "Davis", 1900.0);
        empregado.setLastName("Wilson");
        assertEquals("Wilson", empregado.getLastName());
    }

    @Test public void testSetSalarioMensal() {
        Empregado empregado = new Empregado("David", "Lee", 2800.0);
        empregado.setSalarioMensal(3000.0);
        assertEquals(3000.0, empregado.getSalarioMensal());
    }

    @Test public void testSetSalarioMensalNegativeValue() {
        Empregado empregado = new Empregado("Ella", "Brown", 2100.0);
        empregado.setSalarioMensal(-1500.0);
        assertEquals(0.0, empregado.getSalarioMensal());
    }
}
