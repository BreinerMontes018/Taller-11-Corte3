package Taller11Poo.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Carlos", 3000, 500);
        Empleado vendedor = new Vendedor("Ana", 1500, 300);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
