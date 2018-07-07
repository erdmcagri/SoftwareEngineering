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
@Table(name = "KLINIKDR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klinikdr.findAll", query = "SELECT k FROM Klinikdr k"),
    @NamedQuery(name = "Klinikdr.findByKdrid", query = "SELECT k FROM Klinikdr k WHERE k.kdrid = :kdrid"),
    @NamedQuery(name = "Klinikdr.findByKdrdradsoyad", query = "SELECT k FROM Klinikdr k WHERE k.kdrdradsoyad = :kdrdradsoyad"),
    @NamedQuery(name = "Klinikdr.findByKdrklinik", query = "SELECT k FROM Klinikdr k WHERE k.kdrklinik = :kdrklinik")})
public class Klinikdr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KDRID")
    private Integer kdrid;
    @Basic(optional = false)
    @Column(name = "KDRDRADSOYAD")
    private String kdrdradsoyad;
    @Basic(optional = false)
    @Column(name = "KDRKLINIK")
    private String kdrklinik;

    public Klinikdr() {
    }

    public Klinikdr(Integer kdrid) {
        this.kdrid = kdrid;
    }

    public Klinikdr(Integer kdrid, String kdrdradsoyad, String kdrklinik) {
        this.kdrid = kdrid;
        this.kdrdradsoyad = kdrdradsoyad;
        this.kdrklinik = kdrklinik;
    }

    public Integer getKdrid() {
        return kdrid;
    }

    public void setKdrid(Integer kdrid) {
        this.kdrid = kdrid;
    }

    public String getKdrdradsoyad() {
        return kdrdradsoyad;
    }

    public void setKdrdradsoyad(String kdrdradsoyad) {
        this.kdrdradsoyad = kdrdradsoyad;
    }

    public String getKdrklinik() {
        return kdrklinik;
    }

    public void setKdrklinik(String kdrklinik) {
        this.kdrklinik = kdrklinik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdrid != null ? kdrid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Klinikdr)) {
            return false;
        }
        Klinikdr other = (Klinikdr) object;
        if ((this.kdrid == null && other.kdrid != null) || (this.kdrid != null && !this.kdrid.equals(other.kdrid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Klinikdr[ kdrid=" + kdrid + " ]";
    }
    
}
