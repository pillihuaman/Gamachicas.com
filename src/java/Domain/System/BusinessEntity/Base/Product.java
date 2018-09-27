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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zarmir
 */
@Entity
@Table(catalog = "", schema = "AFRODITA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByIdproduct", query = "SELECT p FROM Product p WHERE p.idproduct = :idproduct"),
    @NamedQuery(name = "Product.findByIdproductline", query = "SELECT p FROM Product p WHERE p.idproductline = :idproductline"),
    @NamedQuery(name = "Product.findByCreateddate", query = "SELECT p FROM Product p WHERE p.createddate = :createddate"),
    @NamedQuery(name = "Product.findByUpdatedate", query = "SELECT p FROM Product p WHERE p.updatedate = :updatedate"),
    @NamedQuery(name = "Product.findByUsercreate", query = "SELECT p FROM Product p WHERE p.usercreate = :usercreate")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal idproduct;
    private BigInteger idproductline;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedate;
    private BigInteger usercreate;

    public Product() {
    }

    public Product(BigDecimal idproduct) {
        this.idproduct = idproduct;
    }

    public BigDecimal getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(BigDecimal idproduct) {
        this.idproduct = idproduct;
    }

    public BigInteger getIdproductline() {
        return idproductline;
    }

    public void setIdproductline(BigInteger idproductline) {
        this.idproductline = idproductline;
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
        hash += (idproduct != null ? idproduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.idproduct == null && other.idproduct != null) || (this.idproduct != null && !this.idproduct.equals(other.idproduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Product[ idproduct=" + idproduct + " ]";
    }
    
}
