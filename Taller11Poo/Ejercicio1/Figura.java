package Taller11Poo.Ejercicio1;

public abstract class Figura {
    public abstract double calcularArea();
    
    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}
