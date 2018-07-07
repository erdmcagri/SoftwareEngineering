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
@Table(name = "RAPOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rapor.findAll", query = "SELECT r FROM Rapor r"),
    @NamedQuery(name = "Rapor.findByRaporid", query = "SELECT r FROM Rapor r WHERE r.raporid = :raporid"),
    @NamedQuery(name = "Rapor.findByRaportarih", query = "SELECT r FROM Rapor r WHERE r.raportarih = :raportarih"),
    @NamedQuery(name = "Rapor.findByRvdoktor", query = "SELECT r FROM Rapor r WHERE r.rvdoktor = :rvdoktor"),
    @NamedQuery(name = "Rapor.findByRadsoyad", query = "SELECT r FROM Rapor r WHERE r.radsoyad = :radsoyad"),
    @NamedQuery(name = "Rapor.findByRtcno", query = "SELECT r FROM Rapor r WHERE r.rtcno = :rtcno"),
    @NamedQuery(name = "Rapor.findByRbabaadi", query = "SELECT r FROM Rapor r WHERE r.rbabaadi = :rbabaadi"),
    @NamedQuery(name = "Rapor.findByRdtarih", query = "SELECT r FROM Rapor r WHERE r.rdtarih = :rdtarih"),
    @NamedQuery(name = "Rapor.findByRdyer", query = "SELECT r FROM Rapor r WHERE r.rdyer = :rdyer"),
    @NamedQuery(name = "Rapor.findByRistekneden", query = "SELECT r FROM Rapor r WHERE r.ristekneden = :ristekneden"),
    @NamedQuery(name = "Rapor.findByRaciklama", query = "SELECT r FROM Rapor r WHERE r.raciklama = :raciklama")})
public class Rapor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RAPORID")
    private Integer raporid;
    @Basic(optional = false)
    @Column(name = "RAPORTARIH")
    private String raportarih;
    @Basic(optional = false)
    @Column(name = "RVDOKTOR")
    private String rvdoktor;
    @Basic(optional = false)
    @Column(name = "RADSOYAD")
    private String radsoyad;
    @Basic(optional = false)
    @Column(name = "RTCNO")
    private String rtcno;
    @Column(name = "RBABAADI")
    private String rbabaadi;
    @Column(name = "RDTARIH")
    private String rdtarih;
    @Column(name = "RDYER")
    private String rdyer;
    @Basic(optional = false)
    @Column(name = "RISTEKNEDEN")
    private String ristekneden;
    @Column(name = "RACIKLAMA")
    private String raciklama;

    public Rapor() {
    }

    public Rapor(Integer raporid) {
        this.raporid = raporid;
    }

    public Rapor(Integer raporid, String raportarih, String rvdoktor, String radsoyad, String rtcno, String ristekneden) {
        this.raporid = raporid;
        this.raportarih = raportarih;
        this.rvdoktor = rvdoktor;
        this.radsoyad = radsoyad;
        this.rtcno = rtcno;
        this.ristekneden = ristekneden;
    }

    public Integer getRaporid() {
        return raporid;
    }

    public void setRaporid(Integer raporid) {
        this.raporid = raporid;
    }

    public String getRaportarih() {
        return raportarih;
    }

    public void setRaportarih(String raportarih) {
        this.raportarih = raportarih;
    }

    public String getRvdoktor() {
        return rvdoktor;
    }

    public void setRvdoktor(String rvdoktor) {
        this.rvdoktor = rvdoktor;
    }

    public String getRadsoyad() {
        return radsoyad;
    }

    public void setRadsoyad(String radsoyad) {
        this.radsoyad = radsoyad;
    }

    public String getRtcno() {
        return rtcno;
    }

    public void setRtcno(String rtcno) {
        this.rtcno = rtcno;
    }

    public String getRbabaadi() {
        return rbabaadi;
    }

    public void setRbabaadi(String rbabaadi) {
        this.rbabaadi = rbabaadi;
    }

    public String getRdtarih() {
        return rdtarih;
    }

    public void setRdtarih(String rdtarih) {
        this.rdtarih = rdtarih;
    }

    public String getRdyer() {
        return rdyer;
    }

    public void setRdyer(String rdyer) {
        this.rdyer = rdyer;
    }

    public String getRistekneden() {
        return ristekneden;
    }

    public void setRistekneden(String ristekneden) {
        this.ristekneden = ristekneden;
    }

    public String getRaciklama() {
        return raciklama;
    }

    public void setRaciklama(String raciklama) {
        this.raciklama = raciklama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (raporid != null ? raporid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rapor)) {
            return false;
        }
        Rapor other = (Rapor) object;
        if ((this.raporid == null && other.raporid != null) || (this.raporid != null && !this.raporid.equals(other.raporid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Rapor[ raporid=" + raporid + " ]";
    }
    
}
