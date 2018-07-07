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
@Table(name = "DRCALSAAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drcalsaat.findAll", query = "SELECT d FROM Drcalsaat d"),
    @NamedQuery(name = "Drcalsaat.findByDrranid", query = "SELECT d FROM Drcalsaat d WHERE d.drranid = :drranid"),
    @NamedQuery(name = "Drcalsaat.findByDrklinik", query = "SELECT d FROM Drcalsaat d WHERE d.drklinik = :drklinik"),
    @NamedQuery(name = "Drcalsaat.findByDrdoktor", query = "SELECT d FROM Drcalsaat d WHERE d.drdoktor = :drdoktor"),
    @NamedQuery(name = "Drcalsaat.findByDrbasbitsaat", query = "SELECT d FROM Drcalsaat d WHERE d.drbasbitsaat = :drbasbitsaat"),
    @NamedQuery(name = "Drcalsaat.findByDrreztarih", query = "SELECT d FROM Drcalsaat d WHERE d.drreztarih = :drreztarih"),
    @NamedQuery(name = "Drcalsaat.findByDrhadsoyad", query = "SELECT d FROM Drcalsaat d WHERE d.drhadsoyad = :drhadsoyad"),
    @NamedQuery(name = "Drcalsaat.findByDrcaldurum", query = "SELECT d FROM Drcalsaat d WHERE d.drcaldurum = :drcaldurum")})
public class Drcalsaat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DRRANID")
    private Integer drranid;
    @Column(name = "DRKLINIK")
    private String drklinik;
    @Column(name = "DRDOKTOR")
    private String drdoktor;
    @Column(name = "DRBASBITSAAT")
    private String drbasbitsaat;
    @Column(name = "DRREZTARIH")
    private String drreztarih;
    @Column(name = "DRHADSOYAD")
    private String drhadsoyad;
    @Column(name = "DRCALDURUM")
    private String drcaldurum;

    public Drcalsaat() {
    }

    public Drcalsaat(Integer drranid) {
        this.drranid = drranid;
    }

    public Integer getDrranid() {
        return drranid;
    }

    public void setDrranid(Integer drranid) {
        this.drranid = drranid;
    }

    public String getDrklinik() {
        return drklinik;
    }

    public void setDrklinik(String drklinik) {
        this.drklinik = drklinik;
    }

    public String getDrdoktor() {
        return drdoktor;
    }

    public void setDrdoktor(String drdoktor) {
        this.drdoktor = drdoktor;
    }

    public String getDrbasbitsaat() {
        return drbasbitsaat;
    }

    public void setDrbasbitsaat(String drbasbitsaat) {
        this.drbasbitsaat = drbasbitsaat;
    }

    public String getDrreztarih() {
        return drreztarih;
    }

    public void setDrreztarih(String drreztarih) {
        this.drreztarih = drreztarih;
    }

    public String getDrhadsoyad() {
        return drhadsoyad;
    }

    public void setDrhadsoyad(String drhadsoyad) {
        this.drhadsoyad = drhadsoyad;
    }

    public String getDrcaldurum() {
        return drcaldurum;
    }

    public void setDrcaldurum(String drcaldurum) {
        this.drcaldurum = drcaldurum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drranid != null ? drranid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drcalsaat)) {
            return false;
        }
        Drcalsaat other = (Drcalsaat) object;
        if ((this.drranid == null && other.drranid != null) || (this.drranid != null && !this.drranid.equals(other.drranid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Drcalsaat[ drranid=" + drranid + " ]";
    }
    
}
