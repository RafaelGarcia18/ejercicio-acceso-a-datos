package uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.EstadoVehiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T07:07:31")
@StaticMetamodel(TipoEstadoVehiculo.class)
public class TipoEstadoVehiculo_ { 

    public static volatile SingularAttribute<TipoEstadoVehiculo, Integer> idTipoEstadoVehiculo;
    public static volatile SingularAttribute<TipoEstadoVehiculo, String> observaciones;
    public static volatile SingularAttribute<TipoEstadoVehiculo, Boolean> noDisponible;
    public static volatile SingularAttribute<TipoEstadoVehiculo, String> nombre;
    public static volatile ListAttribute<TipoEstadoVehiculo, EstadoVehiculo> estadoVehiculoList;
    public static volatile SingularAttribute<TipoEstadoVehiculo, Boolean> activo;

}