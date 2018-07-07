/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yazılımmühendisliği;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erdem
 */
@Entity
@Table(name = "ODEME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Odeme.findAll", query = "SELECT o FROM Odeme o"),
    @NamedQuery(name = "Odeme.findByOdemeid", query = "SELECT o FROM Odeme o WHERE o.odemeid = :odemeid"),
    @NamedQuery(name = "Odeme.findByOtcno", query = "SELECT o FROM Odeme o WHERE o.otcno = :otcno"),
    @NamedQuery(name = "Odeme.findByOadsoyad", query = "SELECT o FROM Odeme o WHERE o.oadsoyad = :oadsoyad"),
    @NamedQuery(name = "Odeme.findByOsosguv", query = "SELECT o FROM Odeme o WHERE o.ososguv = :ososguv"),
    @NamedQuery(name = "Odeme.findByOsekli", query = "SELECT o FROM Odeme o WHERE o.osekli = :osekli"),
    @NamedQuery(name = "Odeme.findByOtutar", query = "SELECT o FROM Odeme o WHERE o.otutar = :otutar"),
    @NamedQuery(name = "Odeme.findByOislemyapan", query = "SELECT o FROM Odeme o WHERE o.oislemyapan = :oislemyapan")})
public class Odeme implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ODEMEID")
    private Integer odemeid;
    @Basic(optional = false)
    @Column(name = "OTCNO")
    private String otcno;
    @Basic(optional = false)
    @Column(name = "OADSOYAD")
    private String oadsoyad;
    @Basic(optional = false)
    @Column(name = "OSOSGUV")
    private String ososguv;
    @Basic(optional = false)
    @Column(name = "OSEKLI")
    private String osekli;
    @Column(name = "OTUTAR")
    private Integer otutar;
    @Basic(optional = false)
    @Column(name = "OISLEMYAPAN")
    private String oislemyapan;

    public Odeme() {
    }

    public Odeme(Integer odemeid) {
        this.odemeid = odemeid;
    }

    public Odeme(Integer odemeid, String otcno, String oadsoyad, String ososguv, String osekli, String oislemyapan) {
        this.odemeid = odemeid;
        this.otcno = otcno;
        this.oadsoyad = oadsoyad;
        this.ososguv = ososguv;
        this.osekli = osekli;
        this.oislemyapan = oislemyapan;
    }

    public Integer getOdemeid() {
        return odemeid;
    }

    public void setOdemeid(Integer odemeid) {
        this.odemeid = odemeid;
    }

    public String getOtcno() {
        return otcno;
    }

    public void setOtcno(String otcno) {
        this.otcno = otcno;
    }

    public String getOadsoyad() {
        return oadsoyad;
    }

    public void setOadsoyad(String oadsoyad) {
        this.oadsoyad = oadsoyad;
    }

    public String getOsosguv() {
        return ososguv;
    }

    public void setOsosguv(String ososguv) {
        this.ososguv = ososguv;
    }

    public String getOsekli() {
        return osekli;
    }

    public void setOsekli(String osekli) {
        this.osekli = osekli;
    }

    public Integer getOtutar() {
        return otutar;
    }

    public void setOtutar(Integer otutar) {
        this.otutar = otutar;
    }

    public String getOislemyapan() {
        return oislemyapan;
    }

    public void setOislemyapan(String oislemyapan) {
        this.oislemyapan = oislemyapan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (odemeid != null ? odemeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Odeme)) {
            return false;
        }
        Odeme other = (Odeme) object;
        if ((this.odemeid == null && other.odemeid != null) || (this.odemeid != null && !this.odemeid.equals(other.odemeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Odeme[ odemeid=" + odemeid + " ]";
    }
    
}
