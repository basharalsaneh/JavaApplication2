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
    @NamedQuery(name = "Utrustning.findAll", query = "SELECT u FROM Utrustning u"),
    @NamedQuery(name = "Utrustning.findByUtrustningsID", query = "SELECT u FROM Utrustning u WHERE u.utrustningsID = :utrustningsID"),
    @NamedQuery(name = "Utrustning.findByBenamning", query = "SELECT u FROM Utrustning u WHERE u.benamning = :benamning")})
public class Utrustning implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Utrustnings_ID")
    private Integer utrustningsID;
    private String benamning;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "utrustning")
    private Collection<InneharUtrustning> inneharUtrustningCollection;

    public Utrustning() {
    }

    public Utrustning(Integer utrustningsID) {
        this.utrustningsID = utrustningsID;
    }

    public Integer getUtrustningsID() {
        return utrustningsID;
    }

    public void setUtrustningsID(Integer utrustningsID) {
        this.utrustningsID = utrustningsID;
    }

    public String getBenamning() {
        return benamning;
    }

    public void setBenamning(String benamning) {
        this.benamning = benamning;
    }

    public Collection<InneharUtrustning> getInneharUtrustningCollection() {
        return inneharUtrustningCollection;
    }

    public void setInneharUtrustningCollection(Collection<InneharUtrustning> inneharUtrustningCollection) {
        this.inneharUtrustningCollection = inneharUtrustningCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (utrustningsID != null ? utrustningsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utrustning)) {
            return false;
        }
        Utrustning other = (Utrustning) object;
        if ((this.utrustningsID == null && other.utrustningsID != null) || (this.utrustningsID != null && !this.utrustningsID.equals(other.utrustningsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.Utrustning[ utrustningsID=" + utrustningsID + " ]";
    }
    
}
