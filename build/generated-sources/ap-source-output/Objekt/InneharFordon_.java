package Objekt;

import Objekt.Agent;
import Objekt.Fordon;
import Objekt.InneharFordonPK;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-24T15:54:57", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(InneharFordon.class)
public class InneharFordon_ { 

    public static volatile SingularAttribute<InneharFordon, Agent> agent;
    public static volatile SingularAttribute<InneharFordon, InneharFordonPK> inneharFordonPK;
    public static volatile SingularAttribute<InneharFordon, Fordon> fordon;
    public static volatile SingularAttribute<InneharFordon, Date> utkvitteringsdatum;

}