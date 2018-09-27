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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Images.findAll", query = "SELECT i FROM Images i"),
    @NamedQuery(name = "Images.findByIdimages", query = "SELECT i FROM Images i WHERE i.idimages = :idimages"),
    @NamedQuery(name = "Images.findByName", query = "SELECT i FROM Images i WHERE i.name = :name"),
    @NamedQuery(name = "Images.findByDescription", query = "SELECT i FROM Images i WHERE i.description = :description"),
    @NamedQuery(name = "Images.findByCreateddate", query = "SELECT i FROM Images i WHERE i.createddate = :createddate"),
    @NamedQuery(name = "Images.findByUpdatedate", query = "SELECT i FROM Images i WHERE i.updatedate = :updatedate"),
    @NamedQuery(name = "Images.findByStatus", query = "SELECT i FROM Images i WHERE i.status = :status"),
    @NamedQuery(name = "Images.findByUsercreate", query = "SELECT i FROM Images i WHERE i.usercreate = :usercreate")})
public class Images implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal idimages;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(nullable = false, length = 500)
    private String description;
    @Lob
    @Size(max = 0)
    @Column(length = 0)
    private String path;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedate;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private short status;
    private BigInteger usercreate;
    @JoinColumn(name = "IDDETAILIMAGEN", referencedColumnName = "IDDETAILIMAGEN")
    @ManyToOne
    private Detailimages iddetailimagen;

    public Images() {
    }

    public Images(BigDecimal idimages) {
        this.idimages = idimages;
    }

    public Images(BigDecimal idimages, String name, String description, short status) {
        this.idimages = idimages;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public BigDecimal getIdimages() {
        return idimages;
    }

    public void setIdimages(BigDecimal idimages) {
        this.idimages = idimages;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public BigInteger getUsercreate() {
        return usercreate;
    }

    public void setUsercreate(BigInteger usercreate) {
        this.usercreate = usercreate;
    }

    public Detailimages getIddetailimagen() {
        return iddetailimagen;
    }

    public void setIddetailimagen(Detailimages iddetailimagen) {
        this.iddetailimagen = iddetailimagen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idimages != null ? idimages.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Images)) {
            return false;
        }
        Images other = (Images) object;
        if ((this.idimages == null && other.idimages != null) || (this.idimages != null && !this.idimages.equals(other.idimages))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Images[ idimages=" + idimages + " ]";
    }
    
}
