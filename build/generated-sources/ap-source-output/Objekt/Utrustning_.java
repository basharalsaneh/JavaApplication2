package Objekt;

import Objekt.InneharUtrustning;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-24T14:35:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Utrustning.class)
public class Utrustning_ { 

    public static volatile CollectionAttribute<Utrustning, InneharUtrustning> inneharUtrustningCollection;
    public static volatile SingularAttribute<Utrustning, String> benamning;
    public static volatile SingularAttribute<Utrustning, Integer> utrustningsID;

}