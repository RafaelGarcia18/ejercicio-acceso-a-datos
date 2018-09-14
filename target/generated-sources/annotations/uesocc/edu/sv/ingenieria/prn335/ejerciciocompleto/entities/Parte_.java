package uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.ModeloParte;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.SubTipoParte;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T07:07:31")
@StaticMetamodel(Parte.class)
public class Parte_ { 

    public static volatile SingularAttribute<Parte, SubTipoParte> idSubTipoParte;
    public static volatile ListAttribute<Parte, ModeloParte> modeloParteList;
    public static volatile SingularAttribute<Parte, String> observaciones;
    public static volatile SingularAttribute<Parte, String> nombre;
    public static volatile SingularAttribute<Parte, Integer> idParte;
    public static volatile SingularAttribute<Parte, Boolean> activo;

}