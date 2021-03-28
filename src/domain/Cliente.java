package domain;

import java.util.Date;

public class Cliente extends Persona{

    //Atributos
    private static int contadorCliente;
    private int idCliente;
    private boolean vip;
    private Date fechaRegistro;

    //Constructor

    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip, Date fechaRegistro){
        super(nombre, genero, edad, direccion);
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
        this.idCliente = ++Cliente.contadorCliente;
    }

    //Metodos

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getAñodeRegistro(){
        int year = this.fechaRegistro.getYear() + 1900;
        return year;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " Cliente{" +
                "idCliente=" + idCliente +
                ", vip=" + vip +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}
