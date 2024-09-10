package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        List<Vehiculo> lista = new ArrayList<>();
        lista.add(new Vehiculo("Nissan", "Pathfinder", 10000));
        lista.add(new Vehiculo("Tata", "Condor", 1200));
        lista.add(new Vehiculo("Toyota", "fj-cruiser", 25000));
        lista.add(new Vehiculo("Volkswagen", "Brasilia", 2500));
        lista.add(new Vehiculo("Quantum", "E4-Plus", 5500));
        Vehiculo enRango = obtenerVehiculoConRangoPrecios(lista);
        if (enRango!=null) {
            System.out.println("Se encontró un auto entre 2400 y 4000: ");
            enRango.mostrarDetalles();
        } else {
            System.out.println("No se encontró ningún auto entre 2400 y 4000.");
        }

    }

    /**
     * Encuentra el índice del primer vehículo con el precio que este entre
     * el Límite inferior(2400) y el límite superior(4000) incluyendo ambos.
     * @param listaVehiculos
     * @return
     */

    public static Vehiculo obtenerVehiculoConRangoPrecios(List<Vehiculo> listaVehiculos){
        int indiceVehiculo = obtenerIndicesVehiculoConRangoPrecios(2400, 4000, listaVehiculos);
        return indiceVehiculo > -1 ? listaVehiculos.get(indiceVehiculo) : null;
    }

    /**
     * @param LimInferior
     * @param LimSuperior
     * @return
     */
    public static int obtenerIndicesVehiculoConRangoPrecios(double LimInferior, double LimSuperior, List<Vehiculo> listaVehiculos){
        int i;
        for(i=0; i < listaVehiculos.size(); i++) {
            Vehiculo vehiculo = listaVehiculos.get(i);
            if (vehiculo.getPrecio() >= LimInferior && vehiculo.getPrecio() <= LimSuperior ) {
                return i;
            }
        }
        return -1;
    }
}
