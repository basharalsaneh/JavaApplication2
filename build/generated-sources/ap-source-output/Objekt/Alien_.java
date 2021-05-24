package Objekt;

import Objekt.Agent;
import Objekt.Plats;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-24T15:54:57", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Alien.class)
public class Alien_ { 

    public static volatile SingularAttribute<Alien, Date> registreringsdatum;
    public static volatile SingularAttribute<Alien, String> telefon;
    public static volatile SingularAttribute<Alien, String> namn;
    public static volatile SingularAttribute<Alien, Plats> plats;
    public static volatile SingularAttribute<Alien, String> losenord;
    public static volatile SingularAttribute<Alien, Agent> ansvarigAgent;
    public static volatile SingularAttribute<Alien, Integer> alienID;

}