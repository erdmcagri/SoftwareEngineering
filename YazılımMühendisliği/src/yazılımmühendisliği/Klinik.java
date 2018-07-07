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
@Table(name = "KLINIK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klinik.findAll", query = "SELECT k FROM Klinik k"),
    @NamedQuery(name = "Klinik.findByKid", query = "SELECT k FROM Klinik k WHERE k.kid = :kid"),
    @NamedQuery(name = "Klinik.findByKadi", query = "SELECT k FROM Klinik k WHERE k.kadi = :kadi")})
public class Klinik implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KID")
    private Integer kid;
    @Basic(optional = false)
    @Column(name = "KADI")
    private String kadi;

    public Klinik() {
    }

    public Klinik(Integer kid) {
        this.kid = kid;
    }

    public Klinik(Integer kid, String kadi) {
        this.kid = kid;
        this.kadi = kadi;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKadi() {
        return kadi;
    }

    public void setKadi(String kadi) {
        this.kadi = kadi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kid != null ? kid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Klinik)) {
            return false;
        }
        Klinik other = (Klinik) object;
        if ((this.kid == null && other.kid != null) || (this.kid != null && !this.kid.equals(other.kid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Klinik[ kid=" + kid + " ]";
    }
    
}
