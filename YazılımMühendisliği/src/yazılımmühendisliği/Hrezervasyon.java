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
@Table(name = "HREZERVASYON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hrezervasyon.findAll", query = "SELECT h FROM Hrezervasyon h"),
    @NamedQuery(name = "Hrezervasyon.findByHrrezno", query = "SELECT h FROM Hrezervasyon h WHERE h.hrrezno = :hrrezno"),
    @NamedQuery(name = "Hrezervasyon.findByHrtcno", query = "SELECT h FROM Hrezervasyon h WHERE h.hrtcno = :hrtcno"),
    @NamedQuery(name = "Hrezervasyon.findByHradsoyad", query = "SELECT h FROM Hrezervasyon h WHERE h.hradsoyad = :hradsoyad"),
    @NamedQuery(name = "Hrezervasyon.findByHrdtarih", query = "SELECT h FROM Hrezervasyon h WHERE h.hrdtarih = :hrdtarih"),
    @NamedQuery(name = "Hrezervasyon.findByHrtelno", query = "SELECT h FROM Hrezervasyon h WHERE h.hrtelno = :hrtelno"),
    @NamedQuery(name = "Hrezervasyon.findByHrkayittarih", query = "SELECT h FROM Hrezervasyon h WHERE h.hrkayittarih = :hrkayittarih"),
    @NamedQuery(name = "Hrezervasyon.findByHreztarih", query = "SELECT h FROM Hrezervasyon h WHERE h.hreztarih = :hreztarih"),
    @NamedQuery(name = "Hrezervasyon.findByHrrezsaat", query = "SELECT h FROM Hrezervasyon h WHERE h.hrrezsaat = :hrrezsaat"),
    @NamedQuery(name = "Hrezervasyon.findByHrdoktor", query = "SELECT h FROM Hrezervasyon h WHERE h.hrdoktor = :hrdoktor"),
    @NamedQuery(name = "Hrezervasyon.findByHrklinik", query = "SELECT h FROM Hrezervasyon h WHERE h.hrklinik = :hrklinik"),
    @NamedQuery(name = "Hrezervasyon.findByHrrezdurum", query = "SELECT h FROM Hrezervasyon h WHERE h.hrrezdurum = :hrrezdurum")})
public class Hrezervasyon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HRREZNO")
    private Integer hrrezno;
    @Basic(optional = false)
    @Column(name = "HRTCNO")
    private String hrtcno;
    @Basic(optional = false)
    @Column(name = "HRADSOYAD")
    private String hradsoyad;
    @Column(name = "HRDTARIH")
    private String hrdtarih;
    @Column(name = "HRTELNO")
    private String hrtelno;
    @Column(name = "HRKAYITTARIH")
    private String hrkayittarih;
    @Basic(optional = false)
    @Column(name = "HREZTARIH")
    private String hreztarih;
    @Basic(optional = false)
    @Column(name = "HRREZSAAT")
    private String hrrezsaat;
    @Basic(optional = false)
    @Column(name = "HRDOKTOR")
    private String hrdoktor;
    @Basic(optional = false)
    @Column(name = "HRKLINIK")
    private String hrklinik;
    @Column(name = "HRREZDURUM")
    private String hrrezdurum;

    public Hrezervasyon() {
    }

    public Hrezervasyon(Integer hrrezno) {
        this.hrrezno = hrrezno;
    }

    public Hrezervasyon(Integer hrrezno, String hrtcno, String hradsoyad, String hreztarih, String hrrezsaat, String hrdoktor, String hrklinik) {
        this.hrrezno = hrrezno;
        this.hrtcno = hrtcno;
        this.hradsoyad = hradsoyad;
        this.hreztarih = hreztarih;
        this.hrrezsaat = hrrezsaat;
        this.hrdoktor = hrdoktor;
        this.hrklinik = hrklinik;
    }

    public Integer getHrrezno() {
        return hrrezno;
    }

    public void setHrrezno(Integer hrrezno) {
        this.hrrezno = hrrezno;
    }

    public String getHrtcno() {
        return hrtcno;
    }

    public void setHrtcno(String hrtcno) {
        this.hrtcno = hrtcno;
    }

    public String getHradsoyad() {
        return hradsoyad;
    }

    public void setHradsoyad(String hradsoyad) {
        this.hradsoyad = hradsoyad;
    }

    public String getHrdtarih() {
        return hrdtarih;
    }

    public void setHrdtarih(String hrdtarih) {
        this.hrdtarih = hrdtarih;
    }

    public String getHrtelno() {
        return hrtelno;
    }

    public void setHrtelno(String hrtelno) {
        this.hrtelno = hrtelno;
    }

    public String getHrkayittarih() {
        return hrkayittarih;
    }

    public void setHrkayittarih(String hrkayittarih) {
        this.hrkayittarih = hrkayittarih;
    }

    public String getHreztarih() {
        return hreztarih;
    }

    public void setHreztarih(String hreztarih) {
        this.hreztarih = hreztarih;
    }

    public String getHrrezsaat() {
        return hrrezsaat;
    }

    public void setHrrezsaat(String hrrezsaat) {
        this.hrrezsaat = hrrezsaat;
    }

    public String getHrdoktor() {
        return hrdoktor;
    }

    public void setHrdoktor(String hrdoktor) {
        this.hrdoktor = hrdoktor;
    }

    public String getHrklinik() {
        return hrklinik;
    }

    public void setHrklinik(String hrklinik) {
        this.hrklinik = hrklinik;
    }

    public String getHrrezdurum() {
        return hrrezdurum;
    }

    public void setHrrezdurum(String hrrezdurum) {
        this.hrrezdurum = hrrezdurum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hrrezno != null ? hrrezno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hrezervasyon)) {
            return false;
        }
        Hrezervasyon other = (Hrezervasyon) object;
        if ((this.hrrezno == null && other.hrrezno != null) || (this.hrrezno != null && !this.hrrezno.equals(other.hrrezno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Hrezervasyon[ hrrezno=" + hrrezno + " ]";
    }
    
}
