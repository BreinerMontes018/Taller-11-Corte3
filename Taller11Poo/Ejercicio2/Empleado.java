package Taller11Poo.Ejercicio2;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}
