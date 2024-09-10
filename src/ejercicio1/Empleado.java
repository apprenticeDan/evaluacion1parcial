package ejercicio1;

public class Empleado {
    String nombre;
    int edad;
    double salario;

    /**
     * Calcula un aumento de salario del 10%
     * para empleados con un salario menor a 3000.
     * @return double
     */
    public double calcularAumento() {
        return this.salario < 3000 ? this.salario * 0.1 : 0;
    }

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void aplicarAumento() {
        double aumento;
        String mensaje = this.nombre;
        if ((aumento = calcularAumento()) > 0) {
            mensaje +=" ha recibido un aumento. Nuevo salario " + (this.salario+=aumento);
        } else {
            mensaje += " no califica para el aumento.";
        }
        System.out.println(mensaje);
    }

}
