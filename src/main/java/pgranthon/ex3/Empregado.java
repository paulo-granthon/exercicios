package pgranthon.ex3;

public class Empregado {
    private String firstName;
    private String lastName;
    private double salarioMensal;

    public Empregado(String firstName, String lastName, double salarioMensal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salarioMensal = salarioMensal > 0.0 ? salarioMensal : 0.0;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getSalarioMensal() { return salarioMensal; }

    public void setFirstName (String firstName) { this.firstName = firstName; }
    public void setLastName (String lastName) { this.lastName = lastName; }
    public void setSalarioMensal (double salarioMensal) {
        this.salarioMensal = salarioMensal > 0.0 ? salarioMensal : 0.0;
    }
}
