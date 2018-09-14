package uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.Modelo;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.Parte;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T07:07:31")
@StaticMetamodel(ModeloParte.class)
public class ModeloParte_ { 

    public static volatile SingularAttribute<ModeloParte, Long> idModeloParte;
    public static volatile SingularAttribute<ModeloParte, String> observaciones;
    public static volatile SingularAttribute<ModeloParte, Modelo> idModelo;
    public static volatile SingularAttribute<ModeloParte, Boolean> activo;
    public static volatile SingularAttribute<ModeloParte, Parte> idParte;

}