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



    @Override
    public String toString() {
        return "Empleado{" +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }
}
