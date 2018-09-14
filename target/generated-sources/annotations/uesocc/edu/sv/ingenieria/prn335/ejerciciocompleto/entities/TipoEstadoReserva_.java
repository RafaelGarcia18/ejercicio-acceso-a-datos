package uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.EstadoReserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T07:07:31")
@StaticMetamodel(TipoEstadoReserva.class)
public class TipoEstadoReserva_ { 

    public static volatile ListAttribute<TipoEstadoReserva, EstadoReserva> estadoReservaList;
    public static volatile SingularAttribute<TipoEstadoReserva, Integer> idTipoEstadoReserva;
    public static volatile SingularAttribute<TipoEstadoReserva, String> observaciones;
    public static volatile SingularAttribute<TipoEstadoReserva, String> nombre;
    public static volatile SingularAttribute<TipoEstadoReserva, Boolean> activo;
    public static volatile SingularAttribute<TipoEstadoReserva, Boolean> indicaAprobacion;

}