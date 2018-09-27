/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.System.BusinessEntity.Base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @NamedQuery(name = "Parameter.findAll", query = "SELECT p FROM Parameter p"),
    @NamedQuery(name = "Parameter.findByIdparameter", query = "SELECT p FROM Parameter p WHERE p.idparameter = :idparameter"),
    @NamedQuery(name = "Parameter.findByGroupparameter", query = "SELECT p FROM Parameter p WHERE p.groupparameter = :groupparameter"),
    @NamedQuery(name = "Parameter.findByDescription", query = "SELECT p FROM Parameter p WHERE p.description = :description"),
    @NamedQuery(name = "Parameter.findByIduser", query = "SELECT p FROM Parameter p WHERE p.iduser = :iduser"),
    @NamedQuery(name = "Parameter.findByCreationdate", query = "SELECT p FROM Parameter p WHERE p.creationdate = :creationdate"),
    @NamedQuery(name = "Parameter.findByUpdatedate", query = "SELECT p FROM Parameter p WHERE p.updatedate = :updatedate")})
public class Parameter implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal idparameter;
    @Size(max = 4)
    @Column(length = 4)
    private String groupparameter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(nullable = false, length = 200)
    private String description;
    private BigInteger iduser;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationdate;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedate;

    public Parameter() {
    }

    public Parameter(BigDecimal idparameter) {
        this.idparameter = idparameter;
    }

    public Parameter(BigDecimal idparameter, String description, Date creationdate, Date updatedate) {
        this.idparameter = idparameter;
        this.description = description;
        this.creationdate = creationdate;
        this.updatedate = updatedate;
    }

    public BigDecimal getIdparameter() {
        return idparameter;
    }

    public void setIdparameter(BigDecimal idparameter) {
        this.idparameter = idparameter;
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

    public BigInteger getIduser() {
        return iduser;
    }

    public void setIduser(BigInteger iduser) {
        this.iduser = iduser;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparameter != null ? idparameter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parameter)) {
            return false;
        }
        Parameter other = (Parameter) object;
        if ((this.idparameter == null && other.idparameter != null) || (this.idparameter != null && !this.idparameter.equals(other.idparameter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Parameter[ idparameter=" + idparameter + " ]";
    }
    
}
