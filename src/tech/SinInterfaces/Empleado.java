package tech.SinInterfaces;

public class Empleado {
    // ATRIBUTOS
    String nombre;
    int Edad;
    double Salario;
    boolean Alta;

    // CONSTRUCTORES
    public Empleado(){}

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        Edad = edad;
        Salario = salario;
        Alta = alta;
    }


    //METODOS

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", Edad=" + Edad +
                ", Salario=" + Salario +
                ", Alta=" + Alta +
                '}';
    }
}
