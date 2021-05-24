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
    @NamedQuery(name = "Squid.findAll", query = "SELECT s FROM Squid s"),
    @NamedQuery(name = "Squid.findByAlienID", query = "SELECT s FROM Squid s WHERE s.alienID = :alienID"),
    @NamedQuery(name = "Squid.findByAntalArmar", query = "SELECT s FROM Squid s WHERE s.antalArmar = :antalArmar")})
public class Squid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Alien_ID")
    private Integer alienID;
    @Column(name = "Antal_Armar")
    private Integer antalArmar;

    public Squid() {
    }

    public Squid(Integer alienID) {
        this.alienID = alienID;
    }

    public Integer getAlienID() {
        return alienID;
    }

    public void setAlienID(Integer alienID) {
        this.alienID = alienID;
    }

    public Integer getAntalArmar() {
        return antalArmar;
    }

    public void setAntalArmar(Integer antalArmar) {
        this.antalArmar = antalArmar;
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
        if (!(object instanceof Squid)) {
            return false;
        }
        Squid other = (Squid) object;
        if ((this.alienID == null && other.alienID != null) || (this.alienID != null && !this.alienID.equals(other.alienID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.Squid[ alienID=" + alienID + " ]";
    }
    
}
