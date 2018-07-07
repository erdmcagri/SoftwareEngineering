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
@Table(name = "RECETE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recete.findAll", query = "SELECT r FROM Recete r"),
    @NamedQuery(name = "Recete.findByReceteid", query = "SELECT r FROM Recete r WHERE r.receteid = :receteid"),
    @NamedQuery(name = "Recete.findByReadsoyad", query = "SELECT r FROM Recete r WHERE r.readsoyad = :readsoyad"),
    @NamedQuery(name = "Recete.findByRetcno", query = "SELECT r FROM Recete r WHERE r.retcno = :retcno"),
    @NamedQuery(name = "Recete.findByRetani", query = "SELECT r FROM Recete r WHERE r.retani = :retani"),
    @NamedQuery(name = "Recete.findByRetarih", query = "SELECT r FROM Recete r WHERE r.retarih = :retarih"),
    @NamedQuery(name = "Recete.findByRedradsoyad", query = "SELECT r FROM Recete r WHERE r.redradsoyad = :redradsoyad"),
    @NamedQuery(name = "Recete.findByReilac", query = "SELECT r FROM Recete r WHERE r.reilac = :reilac")})
public class Recete implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RECETEID")
    private Integer receteid;
    @Basic(optional = false)
    @Column(name = "READSOYAD")
    private String readsoyad;
    @Basic(optional = false)
    @Column(name = "RETCNO")
    private String retcno;
    @Column(name = "RETANI")
    private String retani;
    @Column(name = "RETARIH")
    private String retarih;
    @Column(name = "REDRADSOYAD")
    private String redradsoyad;
    @Column(name = "REILAC")
    private String reilac;

    public Recete() {
    }

    public Recete(Integer receteid) {
        this.receteid = receteid;
    }

    public Recete(Integer receteid, String readsoyad, String retcno) {
        this.receteid = receteid;
        this.readsoyad = readsoyad;
        this.retcno = retcno;
    }

    public Integer getReceteid() {
        return receteid;
    }

    public void setReceteid(Integer receteid) {
        this.receteid = receteid;
    }

    public String getReadsoyad() {
        return readsoyad;
    }

    public void setReadsoyad(String readsoyad) {
        this.readsoyad = readsoyad;
    }

    public String getRetcno() {
        return retcno;
    }

    public void setRetcno(String retcno) {
        this.retcno = retcno;
    }

    public String getRetani() {
        return retani;
    }

    public void setRetani(String retani) {
        this.retani = retani;
    }

    public String getRetarih() {
        return retarih;
    }

    public void setRetarih(String retarih) {
        this.retarih = retarih;
    }

    public String getRedradsoyad() {
        return redradsoyad;
    }

    public void setRedradsoyad(String redradsoyad) {
        this.redradsoyad = redradsoyad;
    }

    public String getReilac() {
        return reilac;
    }

    public void setReilac(String reilac) {
        this.reilac = reilac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (receteid != null ? receteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recete)) {
            return false;
        }
        Recete other = (Recete) object;
        if ((this.receteid == null && other.receteid != null) || (this.receteid != null && !this.receteid.equals(other.receteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Recete[ receteid=" + receteid + " ]";
    }
    
}
