/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.System.BusinessEntity.Base;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zarmir
 */
@Entity
@Table(catalog = "", schema = "AFRODITA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametergroup.findAll", query = "SELECT p FROM Parametergroup p"),
    @NamedQuery(name = "Parametergroup.findByIdparametergroup", query = "SELECT p FROM Parametergroup p WHERE p.idparametergroup = :idparametergroup"),
    @NamedQuery(name = "Parametergroup.findByGroupparameter", query = "SELECT p FROM Parametergroup p WHERE p.groupparameter = :groupparameter"),
    @NamedQuery(name = "Parametergroup.findByDescription", query = "SELECT p FROM Parametergroup p WHERE p.description = :description")})
public class Parametergroup implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal idparametergroup;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(nullable = false, length = 4)
    private String groupparameter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(nullable = false, length = 200)
    private String description;

    public Parametergroup() {
    }

    public Parametergroup(BigDecimal idparametergroup) {
        this.idparametergroup = idparametergroup;
    }

    public Parametergroup(BigDecimal idparametergroup, String groupparameter, String description) {
        this.idparametergroup = idparametergroup;
        this.groupparameter = groupparameter;
        this.description = description;
    }

    public BigDecimal getIdparametergroup() {
        return idparametergroup;
    }

    public void setIdparametergroup(BigDecimal idparametergroup) {
        this.idparametergroup = idparametergroup;
    }

    public String getGroupparameter() {
        return groupparameter;
    }

    public void setGroupparameter(String groupparameter) {
        this.groupparameter = groupparameter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparametergroup != null ? idparametergroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametergroup)) {
            return false;
        }
        Parametergroup other = (Parametergroup) object;
        if ((this.idparametergroup == null && other.idparametergroup != null) || (this.idparametergroup != null && !this.idparametergroup.equals(other.idparametergroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Parametergroup[ idparametergroup=" + idparametergroup + " ]";
    }
    
}
