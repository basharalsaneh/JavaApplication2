/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objekt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author mac
 */
@Embeddable
public class InneharFordonPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Agent_ID")
    private int agentID;
    @Basic(optional = false)
    @Column(name = "Fordons_ID")
    private String fordonsID;

    public InneharFordonPK() {
    }

    public InneharFordonPK(int agentID, String fordonsID) {
        this.agentID = agentID;
        this.fordonsID = fordonsID;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public String getFordonsID() {
        return fordonsID;
    }

    public void setFordonsID(String fordonsID) {
        this.fordonsID = fordonsID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) agentID;
        hash += (fordonsID != null ? fordonsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InneharFordonPK)) {
            return false;
        }
        InneharFordonPK other = (InneharFordonPK) object;
        if (this.agentID != other.agentID) {
            return false;
        }
        if ((this.fordonsID == null && other.fordonsID != null) || (this.fordonsID != null && !this.fordonsID.equals(other.fordonsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objekt.InneharFordonPK[ agentID=" + agentID + ", fordonsID=" + fordonsID + " ]";
    }
    
}
