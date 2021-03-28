package Test;

import domain.Cliente;
import domain.Empleado;

import java.text.DateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Hector", 37000);
        empleado1.setGenero('H');
        empleado1.setDireccion("Escobedo, Nuevo Leon");
        empleado1.setEdad(28);
        System.out.println(empleado1.toString());


        Cliente cliente1 = new Cliente("Raul Lara", 'H', 25,"Escobedo, Nuevo Leon",true,new Date());
        System.out.println(cliente1.toString());

        System.out.println(cliente1.getAñodeRegistro());
    }
}
