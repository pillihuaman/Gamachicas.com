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
@Table(name = "GROUPPARAMETER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupparameter.findAll", query = "SELECT g FROM Groupparameter g"),
    @NamedQuery(name = "Groupparameter.findByIdgroupparameter", query = "SELECT g FROM Groupparameter g WHERE g.idgroupparameter = :idgroupparameter"),
    @NamedQuery(name = "Groupparameter.findByDescription", query = "SELECT g FROM Groupparameter g WHERE g.description = :description"),
    @NamedQuery(name = "Groupparameter.findByCreatedate", query = "SELECT g FROM Groupparameter g WHERE g.createdate = :createdate"),
    @NamedQuery(name = "Groupparameter.findByUpdatedate", query = "SELECT g FROM Groupparameter g WHERE g.updatedate = :updatedate")})
public class Groupparameter implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGROUPPARAMETER")
    private BigDecimal idgroupparameter;
    @Size(max = 500)
    @Column(name = "DESCRIPTION")
    private String description;
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

    public Groupparameter() {
    }

    public Groupparameter(BigDecimal idgroupparameter) {
        this.idgroupparameter = idgroupparameter;
    }

    public Groupparameter(BigDecimal idgroupparameter, Date createdate, Date updatedate) {
        this.idgroupparameter = idgroupparameter;
        this.createdate = createdate;
        this.updatedate = updatedate;
    }

    public BigDecimal getIdgroupparameter() {
        return idgroupparameter;
    }

    public void setIdgroupparameter(BigDecimal idgroupparameter) {
        this.idgroupparameter = idgroupparameter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (idgroupparameter != null ? idgroupparameter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupparameter)) {
            return false;
        }
        Groupparameter other = (Groupparameter) object;
        if ((this.idgroupparameter == null && other.idgroupparameter != null) || (this.idgroupparameter != null && !this.idgroupparameter.equals(other.idgroupparameter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Groupparameter[ idgroupparameter=" + idgroupparameter + " ]";
    }
    
}
