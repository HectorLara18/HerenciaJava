package Test;

import domain.Empleado;

public class Test {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Hector", 37000);
        empleado1.setGenero('H');
        empleado1.setDireccion("Escobedo, Nuevo Leon");
        empleado1.setEdad(28);
        System.out.println(empleado1.toString());

    }
}
