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
@Table(name = "HKAYIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hkayit.findAll", query = "SELECT h FROM Hkayit h"),
    @NamedQuery(name = "Hkayit.findByHastano", query = "SELECT h FROM Hkayit h WHERE h.hastano = :hastano"),
    @NamedQuery(name = "Hkayit.findByHtcno", query = "SELECT h FROM Hkayit h WHERE h.htcno = :htcno"),
    @NamedQuery(name = "Hkayit.findByHadsoyad", query = "SELECT h FROM Hkayit h WHERE h.hadsoyad = :hadsoyad"),
    @NamedQuery(name = "Hkayit.findByHbabaadi", query = "SELECT h FROM Hkayit h WHERE h.hbabaadi = :hbabaadi"),
    @NamedQuery(name = "Hkayit.findByHanneadi", query = "SELECT h FROM Hkayit h WHERE h.hanneadi = :hanneadi"),
    @NamedQuery(name = "Hkayit.findByHdtarih", query = "SELECT h FROM Hkayit h WHERE h.hdtarih = :hdtarih"),
    @NamedQuery(name = "Hkayit.findByHdyer", query = "SELECT h FROM Hkayit h WHERE h.hdyer = :hdyer"),
    @NamedQuery(name = "Hkayit.findByHcinsiyet", query = "SELECT h FROM Hkayit h WHERE h.hcinsiyet = :hcinsiyet"),
    @NamedQuery(name = "Hkayit.findByHboy", query = "SELECT h FROM Hkayit h WHERE h.hboy = :hboy"),
    @NamedQuery(name = "Hkayit.findByHkilo", query = "SELECT h FROM Hkayit h WHERE h.hkilo = :hkilo"),
    @NamedQuery(name = "Hkayit.findByHkaytarih", query = "SELECT h FROM Hkayit h WHERE h.hkaytarih = :hkaytarih"),
    @NamedQuery(name = "Hkayit.findByHadres", query = "SELECT h FROM Hkayit h WHERE h.hadres = :hadres"),
    @NamedQuery(name = "Hkayit.findByHevtel", query = "SELECT h FROM Hkayit h WHERE h.hevtel = :hevtel"),
    @NamedQuery(name = "Hkayit.findByHceptel", query = "SELECT h FROM Hkayit h WHERE h.hceptel = :hceptel"),
    @NamedQuery(name = "Hkayit.findByHistel", query = "SELECT h FROM Hkayit h WHERE h.histel = :histel"),
    @NamedQuery(name = "Hkayit.findByHmail", query = "SELECT h FROM Hkayit h WHERE h.hmail = :hmail"),
    @NamedQuery(name = "Hkayit.findByHsosguv", query = "SELECT h FROM Hkayit h WHERE h.hsosguv = :hsosguv"),
    @NamedQuery(name = "Hkayit.findByHkangrubu", query = "SELECT h FROM Hkayit h WHERE h.hkangrubu = :hkangrubu"),
    @NamedQuery(name = "Hkayit.findByHsigara", query = "SELECT h FROM Hkayit h WHERE h.hsigara = :hsigara"),
    @NamedQuery(name = "Hkayit.findByHalkol", query = "SELECT h FROM Hkayit h WHERE h.halkol = :halkol"),
    @NamedQuery(name = "Hkayit.findByHkulilac", query = "SELECT h FROM Hkayit h WHERE h.hkulilac = :hkulilac"),
    @NamedQuery(name = "Hkayit.findByHgechastalik", query = "SELECT h FROM Hkayit h WHERE h.hgechastalik = :hgechastalik"),
    @NamedQuery(name = "Hkayit.findByHailehas", query = "SELECT h FROM Hkayit h WHERE h.hailehas = :hailehas"),
    @NamedQuery(name = "Hkayit.findByHgecmisamel", query = "SELECT h FROM Hkayit h WHERE h.hgecmisamel = :hgecmisamel")})
