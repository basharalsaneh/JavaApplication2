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
    @NamedQuery(name = "Boglodite.findAll", query = "SELECT b FROM Boglodite b"),
    @NamedQuery(name = "Boglodite.findByAlienID", query = "SELECT b FROM Boglodite b WHERE b.alienID = :alienID"),
    @NamedQuery(name = "Boglodite.findByAntalBoogies", query = "SELECT b FROM Boglodite b WHERE b.antalBoogies = :antalBoogies")})
public class Boglodite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Alien_ID")
    private Integer alienID;
    @Column(name = "Antal_Boogies")
    private Integer antalBoogies;

    public Boglodite() {
    }

    public Boglodite(Integer alienID) {
        this.alienID = alienID;
    }

    public Integer getAlienID() {
        return alienID;
    }

    public void setAlienID(Integer alienID) {
        this.alienID = alienID;
    }

    public Integer getAntalBoogies() {
        return antalBoogies;
    }

    public void setAntalBoogies(Integer antalBoogies) {
        this.antalBoogies = antalBoogies;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alienID != null ? alienID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boglodite)) {
            return false;
        }
        Boglodite other = (Boglodite) object;
        if ((this.alienID == null && other.alienID != null) || (this.alienID != null && !this.alienID.equals(other.alienID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.Boglodite[ alienID=" + alienID + " ]";
    }
    
}
