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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author mac
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Plats.findAll", query = "SELECT p FROM Plats p"),
    @NamedQuery(name = "Plats.findByPlatsID", query = "SELECT p FROM Plats p WHERE p.platsID = :platsID"),
    @NamedQuery(name = "Plats.findByBenamning", query = "SELECT p FROM Plats p WHERE p.benamning = :benamning")})
public class Plats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plats_ID")
    private Integer platsID;
    private String benamning;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plats")
    private Collection<Alien> alienCollection;
    @JoinColumn(name = "Finns_I", referencedColumnName = "Omrades_ID")
    @ManyToOne(optional = false)
    private Omrade finnsI;

    public Plats() {
    }

    public Plats(Integer platsID) {
        this.platsID = platsID;
    }

    public Integer getPlatsID() {
        return platsID;
    }

    public void setPlatsID(Integer platsID) {
        this.platsID = platsID;
    }

    public String getBenamning() {
        return benamning;
    }

    public void setBenamning(String benamning) {
        this.benamning = benamning;
    }

    public Collection<Alien> getAlienCollection() {
        return alienCollection;
    }

    public void setAlienCollection(Collection<Alien> alienCollection) {
        this.alienCollection = alienCollection;
    }

    public Omrade getFinnsI() {
        return finnsI;
    }

    public void setFinnsI(Omrade finnsI) {
        this.finnsI = finnsI;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (platsID != null ? platsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plats)) {
            return false;
        }
        Plats other = (Plats) object;
        if ((this.platsID == null && other.platsID != null) || (this.platsID != null && !this.platsID.equals(other.platsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.Plats[ platsID=" + platsID + " ]";
    }
    
}
