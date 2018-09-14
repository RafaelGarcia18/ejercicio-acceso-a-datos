package uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.EstadoVehiculo;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.Modelo;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.Reserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T07:07:31")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, Long> idVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> numeroVin;
    public static volatile SingularAttribute<Vehiculo, String> color;
    public static volatile ListAttribute<Vehiculo, Reserva> reservaList;
    public static volatile SingularAttribute<Vehiculo, Integer> asientos;
    public static volatile SingularAttribute<Vehiculo, String> numeroChasis;
    public static volatile SingularAttribute<Vehiculo, Modelo> idModelo;
    public static volatile ListAttribute<Vehiculo, EstadoVehiculo> estadoVehiculoList;
    public static volatile SingularAttribute<Vehiculo, String> numeroPlaca;

}