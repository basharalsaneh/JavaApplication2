package Objekt;

import Objekt.Alien;
import Objekt.Faltagent;
import Objekt.InneharFordon;
import Objekt.InneharUtrustning;
import Objekt.Kontorschef;
import Objekt.Omrade;
import Objekt.Omradeschef;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-24T15:54:57", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Agent.class)
public class Agent_ { 

    public static volatile SingularAttribute<Agent, Integer> agentID;
    public static volatile CollectionAttribute<Agent, InneharUtrustning> inneharUtrustningCollection;
    public static volatile SingularAttribute<Agent, String> namn;
    public static volatile SingularAttribute<Agent, Omradeschef> omradeschef;
    public static volatile SingularAttribute<Agent, Omrade> omrade;
    public static volatile CollectionAttribute<Agent, Alien> alienCollection;
    public static volatile SingularAttribute<Agent, Character> administrator;
    public static volatile SingularAttribute<Agent, Faltagent> faltagent;
    public static volatile SingularAttribute<Agent, Kontorschef> kontorschef;
    public static volatile SingularAttribute<Agent, String> telefon;
    public static volatile SingularAttribute<Agent, String> losenord;
    public static volatile CollectionAttribute<Agent, InneharFordon> inneharFordonCollection;
    public static volatile SingularAttribute<Agent, Date> anstallningsdatum;

}