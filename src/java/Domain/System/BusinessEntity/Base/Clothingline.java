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
@Table(name = "CLOTHINGLINE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clothingline.findAll", query = "SELECT c FROM Clothingline c"),
    @NamedQuery(name = "Clothingline.findByIdclothingline", query = "SELECT c FROM Clothingline c WHERE c.idclothingline = :idclothingline"),
    @NamedQuery(name = "Clothingline.findByName", query = "SELECT c FROM Clothingline c WHERE c.name = :name"),
    @NamedQuery(name = "Clothingline.findByDescription", query = "SELECT c FROM Clothingline c WHERE c.description = :description"),
    @NamedQuery(name = "Clothingline.findByStatus", query = "SELECT c FROM Clothingline c WHERE c.status = :status"),
    @NamedQuery(name = "Clothingline.findByCreatedate", query = "SELECT c FROM Clothingline c WHERE c.createdate = :createdate"),
    @NamedQuery(name = "Clothingline.findByUpdatedate", query = "SELECT c FROM Clothingline c WHERE c.updatedate = :updatedate")})
public class Clothingline implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCLOTHINGLINE")
    private BigDecimal idclothingline;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME")
    private String name;
    @Size(max = 500)
    @Column(name = "DESCRIPTION")
    private String description;
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

    public Clothingline() {
    }

    public Clothingline(BigDecimal idclothingline) {
        this.idclothingline = idclothingline;
    }

    public Clothingline(BigDecimal idclothingline, String name, short status, Date createdate, Date updatedate) {
        this.idclothingline = idclothingline;
        this.name = name;
        this.status = status;
        this.createdate = createdate;
        this.updatedate = updatedate;
    }

    public BigDecimal getIdclothingline() {
        return idclothingline;
    }

    public void setIdclothingline(BigDecimal idclothingline) {
        this.idclothingline = idclothingline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (idclothingline != null ? idclothingline.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clothingline)) {
            return false;
        }
        Clothingline other = (Clothingline) object;
        if ((this.idclothingline == null && other.idclothingline != null) || (this.idclothingline != null && !this.idclothingline.equals(other.idclothingline))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Clothingline[ idclothingline=" + idclothingline + " ]";
    }
    
}
