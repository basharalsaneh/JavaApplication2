package Objekt;

import Objekt.Alien;
import Objekt.Omrade;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-24T14:35:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Plats.class)
public class Plats_ { 

    public static volatile SingularAttribute<Plats, Omrade> finnsI;
    public static volatile CollectionAttribute<Plats, Alien> alienCollection;
    public static volatile SingularAttribute<Plats, String> benamning;
    public static volatile SingularAttribute<Plats, Integer> platsID;

}