/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.System.BusinessEntity.Base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author zarmir
 */
@Entity
@Table(catalog = "", schema = "AFRODITA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detailimages.findAll", query = "SELECT d FROM Detailimages d"),
    @NamedQuery(name = "Detailimages.findByIddetailimagen", query = "SELECT d FROM Detailimages d WHERE d.iddetailimagen = :iddetailimagen"),
    @NamedQuery(name = "Detailimages.findByColor", query = "SELECT d FROM Detailimages d WHERE d.color = :color"),
    @NamedQuery(name = "Detailimages.findByZise", query = "SELECT d FROM Detailimages d WHERE d.zise = :zise"),
    @NamedQuery(name = "Detailimages.findByClothtype", query = "SELECT d FROM Detailimages d WHERE d.clothtype = :clothtype"),
    @NamedQuery(name = "Detailimages.findByCreateddate", query = "SELECT d FROM Detailimages d WHERE d.createddate = :createddate"),
    @NamedQuery(name = "Detailimages.findByUpdatedate", query = "SELECT d FROM Detailimages d WHERE d.updatedate = :updatedate")})
public class Detailimages implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal iddetailimagen;
    @Size(max = 50)
    @Column(length = 50)
    private String color;
    @Column(precision = 16, scale = 2)
    private BigDecimal zise;
    @Size(max = 500)
    @Column(length = 500)
    private String clothtype;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedate;
    @OneToMany(mappedBy = "iddetailimagen")
    private Collection<Images> imagesCollection;

    public Detailimages() {
    }

    public Detailimages(BigDecimal iddetailimagen) {
        this.iddetailimagen = iddetailimagen;
    }

    public BigDecimal getIddetailimagen() {
        return iddetailimagen;
    }

    public void setIddetailimagen(BigDecimal iddetailimagen) {
        this.iddetailimagen = iddetailimagen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getZise() {
        return zise;
    }

    public void setZise(BigDecimal zise) {
        this.zise = zise;
    }

    public String getClothtype() {
        return clothtype;
    }

    public void setClothtype(String clothtype) {
        this.clothtype = clothtype;
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

    @XmlTransient
    public Collection<Images> getImagesCollection() {
        return imagesCollection;
    }

    public void setImagesCollection(Collection<Images> imagesCollection) {
        this.imagesCollection = imagesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetailimagen != null ? iddetailimagen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detailimages)) {
            return false;
        }
        Detailimages other = (Detailimages) object;
        if ((this.iddetailimagen == null && other.iddetailimagen != null) || (this.iddetailimagen != null && !this.iddetailimagen.equals(other.iddetailimagen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Detailimages[ iddetailimagen=" + iddetailimagen + " ]";
    }
    
}
