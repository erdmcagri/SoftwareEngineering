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
@Table(name = "KGIRIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kgiris.findAll", query = "SELECT k FROM Kgiris k"),
    @NamedQuery(name = "Kgiris.findByKid", query = "SELECT k FROM Kgiris k WHERE k.kid = :kid"),
    @NamedQuery(name = "Kgiris.findByKsifre", query = "SELECT k FROM Kgiris k WHERE k.ksifre = :ksifre"),
    @NamedQuery(name = "Kgiris.findByKunvan", query = "SELECT k FROM Kgiris k WHERE k.kunvan = :kunvan")})
public class Kgiris implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KID")
    private Integer kid;
    @Column(name = "KSIFRE")
    private String ksifre;
    @Column(name = "KUNVAN")
    private String kunvan;

    public Kgiris() {
    }

    public Kgiris(Integer kid) {
        this.kid = kid;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKsifre() {
        return ksifre;
    }

    public void setKsifre(String ksifre) {
        this.ksifre = ksifre;
    }

    public String getKunvan() {
        return kunvan;
    }

    public void setKunvan(String kunvan) {
        this.kunvan = kunvan;
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
        if (!(object instanceof Kgiris)) {
            return false;
        }
        Kgiris other = (Kgiris) object;
        if ((this.kid == null && other.kid != null) || (this.kid != null && !this.kid.equals(other.kid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Kgiris[ kid=" + kid + " ]";
    }
    
}
