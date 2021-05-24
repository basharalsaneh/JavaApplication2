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
@Table(name = "Innehar_Fordon")
@NamedQueries({
    @NamedQuery(name = "InneharFordon.findAll", query = "SELECT i FROM InneharFordon i"),
    @NamedQuery(name = "InneharFordon.findByAgentID", query = "SELECT i FROM InneharFordon i WHERE i.inneharFordonPK.agentID = :agentID"),
    @NamedQuery(name = "InneharFordon.findByFordonsID", query = "SELECT i FROM InneharFordon i WHERE i.inneharFordonPK.fordonsID = :fordonsID"),
    @NamedQuery(name = "InneharFordon.findByUtkvitteringsdatum", query = "SELECT i FROM InneharFordon i WHERE i.utkvitteringsdatum = :utkvitteringsdatum")})
public class InneharFordon implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InneharFordonPK inneharFordonPK;
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date utkvitteringsdatum;
    @JoinColumn(name = "Agent_ID", referencedColumnName = "Agent_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agent agent;
    @JoinColumn(name = "Fordons_ID", referencedColumnName = "Fordons_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Fordon fordon;

    public InneharFordon() {
    }

    public InneharFordon(InneharFordonPK inneharFordonPK) {
        this.inneharFordonPK = inneharFordonPK;
    }

    public InneharFordon(InneharFordonPK inneharFordonPK, Date utkvitteringsdatum) {
        this.inneharFordonPK = inneharFordonPK;
        this.utkvitteringsdatum = utkvitteringsdatum;
    }

    public InneharFordon(int agentID, String fordonsID) {
        this.inneharFordonPK = new InneharFordonPK(agentID, fordonsID);
    }

    public InneharFordonPK getInneharFordonPK() {
        return inneharFordonPK;
    }

    public void setInneharFordonPK(InneharFordonPK inneharFordonPK) {
        this.inneharFordonPK = inneharFordonPK;
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

    public Fordon getFordon() {
        return fordon;
    }

    public void setFordon(Fordon fordon) {
        this.fordon = fordon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inneharFordonPK != null ? inneharFordonPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InneharFordon)) {
            return false;
        }
        InneharFordon other = (InneharFordon) object;
        if ((this.inneharFordonPK == null && other.inneharFordonPK != null) || (this.inneharFordonPK != null && !this.inneharFordonPK.equals(other.inneharFordonPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.InneharFordon[ inneharFordonPK=" + inneharFordonPK + " ]";
    }
    
}
