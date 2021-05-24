/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objekt;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mac
 */
@Entity
@Table(name = "Innehar_Utrustning")
@NamedQueries({
    @NamedQuery(name = "InneharUtrustning.findAll", query = "SELECT i FROM InneharUtrustning i"),
    @NamedQuery(name = "InneharUtrustning.findByAgentID", query = "SELECT i FROM InneharUtrustning i WHERE i.inneharUtrustningPK.agentID = :agentID"),
    @NamedQuery(name = "InneharUtrustning.findByUtrustningsID", query = "SELECT i FROM InneharUtrustning i WHERE i.inneharUtrustningPK.utrustningsID = :utrustningsID"),
    @NamedQuery(name = "InneharUtrustning.findByUtkvitteringsdatum", query = "SELECT i FROM InneharUtrustning i WHERE i.utkvitteringsdatum = :utkvitteringsdatum")})
public class InneharUtrustning implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InneharUtrustningPK inneharUtrustningPK;
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date utkvitteringsdatum;
    @JoinColumn(name = "Agent_ID", referencedColumnName = "Agent_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agent agent;
    @JoinColumn(name = "Utrustnings_ID", referencedColumnName = "Utrustnings_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Utrustning utrustning;

    public InneharUtrustning() {
    }

    public InneharUtrustning(InneharUtrustningPK inneharUtrustningPK) {
        this.inneharUtrustningPK = inneharUtrustningPK;
    }

    public InneharUtrustning(InneharUtrustningPK inneharUtrustningPK, Date utkvitteringsdatum) {
        this.inneharUtrustningPK = inneharUtrustningPK;
        this.utkvitteringsdatum = utkvitteringsdatum;
    }

    public InneharUtrustning(int agentID, int utrustningsID) {
        this.inneharUtrustningPK = new InneharUtrustningPK(agentID, utrustningsID);
    }

    public InneharUtrustningPK getInneharUtrustningPK() {
        return inneharUtrustningPK;
    }

    public void setInneharUtrustningPK(InneharUtrustningPK inneharUtrustningPK) {
        this.inneharUtrustningPK = inneharUtrustningPK;
    }

    public Date getUtkvitteringsdatum() {
        return utkvitteringsdatum;
    }

    public void setUtkvitteringsdatum(Date utkvitteringsdatum) {
        this.utkvitteringsdatum = utkvitteringsdatum;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Utrustning getUtrustning() {
        return utrustning;
    }

    public void setUtrustning(Utrustning utrustning) {
        this.utrustning = utrustning;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inneharUtrustningPK != null ? inneharUtrustningPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InneharUtrustning)) {
            return false;
        }
        InneharUtrustning other = (InneharUtrustning) object;
        if ((this.inneharUtrustningPK == null && other.inneharUtrustningPK != null) || (this.inneharUtrustningPK != null && !this.inneharUtrustningPK.equals(other.inneharUtrustningPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.InneharUtrustning[ inneharUtrustningPK=" + inneharUtrustningPK + " ]";
    }
    
}
