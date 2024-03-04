package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellidos;
    private Long numeroIdentificacion;
    private List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

    //definir metodo de clase
    //addCar: vincular un carrito al cliente
    public void addVehiculo(Vehiculo vehiculo){
        //añadir el carrito a la lista 
        //this: para acceder a atributos
        //y metodos al interior del objeto
        //NOTA: usenla al interior de metodos
        this .misVehiculos.add(vehiculo);
    }
    //sobrecarga del metodo 

    
    //addVehiculo
    public void addVehiculo(String placa, 
                                TipoVehiculo tv){
                                    Vehiculo v = new Vehiculo();
                                    //utilizando el setter de placa
                                    //para ajustar valor de placa
                                    //AL NUEVO VEHICULO

                                    v.setPlaca(placa);
                                    v.setTipoVehiculo(tv);
                                    this.misVehiculos.add(v);
                                }


    public Cliente(String nombre, String apellidos, Long numeroIdentificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }


    public void setMisVehiculos(List<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    } 
    
}
