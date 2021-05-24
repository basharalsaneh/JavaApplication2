package Objekt;

import Objekt.Agent;
import Objekt.InneharUtrustningPK;
import Objekt.Utrustning;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-24T14:35:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(InneharUtrustning.class)
public class InneharUtrustning_ { 

    public static volatile SingularAttribute<InneharUtrustning, Agent> agent;
    public static volatile SingularAttribute<InneharUtrustning, Utrustning> utrustning;
    public static volatile SingularAttribute<InneharUtrustning, Date> utkvitteringsdatum;
    public static volatile SingularAttribute<InneharUtrustning, InneharUtrustningPK> inneharUtrustningPK;

}