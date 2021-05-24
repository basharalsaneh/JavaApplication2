/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objekt;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mac
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Alien.findAll", query = "SELECT a FROM Alien a"),
    @NamedQuery(name = "Alien.findByAlienID", query = "SELECT a FROM Alien a WHERE a.alienID = :alienID"),
    @NamedQuery(name = "Alien.findByRegistreringsdatum", query = "SELECT a FROM Alien a WHERE a.registreringsdatum = :registreringsdatum"),
    @NamedQuery(name = "Alien.findByLosenord", query = "SELECT a FROM Alien a WHERE a.losenord = :losenord"),
    @NamedQuery(name = "Alien.findByNamn", query = "SELECT a FROM Alien a WHERE a.namn = :namn"),
    @NamedQuery(name = "Alien.findByTelefon", query = "SELECT a FROM Alien a WHERE a.telefon = :telefon")})
public class Alien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Alien_ID")
    private Integer alienID;
    @Temporal(TemporalType.DATE)
    private Date registreringsdatum;
    private String losenord;
    private String namn;
    private String telefon;
    @JoinColumn(name = "Ansvarig_Agent", referencedColumnName = "Agent_ID")
    @ManyToOne(optional = false)
    private Agent ansvarigAgent;
    @JoinColumn(name = "Plats", referencedColumnName = "Plats_ID")
    @ManyToOne(optional = false)
    private Plats plats;

    public Alien() {
    }

    public Alien(Integer alienID) {
        this.alienID = alienID;
    }

    public Integer getAlienID() {
        return alienID;
    }

    public void setAlienID(Integer alienID) {
        this.alienID = alienID;
    }

    public Date getRegistreringsdatum() {
        return registreringsdatum;
    }

    public void setRegistreringsdatum(Date registreringsdatum) {
        this.registreringsdatum = registreringsdatum;
    }

    public String getLosenord() {
        return losenord;
    }

    public void setLosenord(String losenord) {
        this.losenord = losenord;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Agent getAnsvarigAgent() {
        return ansvarigAgent;
    }

    public void setAnsvarigAgent(Agent ansvarigAgent) {
        this.ansvarigAgent = ansvarigAgent;
    }

    public Plats getPlats() {
        return plats;
    }

    public void setPlats(Plats plats) {
        this.plats = plats;
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
        if (!(object instanceof Alien)) {
            return false;
        }
        Alien other = (Alien) object;
        if ((this.alienID == null && other.alienID != null) || (this.alienID != null && !this.alienID.equals(other.alienID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.Alien[ alienID=" + alienID + " ]";
    }
    
}
