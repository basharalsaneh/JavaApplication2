/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objekt;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mac
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Agent.findAll", query = "SELECT a FROM Agent a"),
    @NamedQuery(name = "Agent.findByAgentID", query = "SELECT a FROM Agent a WHERE a.agentID = :agentID"),
    @NamedQuery(name = "Agent.findByNamn", query = "SELECT a FROM Agent a WHERE a.namn = :namn"),
    @NamedQuery(name = "Agent.findByTelefon", query = "SELECT a FROM Agent a WHERE a.telefon = :telefon"),
    @NamedQuery(name = "Agent.findByAnstallningsdatum", query = "SELECT a FROM Agent a WHERE a.anstallningsdatum = :anstallningsdatum"),
    @NamedQuery(name = "Agent.findByAdministrator", query = "SELECT a FROM Agent a WHERE a.administrator = :administrator"),
    @NamedQuery(name = "Agent.findByLosenord", query = "SELECT a FROM Agent a WHERE a.losenord = :losenord")})
public class Agent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Agent_ID")
    private Integer agentID;
    @Basic(optional = false)
    private String namn;
    private String telefon;
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date anstallningsdatum;
    private Character administrator;
    private String losenord;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "agent")
    private Faltagent faltagent;
    @JoinColumn(name = "Omrade", referencedColumnName = "Omrades_ID")
    @ManyToOne
    private Omrade omrade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ansvarigAgent")
    private Collection<Alien> alienCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "agent")
    private Omradeschef omradeschef;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agent")
    private Collection<InneharFordon> inneharFordonCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "agent")
    private Kontorschef kontorschef;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agent")
    private Collection<InneharUtrustning> inneharUtrustningCollection;

    public Agent() {
    }

    public Agent(Integer agentID) {
        this.agentID = agentID;
    }

    public Agent(Integer agentID, String namn, Date anstallningsdatum) {
        this.agentID = agentID;
        this.namn = namn;
        this.anstallningsdatum = anstallningsdatum;
    }

    public Integer getAgentID() {
        return agentID;
    }

    public void setAgentID(Integer agentID) {
        this.agentID = agentID;
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

    public Date getAnstallningsdatum() {
        return anstallningsdatum;
    }

    public void setAnstallningsdatum(Date anstallningsdatum) {
        this.anstallningsdatum = anstallningsdatum;
    }

    public Character getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Character administrator) {
        this.administrator = administrator;
    }

    public String getLosenord() {
        return losenord;
    }

    public void setLosenord(String losenord) {
        this.losenord = losenord;
    }

    public Faltagent getFaltagent() {
        return faltagent;
    }

    public void setFaltagent(Faltagent faltagent) {
        this.faltagent = faltagent;
    }

    public Omrade getOmrade() {
        return omrade;
    }

    public void setOmrade(Omrade omrade) {
        this.omrade = omrade;
    }

    public Collection<Alien> getAlienCollection() {
        return alienCollection;
    }

    public void setAlienCollection(Collection<Alien> alienCollection) {
        this.alienCollection = alienCollection;
    }

    public Omradeschef getOmradeschef() {
        return omradeschef;
    }

    public void setOmradeschef(Omradeschef omradeschef) {
        this.omradeschef = omradeschef;
    }

    public Collection<InneharFordon> getInneharFordonCollection() {
        return inneharFordonCollection;
    }

    public void setInneharFordonCollection(Collection<InneharFordon> inneharFordonCollection) {
        this.inneharFordonCollection = inneharFordonCollection;
    }

    public Kontorschef getKontorschef() {
        return kontorschef;
    }

    public void setKontorschef(Kontorschef kontorschef) {
        this.kontorschef = kontorschef;
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
        hash += (agentID != null ? agentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent) object;
        if ((this.agentID == null && other.agentID != null) || (this.agentID != null && !this.agentID.equals(other.agentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.Agent[ agentID=" + agentID + " ]";
    }
    
}