public class Hkayit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HASTANO")
    private Integer hastano;
    @Basic(optional = false)
    @Column(name = "HTCNO")
    private String htcno;
    @Basic(optional = false)
    @Column(name = "HADSOYAD")
    private String hadsoyad;
    @Column(name = "HBABAADI")
    private String hbabaadi;
    @Column(name = "HANNEADI")
    private String hanneadi;
    @Column(name = "HDTARIH")
    private String hdtarih;
    @Column(name = "HDYER")
    private String hdyer;
    @Column(name = "HCINSIYET")
    private String hcinsiyet;
    @Column(name = "HBOY")
    private Integer hboy;
    @Column(name = "HKILO")
    private Integer hkilo;
    @Column(name = "HKAYTARIH")
    private String hkaytarih;
    @Column(name = "HADRES")
    private String hadres;
    @Column(name = "HEVTEL")
    private String hevtel;
    @Column(name = "HCEPTEL")
    private String hceptel;
    @Column(name = "HISTEL")
    private String histel;
    @Column(name = "HMAIL")
    private String hmail;
    @Basic(optional = false)
    @Column(name = "HSOSGUV")
    private String hsosguv;
    @Column(name = "HKANGRUBU")
    private String hkangrubu;
    @Column(name = "HSIGARA")
    private String hsigara;
    @Column(name = "HALKOL")
    private String halkol;
    @Column(name = "HKULILAC")
    private String hkulilac;
    @Column(name = "HGECHASTALIK")
    private String hgechastalik;
    @Column(name = "HAILEHAS")
    private String hailehas;
    @Column(name = "HGECMISAMEL")
    private String hgecmisamel;

    public Hkayit() {
    }

    public Hkayit(Integer hastano) {
        this.hastano = hastano;
    }

    public Hkayit(Integer hastano, String htcno, String hadsoyad, String hsosguv) {
        this.hastano = hastano;
        this.htcno = htcno;
        this.hadsoyad = hadsoyad;
        this.hsosguv = hsosguv;
    }

    public Integer getHastano() {
        return hastano;
    }

    public void setHastano(Integer hastano) {
        this.hastano = hastano;
    }

    public String getHtcno() {
        return htcno;
    }

    public void setHtcno(String htcno) {
        this.htcno = htcno;
    }

    public String getHadsoyad() {
        return hadsoyad;
    }

    public void setHadsoyad(String hadsoyad) {
        this.hadsoyad = hadsoyad;
    }

    public String getHbabaadi() {
        return hbabaadi;
    }

    public void setHbabaadi(String hbabaadi) {
        this.hbabaadi = hbabaadi;
    }

    public String getHanneadi() {
        return hanneadi;
    }

    public void setHanneadi(String hanneadi) {
        this.hanneadi = hanneadi;
    }

    public String getHdtarih() {
        return hdtarih;
    }

    public void setHdtarih(String hdtarih) {
        this.hdtarih = hdtarih;
    }

    public String getHdyer() {
        return hdyer;
    }

    public void setHdyer(String hdyer) {
        this.hdyer = hdyer;
    }

    public String getHcinsiyet() {
        return hcinsiyet;
    }

    public void setHcinsiyet(String hcinsiyet) {
        this.hcinsiyet = hcinsiyet;
    }

    public Integer getHboy() {
        return hboy;
    }

    public void setHboy(Integer hboy) {
        this.hboy = hboy;
    }

    public Integer getHkilo() {
        return hkilo;
    }

    public void setHkilo(Integer hkilo) {
        this.hkilo = hkilo;
    }

    public String getHkaytarih() {
        return hkaytarih;
    }

    public void setHkaytarih(String hkaytarih) {
        this.hkaytarih = hkaytarih;
    }

    public String getHadres() {
        return hadres;
    }

    public void setHadres(String hadres) {
        this.hadres = hadres;
    }

    public String getHevtel() {
        return hevtel;
    }

    public void setHevtel(String hevtel) {
        this.hevtel = hevtel;
    }

    public String getHceptel() {
        return hceptel;
    }

    public void setHceptel(String hceptel) {
        this.hceptel = hceptel;
    }

    public String getHistel() {
        return histel;
    }

    public void setHistel(String histel) {
        this.histel = histel;
    }

    public String getHmail() {
        return hmail;
    }

    public void setHmail(String hmail) {
        this.hmail = hmail;
    }

    public String getHsosguv() {
        return hsosguv;
    }

    public void setHsosguv(String hsosguv) {
        this.hsosguv = hsosguv;
    }

    public String getHkangrubu() {
        return hkangrubu;
    }

    public void setHkangrubu(String hkangrubu) {
        this.hkangrubu = hkangrubu;
    }

    public String getHsigara() {
        return hsigara;
    }

    public void setHsigara(String hsigara) {
        this.hsigara = hsigara;
    }

    public String getHalkol() {
        return halkol;
    }

    public void setHalkol(String halkol) {
        this.halkol = halkol;
    }

    public String getHkulilac() {
        return hkulilac;
    }

    public void setHkulilac(String hkulilac) {
        this.hkulilac = hkulilac;
    }

    public String getHgechastalik() {
        return hgechastalik;
    }

    public void setHgechastalik(String hgechastalik) {
        this.hgechastalik = hgechastalik;
    }

    public String getHailehas() {
        return hailehas;
    }

    public void setHailehas(String hailehas) {
        this.hailehas = hailehas;
    }

    public String getHgecmisamel() {
        return hgecmisamel;
    }

    public void setHgecmisamel(String hgecmisamel) {
        this.hgecmisamel = hgecmisamel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hastano != null ? hastano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hkayit)) {
            return false;
        }
        Hkayit other = (Hkayit) object;
        if ((this.hastano == null && other.hastano != null) || (this.hastano != null && !this.hastano.equals(other.hastano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Hkayit[ hastano=" + hastano + " ]";
    }
    
}
