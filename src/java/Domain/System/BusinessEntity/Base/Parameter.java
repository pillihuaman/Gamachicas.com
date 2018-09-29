/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.System.BusinessEntity.Base;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PARAMETER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parameter.findAll", query = "SELECT p FROM Parameter p"),
    @NamedQuery(name = "Parameter.findByIdparameter", query = "SELECT p FROM Parameter p WHERE p.idparameter = :idparameter"),
    @NamedQuery(name = "Parameter.findByName", query = "SELECT p FROM Parameter p WHERE p.name = :name"),
    @NamedQuery(name = "Parameter.findByStatus", query = "SELECT p FROM Parameter p WHERE p.status = :status"),
    @NamedQuery(name = "Parameter.findByCreatedate", query = "SELECT p FROM Parameter p WHERE p.createdate = :createdate"),
    @NamedQuery(name = "Parameter.findByUpdatedate", query = "SELECT p FROM Parameter p WHERE p.updatedate = :updatedate")})
public class Parameter implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPARAMETER")
    private BigDecimal idparameter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS")
    private short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UPDATEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedate;

    public Parameter() {
    }

    public Parameter(BigDecimal idparameter) {
        this.idparameter = idparameter;
    }

    public Parameter(BigDecimal idparameter, String name, short status, Date createdate, Date updatedate) {
        this.idparameter = idparameter;
        this.name = name;
        this.status = status;
        this.createdate = createdate;
        this.updatedate = updatedate;
    }

    public BigDecimal getIdparameter() {
        return idparameter;
    }

    public void setIdparameter(BigDecimal idparameter) {
        this.idparameter = idparameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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
