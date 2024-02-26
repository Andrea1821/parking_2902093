package org.parking.java.entities;

import java.time.LocalDateTime;

public class Pago {

    //Atributos intrinsecos
    public LocalDateTime fechaHoraInicio;
    public LocalDateTime fechaHoraFin;
    public Double valor;

    //Atributos de relacion:
    public Vehiculo vehiculo;
    public Cupo cupo;
    public Empleado empleado;
    
    
    //Constructor por defecto
    public Pago() {
    }



    //Constructor 
    public Pago(LocalDateTime fechaHoraInicio, 
            LocalDateTime fechaHoraFin, 
            Double valor, 
            Vehiculo vehiculo, 
            Cupo cupo,
            Empleado empleado) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
        this.empleado = empleado;
    }


}
