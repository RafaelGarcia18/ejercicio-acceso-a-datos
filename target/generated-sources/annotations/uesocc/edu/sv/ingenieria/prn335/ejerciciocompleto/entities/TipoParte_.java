package uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.SubTipoParte;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T07:07:31")
@StaticMetamodel(TipoParte.class)
public class TipoParte_ { 

    public static volatile SingularAttribute<TipoParte, Integer> idTipoParte;
    public static volatile SingularAttribute<TipoParte, String> observaciones;
    public static volatile ListAttribute<TipoParte, SubTipoParte> subTipoParteList;
    public static volatile SingularAttribute<TipoParte, String> nombre;
    public static volatile SingularAttribute<TipoParte, Boolean> activo;

}