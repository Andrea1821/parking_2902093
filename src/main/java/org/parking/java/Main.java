package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //sitema de gestion de E/S
        //de vehiculos en un parking
        //1. dos carritos:
        //objetos(instancias)
        //1.Tipo de clase
        //2. nombre del objeto
        //3. asignacion y new
        //4. constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 789", 
                                TipoVehiculo.PARTICULAR);

        Vehiculo carrito2 = new Vehiculo("FGH 123",
                                TipoVehiculo.MOTO);


        //crear(instanciar un cliente)
      
     


        Cliente cliente1 = new Cliente("Eric" , 
                    "Gonzales Jaramillo", 
                    1016715041L );
        
        //invocar el metodo addCar
        cliente1.addVehiculo(carrito2);
        cliente1.addVehiculo(carrito1);
        cliente1.addVehiculo("WWW999", TipoVehiculo.MOTO);
        //recorrer la lista de vehiculo 
        //del cliente 
        
        //instancias
        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');
        Empleado empleado1 = new Empleado("Carlos", "Mora", 24);

        //hacer registros(pagos) e/s de vehiculos
        Pago pago1 = new Pago(LocalDateTime.of(2024, 
                                        Month.FEBRUARY, 
                                        1, 
                                        15, 
                                        30, 
                                        0),
                            LocalDateTime.of(2024,
                                         Month.FEBRUARY, 
                                         10, 
                                         6, 
                                         15, 
                                         5),
                                         5000.0,
                                         carrito1,
                                         cupito1, 
                                         empleado1);



        //hacer registros
        LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, 
                                                Month.FEBRUARY, 
                                                1, 
                                                15, 
                                                30, 
                                                0) ;



        LocalDateTime fechaHoraFin= LocalDateTime.of(2024,
                                                Month.FEBRUARY, 
                                                10, 
                                                6, 
                                                15, 
                                                5);
        Pago pago2 = new Pago(fechaHoraInicio,
                              fechaHoraFin, 
                               5000.0, 
                               cliente1.misVehiculos.get(0), 
                               cupito2, 
                               empleado1);


          List<Pago> misPagos = new ArrayList<Pago>();
          misPagos.add(pago2);
          misPagos.add(pago1);


          //recorrer los pagos para mostrar informacion
          for( Pago p : misPagos ){
                //evidencia
                //mostrar:
                // -placa del vehiculo
                // - valor pagado
                // - fecha y hora de inicio
                // - fecha y hora de fin
                // - cupo
                System.out.println("|" + "pago:" + "placa:" + p.vehiculo.placa + "|");
                System.out.println("|valor:" + p.valor + "|");
                System.out.println("|fecha y hora entrada : " + 
                                        p.fechaHoraInicio.toString() + "|" );
                System.out.println("|fecha y hora de fin : " + 
                                        p.fechaHoraFin.toString() + "|");
                System.out.println("|cupo : " + p.cupo.nombre + "|");
                System.out.println("|empleado:" + p.empleado.nombre + "," + p.empleado.apellido + "," + p.empleado.codigo + "|");
        }
    }






}