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
    @NamedQuery(name = "Productline.findAll", query = "SELECT p FROM Productline p"),
    @NamedQuery(name = "Productline.findByIdproductline", query = "SELECT p FROM Productline p WHERE p.idproductline = :idproductline"),
    @NamedQuery(name = "Productline.findByDescription", query = "SELECT p FROM Productline p WHERE p.description = :description"),
    @NamedQuery(name = "Productline.findByCreateddate", query = "SELECT p FROM Productline p WHERE p.createddate = :createddate"),
    @NamedQuery(name = "Productline.findByUpdatedate", query = "SELECT p FROM Productline p WHERE p.updatedate = :updatedate"),
    @NamedQuery(name = "Productline.findByUsercreate", query = "SELECT p FROM Productline p WHERE p.usercreate = :usercreate")})
public class Productline implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal idproductline;
    @Size(max = 500)
    @Column(length = 500)
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedate;
    private BigInteger usercreate;

    public Productline() {
    }

    public Productline(BigDecimal idproductline) {
        this.idproductline = idproductline;
    }

    public BigDecimal getIdproductline() {
        return idproductline;
    }

    public void setIdproductline(BigDecimal idproductline) {
        this.idproductline = idproductline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public BigInteger getUsercreate() {
        return usercreate;
    }

    public void setUsercreate(BigInteger usercreate) {
        this.usercreate = usercreate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproductline != null ? idproductline.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productline)) {
            return false;
        }
        Productline other = (Productline) object;
        if ((this.idproductline == null && other.idproductline != null) || (this.idproductline != null && !this.idproductline.equals(other.idproductline))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Productline[ idproductline=" + idproductline + " ]";
    }
    
}
