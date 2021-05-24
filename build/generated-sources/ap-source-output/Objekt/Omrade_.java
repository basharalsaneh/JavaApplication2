package Objekt;

import Objekt.Agent;
import Objekt.Omradeschef;
import Objekt.Plats;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-24T14:35:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Omrade.class)
public class Omrade_ { 

    public static volatile CollectionAttribute<Omrade, Plats> platsCollection;
    public static volatile SingularAttribute<Omrade, Integer> omradesID;
    public static volatile SingularAttribute<Omrade, String> benamning;
    public static volatile CollectionAttribute<Omrade, Omradeschef> omradeschefCollection;
    public static volatile CollectionAttribute<Omrade, Agent> agentCollection;

}