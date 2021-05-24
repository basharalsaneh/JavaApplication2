/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objekt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author mac
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Vapen.findAll", query = "SELECT v FROM Vapen v"),
    @NamedQuery(name = "Vapen.findByUtrustningsID", query = "SELECT v FROM Vapen v WHERE v.utrustningsID = :utrustningsID"),
    @NamedQuery(name = "Vapen.findByKaliber", query = "SELECT v FROM Vapen v WHERE v.kaliber = :kaliber")})
public class Vapen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Utrustnings_ID")
    private Integer utrustningsID;
    private Integer kaliber;

    public Vapen() {
    }

    public Vapen(Integer utrustningsID) {
        this.utrustningsID = utrustningsID;
    }

    public Integer getUtrustningsID() {
        return utrustningsID;
    }

    public void setUtrustningsID(Integer utrustningsID) {
        this.utrustningsID = utrustningsID;
    }

    public Integer getKaliber() {
        return kaliber;
    }

    public void setKaliber(Integer kaliber) {
        this.kaliber = kaliber;
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
        if (!(object instanceof Vapen)) {
            return false;
        }
        Vapen other = (Vapen) object;
        if ((this.utrustningsID == null && other.utrustningsID != null) || (this.utrustningsID != null && !this.utrustningsID.equals(other.utrustningsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.Vapen[ utrustningsID=" + utrustningsID + " ]";
    }
    
}
