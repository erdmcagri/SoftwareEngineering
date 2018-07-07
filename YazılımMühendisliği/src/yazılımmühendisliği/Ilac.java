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
@Table(name = "ILAC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ilac.findAll", query = "SELECT \u0131 FROM Ilac \u0131"),
    @NamedQuery(name = "Ilac.findByIlacid", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.ilacid = :ilacid"),
    @NamedQuery(name = "Ilac.findByReceteid", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.receteid = :receteid"),
    @NamedQuery(name = "Ilac.findByIlacadi", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.ilacadi = :ilacadi"),
    @NamedQuery(name = "Ilac.findByIlacadet", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.ilacadet = :ilacadet"),
    @NamedQuery(name = "Ilac.findByKulsekli", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.kulsekli = :kulsekli")})
public class Ilac implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ILACID")
    private Integer ilacid;
    @Basic(optional = false)
    @Column(name = "RECETEID")
    private int receteid;
    @Basic(optional = false)
    @Column(name = "ILACADI")
    private String ilacadi;
    @Basic(optional = false)
    @Column(name = "ILACADET")
    private int ilacadet;
    @Basic(optional = false)
    @Column(name = "KULSEKLI")
    private String kulsekli;

    public Ilac() {
    }

    public Ilac(Integer ilacid) {
        this.ilacid = ilacid;
    }

    public Ilac(Integer ilacid, int receteid, String ilacadi, int ilacadet, String kulsekli) {
        this.ilacid = ilacid;
        this.receteid = receteid;
        this.ilacadi = ilacadi;
        this.ilacadet = ilacadet;
        this.kulsekli = kulsekli;
    }

    public Integer getIlacid() {
        return ilacid;
    }

    public void setIlacid(Integer ilacid) {
        this.ilacid = ilacid;
    }

    public int getReceteid() {
        return receteid;
    }

    public void setReceteid(int receteid) {
        this.receteid = receteid;
    }

    public String getIlacadi() {
        return ilacadi;
    }

    public void setIlacadi(String ilacadi) {
        this.ilacadi = ilacadi;
    }

    public int getIlacadet() {
        return ilacadet;
    }

    public void setIlacadet(int ilacadet) {
        this.ilacadet = ilacadet;
    }

    public String getKulsekli() {
        return kulsekli;
    }

    public void setKulsekli(String kulsekli) {
        this.kulsekli = kulsekli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ilacid != null ? ilacid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ilac)) {
            return false;
        }
        Ilac other = (Ilac) object;
        if ((this.ilacid == null && other.ilacid != null) || (this.ilacid != null && !this.ilacid.equals(other.ilacid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Ilac[ ilacid=" + ilacid + " ]";
    }
    
}
