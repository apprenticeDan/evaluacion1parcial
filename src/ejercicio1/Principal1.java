package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Empleado("Juan", 45, 2500));
        listaEmpleados.add(new Empleado("Ana", 21, 3200));
        listaEmpleados.add(new Empleado("Pedro", 52, 2900 ));

        /* listaEmpleados.add(new Empleado("Juan Valdéz", 45, 5600));
        listaEmpleados.add(new Empleado("Marcelo Suarez", 21, 2800));
        listaEmpleados.add(new Empleado("Mario Condori", 52, 7400 ));
        listaEmpleados.add(new Empleado("Wilfredo Reyes", 20, 2400 ));
        listaEmpleados.add(new Empleado("Roberto Gomez", 33, 4400 ));
        listaEmpleados.add(new Empleado("Carlos José Alberto Pardo", 24, 3500 ));
        listaEmpleados.add(new Empleado("Jennifer Lovera", 23, 3400 ));
        listaEmpleados.add(new Empleado("Katheleen Chambi", 25, 5400 ));*/

        String sueldosAntes = "";
        String sueldosAhora = "";

        for (Empleado empleado: listaEmpleados){
            sueldosAntes += empleado.getSalario()+" ";
        }

        System.out.println();

        for (Empleado empleado: listaEmpleados){
            empleado.aplicarAumento();
            sueldosAhora += empleado.getSalario()+" ";
        }

        System.out.println();
        System.out.println("sueldos Antes: " + sueldosAntes);
        System.out.println("sueldos Ahora: " + sueldosAhora);
    }

}
