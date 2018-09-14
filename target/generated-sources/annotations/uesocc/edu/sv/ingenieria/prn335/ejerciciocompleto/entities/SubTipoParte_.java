package uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.Parte;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.TipoParte;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T07:07:31")
@StaticMetamodel(SubTipoParte.class)
public class SubTipoParte_ { 

    public static volatile SingularAttribute<SubTipoParte, Integer> idSubTipoParte;
    public static volatile SingularAttribute<SubTipoParte, TipoParte> idTipoParte;
    public static volatile SingularAttribute<SubTipoParte, String> observaciones;
    public static volatile SingularAttribute<SubTipoParte, String> nombre;
    public static volatile ListAttribute<SubTipoParte, Parte> parteList;
    public static volatile SingularAttribute<SubTipoParte, Boolean> activo;

}