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
@Table(name = "TEMPTPAYHEADER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Temptpayheader.findAll", query = "SELECT t FROM Temptpayheader t"),
    @NamedQuery(name = "Temptpayheader.findByIdtemptpayheader", query = "SELECT t FROM Temptpayheader t WHERE t.idtemptpayheader = :idtemptpayheader"),
    @NamedQuery(name = "Temptpayheader.findByIdvaucher", query = "SELECT t FROM Temptpayheader t WHERE t.idvaucher = :idvaucher"),
    @NamedQuery(name = "Temptpayheader.findByTotalprice", query = "SELECT t FROM Temptpayheader t WHERE t.totalprice = :totalprice"),
    @NamedQuery(name = "Temptpayheader.findByTotalitem", query = "SELECT t FROM Temptpayheader t WHERE t.totalitem = :totalitem"),
    @NamedQuery(name = "Temptpayheader.findByDescription", query = "SELECT t FROM Temptpayheader t WHERE t.description = :description"),
    @NamedQuery(name = "Temptpayheader.findByIdstatus", query = "SELECT t FROM Temptpayheader t WHERE t.idstatus = :idstatus"),
    @NamedQuery(name = "Temptpayheader.findByCreatedate", query = "SELECT t FROM Temptpayheader t WHERE t.createdate = :createdate"),
    @NamedQuery(name = "Temptpayheader.findByUpdatedate", query = "SELECT t FROM Temptpayheader t WHERE t.updatedate = :updatedate"),
    @NamedQuery(name = "Temptpayheader.findByStatus", query = "SELECT t FROM Temptpayheader t WHERE t.status = :status"),
    @NamedQuery(name = "Temptpayheader.findByIdusercreate", query = "SELECT t FROM Temptpayheader t WHERE t.idusercreate = :idusercreate")})
public class Temptpayheader implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTEMPTPAYHEADER")
    private BigDecimal idtemptpayheader;
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

    public Temptpayheader() {
    }

    public Temptpayheader(BigDecimal idtemptpayheader) {
        this.idtemptpayheader = idtemptpayheader;
    }

    public Temptpayheader(BigDecimal idtemptpayheader, BigInteger idstatus, Date createdate, Date updatedate, short status) {
        this.idtemptpayheader = idtemptpayheader;
        this.idstatus = idstatus;
        this.createdate = createdate;
        this.updatedate = updatedate;
        this.status = status;
    }

    public BigDecimal getIdtemptpayheader() {
        return idtemptpayheader;
    }

    public void setIdtemptpayheader(BigDecimal idtemptpayheader) {
        this.idtemptpayheader = idtemptpayheader;
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
        hash += (idtemptpayheader != null ? idtemptpayheader.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temptpayheader)) {
            return false;
        }
        Temptpayheader other = (Temptpayheader) object;
        if ((this.idtemptpayheader == null && other.idtemptpayheader != null) || (this.idtemptpayheader != null && !this.idtemptpayheader.equals(other.idtemptpayheader))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Temptpayheader[ idtemptpayheader=" + idtemptpayheader + " ]";
    }
    
}
