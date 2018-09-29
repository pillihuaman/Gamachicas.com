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
@Table(name = "STOCK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s"),
    @NamedQuery(name = "Stock.findByIdstock", query = "SELECT s FROM Stock s WHERE s.idstock = :idstock"),
    @NamedQuery(name = "Stock.findByIdclothingline", query = "SELECT s FROM Stock s WHERE s.idclothingline = :idclothingline"),
    @NamedQuery(name = "Stock.findByIdclothing", query = "SELECT s FROM Stock s WHERE s.idclothing = :idclothing"),
    @NamedQuery(name = "Stock.findByIdcolor", query = "SELECT s FROM Stock s WHERE s.idcolor = :idcolor"),
    @NamedQuery(name = "Stock.findByIddescription", query = "SELECT s FROM Stock s WHERE s.iddescription = :iddescription"),
    @NamedQuery(name = "Stock.findByPrice", query = "SELECT s FROM Stock s WHERE s.price = :price"),
    @NamedQuery(name = "Stock.findByCount", query = "SELECT s FROM Stock s WHERE s.count = :count"),
    @NamedQuery(name = "Stock.findByDescription", query = "SELECT s FROM Stock s WHERE s.description = :description"),
    @NamedQuery(name = "Stock.findByCreatedate", query = "SELECT s FROM Stock s WHERE s.createdate = :createdate"),
    @NamedQuery(name = "Stock.findByUpdatedate", query = "SELECT s FROM Stock s WHERE s.updatedate = :updatedate"),
    @NamedQuery(name = "Stock.findByStatus", query = "SELECT s FROM Stock s WHERE s.status = :status"),
    @NamedQuery(name = "Stock.findByIdusercreate", query = "SELECT s FROM Stock s WHERE s.idusercreate = :idusercreate")})
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSTOCK")
    private BigDecimal idstock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCLOTHINGLINE")
    private BigInteger idclothingline;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCLOTHING")
    private BigInteger idclothing;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOLOR")
    private BigInteger idcolor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDESCRIPTION")
    private BigInteger iddescription;
    @Column(name = "PRICE")
    private BigInteger price;
    @Column(name = "COUNT")
    private BigInteger count;
    @Size(max = 200)
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS")
    private short status;
    @Column(name = "IDUSERCREATE")
    private BigInteger idusercreate;

    public Stock() {
    }

    public Stock(BigDecimal idstock) {
        this.idstock = idstock;
    }

    public Stock(BigDecimal idstock, BigInteger idclothingline, BigInteger idclothing, BigInteger idcolor, BigInteger iddescription, Date createdate, Date updatedate, short status) {
        this.idstock = idstock;
        this.idclothingline = idclothingline;
        this.idclothing = idclothing;
        this.idcolor = idcolor;
        this.iddescription = iddescription;
        this.createdate = createdate;
        this.updatedate = updatedate;
        this.status = status;
    }

    public BigDecimal getIdstock() {
        return idstock;
    }

    public void setIdstock(BigDecimal idstock) {
        this.idstock = idstock;
    }

    public BigInteger getIdclothingline() {
        return idclothingline;
    }

    public void setIdclothingline(BigInteger idclothingline) {
        this.idclothingline = idclothingline;
    }

    public BigInteger getIdclothing() {
        return idclothing;
    }

    public void setIdclothing(BigInteger idclothing) {
        this.idclothing = idclothing;
    }

    public BigInteger getIdcolor() {
        return idcolor;
    }

    public void setIdcolor(BigInteger idcolor) {
        this.idcolor = idcolor;
    }

    public BigInteger getIddescription() {
        return iddescription;
    }

    public void setIddescription(BigInteger iddescription) {
        this.iddescription = iddescription;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
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

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public BigInteger getIdusercreate() {
        return idusercreate;
    }

    public void setIdusercreate(BigInteger idusercreate) {
        this.idusercreate = idusercreate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstock != null ? idstock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.idstock == null && other.idstock != null) || (this.idstock != null && !this.idstock.equals(other.idstock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Stock[ idstock=" + idstock + " ]";
    }
    
}
