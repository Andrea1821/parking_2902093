package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

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
      
     


        Cliente cliente1 = new Cliente("Eric" , "Gonzales Jaramillo", 1016715041L );
        
        //invocar el metodo addCar
        cliente1.addVehiculo(carrito2);
        cliente1.addVehiculo(carrito1);
        cliente1.addVehiculo("WWW999", TipoVehiculo.MOTO);
        //recorrer la lista de vehiculo 
        //del cliente 
        for(Vehiculo vehiculo:cliente1.misVehiculos){
            System.out.println(vehiculo.placa);
            System.out.println(vehiculo.tipoVehiculo);
            System.out.println("----------------");

        }
    }
}