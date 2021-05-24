/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objekt;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author mac
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Omrade.findAll", query = "SELECT o FROM Omrade o"),
    @NamedQuery(name = "Omrade.findByOmradesID", query = "SELECT o FROM Omrade o WHERE o.omradesID = :omradesID"),
    @NamedQuery(name = "Omrade.findByBenamning", query = "SELECT o FROM Omrade o WHERE o.benamning = :benamning")})
public class Omrade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Omrades_ID")
    private Integer omradesID;
    private String benamning;
    @OneToMany(mappedBy = "omrade")
    private Collection<Agent> agentCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "omrade")
    private Collection<Omradeschef> omradeschefCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "finnsI")
    private Collection<Plats> platsCollection;

    public Omrade() {
    }

    public Omrade(Integer omradesID) {
        this.omradesID = omradesID;
    }

    public Integer getOmradesID() {
        return omradesID;
    }

    public void setOmradesID(Integer omradesID) {
        this.omradesID = omradesID;
    }

    public String getBenamning() {
        return benamning;
    }

    public void setBenamning(String benamning) {
        this.benamning = benamning;
    }

    public Collection<Agent> getAgentCollection() {
        return agentCollection;
    }

    public void setAgentCollection(Collection<Agent> agentCollection) {
        this.agentCollection = agentCollection;
    }

    public Collection<Omradeschef> getOmradeschefCollection() {
        return omradeschefCollection;
    }

    public void setOmradeschefCollection(Collection<Omradeschef> omradeschefCollection) {
        this.omradeschefCollection = omradeschefCollection;
    }

    public Collection<Plats> getPlatsCollection() {
        return platsCollection;
    }

    public void setPlatsCollection(Collection<Plats> platsCollection) {
        this.platsCollection = platsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (omradesID != null ? omradesID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Omrade)) {
            return false;
        }
        Omrade other = (Omrade) object;
        if ((this.omradesID == null && other.omradesID != null) || (this.omradesID != null && !this.omradesID.equals(other.omradesID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.Omrade[ omradesID=" + omradesID + " ]";
    }
    
}
