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
@Table(name = "CLOTHING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clothing.findAll", query = "SELECT c FROM Clothing c"),
    @NamedQuery(name = "Clothing.findByIdclothing", query = "SELECT c FROM Clothing c WHERE c.idclothing = :idclothing"),
    @NamedQuery(name = "Clothing.findByIdclothingline", query = "SELECT c FROM Clothing c WHERE c.idclothingline = :idclothingline"),
    @NamedQuery(name = "Clothing.findByIdcolor", query = "SELECT c FROM Clothing c WHERE c.idcolor = :idcolor"),
    @NamedQuery(name = "Clothing.findByName", query = "SELECT c FROM Clothing c WHERE c.name = :name"),
    @NamedQuery(name = "Clothing.findByDescription", query = "SELECT c FROM Clothing c WHERE c.description = :description"),
    @NamedQuery(name = "Clothing.findByStatus", query = "SELECT c FROM Clothing c WHERE c.status = :status"),
    @NamedQuery(name = "Clothing.findByCreatedate", query = "SELECT c FROM Clothing c WHERE c.createdate = :createdate"),
    @NamedQuery(name = "Clothing.findByUpdatedate", query = "SELECT c FROM Clothing c WHERE c.updatedate = :updatedate")})
public class Clothing implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCLOTHING")
    private BigDecimal idclothing;
    @Column(name = "IDCLOTHINGLINE")
    private BigInteger idclothingline;
    @Column(name = "IDCOLOR")
    private BigInteger idcolor;
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

    public Clothing() {
    }

    public Clothing(BigDecimal idclothing) {
        this.idclothing = idclothing;
    }

    public Clothing(BigDecimal idclothing, String name, short status, Date createdate, Date updatedate) {
        this.idclothing = idclothing;
        this.name = name;
        this.status = status;
        this.createdate = createdate;
        this.updatedate = updatedate;
    }

    public BigDecimal getIdclothing() {
        return idclothing;
    }

    public void setIdclothing(BigDecimal idclothing) {
        this.idclothing = idclothing;
    }

    public BigInteger getIdclothingline() {
        return idclothingline;
    }

    public void setIdclothingline(BigInteger idclothingline) {
        this.idclothingline = idclothingline;
    }

    public BigInteger getIdcolor() {
        return idcolor;
    }

    public void setIdcolor(BigInteger idcolor) {
        this.idcolor = idcolor;
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
        hash += (idclothing != null ? idclothing.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clothing)) {
            return false;
        }
        Clothing other = (Clothing) object;
        if ((this.idclothing == null && other.idclothing != null) || (this.idclothing != null && !this.idclothing.equals(other.idclothing))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Clothing[ idclothing=" + idclothing + " ]";
    }
    
}
