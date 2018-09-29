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
@Table(name = "DETAILTEMPTPAY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detailtemptpay.findAll", query = "SELECT d FROM Detailtemptpay d"),
    @NamedQuery(name = "Detailtemptpay.findByIddetailtemptpay", query = "SELECT d FROM Detailtemptpay d WHERE d.iddetailtemptpay = :iddetailtemptpay"),
    @NamedQuery(name = "Detailtemptpay.findByIdclothingline", query = "SELECT d FROM Detailtemptpay d WHERE d.idclothingline = :idclothingline"),
    @NamedQuery(name = "Detailtemptpay.findByIdclothing", query = "SELECT d FROM Detailtemptpay d WHERE d.idclothing = :idclothing"),
    @NamedQuery(name = "Detailtemptpay.findByIdcolor", query = "SELECT d FROM Detailtemptpay d WHERE d.idcolor = :idcolor"),
    @NamedQuery(name = "Detailtemptpay.findByIddescription", query = "SELECT d FROM Detailtemptpay d WHERE d.iddescription = :iddescription"),
    @NamedQuery(name = "Detailtemptpay.findByPrice", query = "SELECT d FROM Detailtemptpay d WHERE d.price = :price"),
    @NamedQuery(name = "Detailtemptpay.findByIdvaucher", query = "SELECT d FROM Detailtemptpay d WHERE d.idvaucher = :idvaucher"),
    @NamedQuery(name = "Detailtemptpay.findByTotalprice", query = "SELECT d FROM Detailtemptpay d WHERE d.totalprice = :totalprice"),
    @NamedQuery(name = "Detailtemptpay.findByTotalitem", query = "SELECT d FROM Detailtemptpay d WHERE d.totalitem = :totalitem"),
    @NamedQuery(name = "Detailtemptpay.findByDescription", query = "SELECT d FROM Detailtemptpay d WHERE d.description = :description"),
    @NamedQuery(name = "Detailtemptpay.findByIdstatus", query = "SELECT d FROM Detailtemptpay d WHERE d.idstatus = :idstatus"),
    @NamedQuery(name = "Detailtemptpay.findByCreatedate", query = "SELECT d FROM Detailtemptpay d WHERE d.createdate = :createdate"),
    @NamedQuery(name = "Detailtemptpay.findByUpdatedate", query = "SELECT d FROM Detailtemptpay d WHERE d.updatedate = :updatedate"),
    @NamedQuery(name = "Detailtemptpay.findByStatus", query = "SELECT d FROM Detailtemptpay d WHERE d.status = :status"),
    @NamedQuery(name = "Detailtemptpay.findByIdusercreate", query = "SELECT d FROM Detailtemptpay d WHERE d.idusercreate = :idusercreate")})
public class Detailtemptpay implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDETAILTEMPTPAY")
    private BigDecimal iddetailtemptpay;
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
    @Column(name = "IDVAUCHER")
    private BigInteger idvaucher;
    @Column(name = "TOTALPRICE")
    private BigInteger totalprice;
    @Column(name = "TOTALITEM")
    private BigInteger totalitem;
    @Size(max = 200)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSTATUS")
    private BigInteger idstatus;
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

    public Detailtemptpay() {
    }

    public Detailtemptpay(BigDecimal iddetailtemptpay) {
        this.iddetailtemptpay = iddetailtemptpay;
    }

    public Detailtemptpay(BigDecimal iddetailtemptpay, BigInteger idclothingline, BigInteger idclothing, BigInteger idcolor, BigInteger iddescription, BigInteger idstatus, Date createdate, Date updatedate, short status) {
        this.iddetailtemptpay = iddetailtemptpay;
        this.idclothingline = idclothingline;
        this.idclothing = idclothing;
        this.idcolor = idcolor;
        this.iddescription = iddescription;
        this.idstatus = idstatus;
        this.createdate = createdate;
        this.updatedate = updatedate;
        this.status = status;
    }

    public BigDecimal getIddetailtemptpay() {
        return iddetailtemptpay;
    }

    public void setIddetailtemptpay(BigDecimal iddetailtemptpay) {
        this.iddetailtemptpay = iddetailtemptpay;
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

    public BigInteger getIdvaucher() {
        return idvaucher;
    }

    public void setIdvaucher(BigInteger idvaucher) {
        this.idvaucher = idvaucher;
    }

    public BigInteger getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigInteger totalprice) {
        this.totalprice = totalprice;
    }

    public BigInteger getTotalitem() {
        return totalitem;
    }

    public void setTotalitem(BigInteger totalitem) {
        this.totalitem = totalitem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(BigInteger idstatus) {
        this.idstatus = idstatus;
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
        hash += (iddetailtemptpay != null ? iddetailtemptpay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detailtemptpay)) {
            return false;
        }
        Detailtemptpay other = (Detailtemptpay) object;
        if ((this.iddetailtemptpay == null && other.iddetailtemptpay != null) || (this.iddetailtemptpay != null && !this.iddetailtemptpay.equals(other.iddetailtemptpay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Detailtemptpay[ iddetailtemptpay=" + iddetailtemptpay + " ]";
    }
    
}
