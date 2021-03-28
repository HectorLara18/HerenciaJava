package domain;

public class Empleado extends Persona{
    //Atributos
    private static int contadorEmpleado;
    private int idEmpleado;
    private double sueldo;

    //Constructor
    public Empleado() {}

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //**
    // Si los atributos en la clase padre estan encapsulados como privados no podran ser heredados a la clase hija
    //como mejor practica deben de estar encapsulados como protected
    // */


    @Override
    public String toString() {
        return  super.toString() +
                " idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }
}
