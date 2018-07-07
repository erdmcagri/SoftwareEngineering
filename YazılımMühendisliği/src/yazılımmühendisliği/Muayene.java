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
@Table(name = "MUAYENE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Muayene.findAll", query = "SELECT m FROM Muayene m"),
    @NamedQuery(name = "Muayene.findByMid", query = "SELECT m FROM Muayene m WHERE m.mid = :mid"),
    @NamedQuery(name = "Muayene.findByMhastano", query = "SELECT m FROM Muayene m WHERE m.mhastano = :mhastano"),
    @NamedQuery(name = "Muayene.findByMtcno", query = "SELECT m FROM Muayene m WHERE m.mtcno = :mtcno"),
    @NamedQuery(name = "Muayene.findByMadsoyad", query = "SELECT m FROM Muayene m WHERE m.madsoyad = :madsoyad"),
    @NamedQuery(name = "Muayene.findByMceptel", query = "SELECT m FROM Muayene m WHERE m.mceptel = :mceptel"),
    @NamedQuery(name = "Muayene.findByMevtel", query = "SELECT m FROM Muayene m WHERE m.mevtel = :mevtel"),
    @NamedQuery(name = "Muayene.findByMadres", query = "SELECT m FROM Muayene m WHERE m.madres = :madres"),
    @NamedQuery(name = "Muayene.findByMtarih", query = "SELECT m FROM Muayene m WHERE m.mtarih = :mtarih"),
    @NamedQuery(name = "Muayene.findByMsikayet", query = "SELECT m FROM Muayene m WHERE m.msikayet = :msikayet"),
    @NamedQuery(name = "Muayene.findByMbulgu", query = "SELECT m FROM Muayene m WHERE m.mbulgu = :mbulgu"),
    @NamedQuery(name = "Muayene.findByMteshis", query = "SELECT m FROM Muayene m WHERE m.mteshis = :mteshis"),
    @NamedQuery(name = "Muayene.findByMtedavi", query = "SELECT m FROM Muayene m WHERE m.mtedavi = :mtedavi"),
    @NamedQuery(name = "Muayene.findByMreceteid", query = "SELECT m FROM Muayene m WHERE m.mreceteid = :mreceteid"),
    @NamedQuery(name = "Muayene.findByMraporid", query = "SELECT m FROM Muayene m WHERE m.mraporid = :mraporid"),
    @NamedQuery(name = "Muayene.findByMsevkid", query = "SELECT m FROM Muayene m WHERE m.msevkid = :msevkid"),
    @NamedQuery(name = "Muayene.findByMdurum", query = "SELECT m FROM Muayene m WHERE m.mdurum = :mdurum")})
public class Muayene implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MID")
    private Integer mid;
    @Column(name = "MHASTANO")
    private Integer mhastano;
    @Basic(optional = false)
    @Column(name = "MTCNO")
    private String mtcno;
    @Basic(optional = false)
    @Column(name = "MADSOYAD")
    private String madsoyad;
    @Column(name = "MCEPTEL")
    private String mceptel;
    @Column(name = "MEVTEL")
    private String mevtel;
    @Column(name = "MADRES")
    private String madres;
    @Column(name = "MTARIH")
    private String mtarih;
    @Column(name = "MSIKAYET")
    private String msikayet;
    @Column(name = "MBULGU")
    private String mbulgu;
    @Column(name = "MTESHIS")
    private String mteshis;
    @Column(name = "MTEDAVI")
    private String mtedavi;
    @Column(name = "MRECETEID")
    private Integer mreceteid;
    @Column(name = "MRAPORID")
    private Integer mraporid;
    @Column(name = "MSEVKID")
    private Integer msevkid;
    @Column(name = "MDURUM")
    private String mdurum;

    public Muayene() {
    }

    public Muayene(Integer mid) {
        this.mid = mid;
    }

    public Muayene(Integer mid, String mtcno, String madsoyad) {
        this.mid = mid;
        this.mtcno = mtcno;
        this.madsoyad = madsoyad;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMhastano() {
        return mhastano;
    }

    public void setMhastano(Integer mhastano) {
        this.mhastano = mhastano;
    }

    public String getMtcno() {
        return mtcno;
    }

    public void setMtcno(String mtcno) {
        this.mtcno = mtcno;
    }

    public String getMadsoyad() {
        return madsoyad;
    }

    public void setMadsoyad(String madsoyad) {
        this.madsoyad = madsoyad;
    }

    public String getMceptel() {
        return mceptel;
    }

    public void setMceptel(String mceptel) {
        this.mceptel = mceptel;
    }

    public String getMevtel() {
        return mevtel;
    }

    public void setMevtel(String mevtel) {
        this.mevtel = mevtel;
    }

    public String getMadres() {
        return madres;
    }

    public void setMadres(String madres) {
        this.madres = madres;
    }

    public String getMtarih() {
        return mtarih;
    }

    public void setMtarih(String mtarih) {
        this.mtarih = mtarih;
    }

    public String getMsikayet() {
        return msikayet;
    }

    public void setMsikayet(String msikayet) {
        this.msikayet = msikayet;
    }

    public String getMbulgu() {
        return mbulgu;
    }

    public void setMbulgu(String mbulgu) {
        this.mbulgu = mbulgu;
    }

    public String getMteshis() {
        return mteshis;
    }

    public void setMteshis(String mteshis) {
        this.mteshis = mteshis;
    }

    public String getMtedavi() {
        return mtedavi;
    }

    public void setMtedavi(String mtedavi) {
        this.mtedavi = mtedavi;
    }

    public Integer getMreceteid() {
        return mreceteid;
    }

    public void setMreceteid(Integer mreceteid) {
        this.mreceteid = mreceteid;
    }

    public Integer getMraporid() {
        return mraporid;
    }

    public void setMraporid(Integer mraporid) {
        this.mraporid = mraporid;
    }

    public Integer getMsevkid() {
        return msevkid;
    }

    public void setMsevkid(Integer msevkid) {
        this.msevkid = msevkid;
    }

    public String getMdurum() {
        return mdurum;
    }

    public void setMdurum(String mdurum) {
        this.mdurum = mdurum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Muayene)) {
            return false;
        }
        Muayene other = (Muayene) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Muayene[ mid=" + mid + " ]";
    }
    
}
