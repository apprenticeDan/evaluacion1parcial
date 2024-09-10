package ejercicio2;

public class Vehiculo {
    String marca;
    String modelo;
    double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println(this);
    }
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "\nmarca= '" + marca + '\'' +
                "\nmodelo= '" + modelo + '\'' +
                "\nprecio= " + precio +
                "\n}";
    }
}
