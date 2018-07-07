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
@Table(name = "PBILGI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pbilgi.findAll", query = "SELECT p FROM Pbilgi p"),
    @NamedQuery(name = "Pbilgi.findByPid", query = "SELECT p FROM Pbilgi p WHERE p.pid = :pid"),
    @NamedQuery(name = "Pbilgi.findByPtcno", query = "SELECT p FROM Pbilgi p WHERE p.ptcno = :ptcno"),
    @NamedQuery(name = "Pbilgi.findByPadsoyad", query = "SELECT p FROM Pbilgi p WHERE p.padsoyad = :padsoyad"),
    @NamedQuery(name = "Pbilgi.findByPdtarih", query = "SELECT p FROM Pbilgi p WHERE p.pdtarih = :pdtarih"),
    @NamedQuery(name = "Pbilgi.findByPevtel", query = "SELECT p FROM Pbilgi p WHERE p.pevtel = :pevtel"),
    @NamedQuery(name = "Pbilgi.findByPceptel", query = "SELECT p FROM Pbilgi p WHERE p.pceptel = :pceptel"),
    @NamedQuery(name = "Pbilgi.findByPmail", query = "SELECT p FROM Pbilgi p WHERE p.pmail = :pmail"),
    @NamedQuery(name = "Pbilgi.findByPadres", query = "SELECT p FROM Pbilgi p WHERE p.padres = :padres"),
    @NamedQuery(name = "Pbilgi.findByPunvan", query = "SELECT p FROM Pbilgi p WHERE p.punvan = :punvan"),
    @NamedQuery(name = "Pbilgi.findByPbrans", query = "SELECT p FROM Pbilgi p WHERE p.pbrans = :pbrans"),
    @NamedQuery(name = "Pbilgi.findByPyetki", query = "SELECT p FROM Pbilgi p WHERE p.pyetki = :pyetki"),
    @NamedQuery(name = "Pbilgi.findByPsifre", query = "SELECT p FROM Pbilgi p WHERE p.psifre = :psifre")})
public class Pbilgi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PID")
    private Integer pid;
    @Column(name = "PTCNO")
    private String ptcno;
    @Column(name = "PADSOYAD")
    private String padsoyad;
    @Column(name = "PDTARIH")
    private String pdtarih;
    @Column(name = "PEVTEL")
    private String pevtel;
    @Column(name = "PCEPTEL")
    private String pceptel;
    @Column(name = "PMAIL")
    private String pmail;
    @Column(name = "PADRES")
    private String padres;
    @Column(name = "PUNVAN")
    private String punvan;
    @Column(name = "PBRANS")
    private String pbrans;
    @Column(name = "PYETKI")
    private Integer pyetki;
    @Column(name = "PSIFRE")
    private String psifre;

    public Pbilgi() {
    }

    public Pbilgi(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPtcno() {
        return ptcno;
    }

    public void setPtcno(String ptcno) {
        this.ptcno = ptcno;
    }

    public String getPadsoyad() {
        return padsoyad;
    }

    public void setPadsoyad(String padsoyad) {
        this.padsoyad = padsoyad;
    }

    public String getPdtarih() {
        return pdtarih;
    }

    public void setPdtarih(String pdtarih) {
        this.pdtarih = pdtarih;
    }

    public String getPevtel() {
        return pevtel;
    }

    public void setPevtel(String pevtel) {
        this.pevtel = pevtel;
    }

    public String getPceptel() {
        return pceptel;
    }

    public void setPceptel(String pceptel) {
        this.pceptel = pceptel;
    }

    public String getPmail() {
        return pmail;
    }

    public void setPmail(String pmail) {
        this.pmail = pmail;
    }

    public String getPadres() {
        return padres;
    }

    public void setPadres(String padres) {
        this.padres = padres;
    }

    public String getPunvan() {
        return punvan;
    }

    public void setPunvan(String punvan) {
        this.punvan = punvan;
    }

    public String getPbrans() {
        return pbrans;
    }

    public void setPbrans(String pbrans) {
        this.pbrans = pbrans;
    }

    public Integer getPyetki() {
        return pyetki;
    }

    public void setPyetki(Integer pyetki) {
        this.pyetki = pyetki;
    }

    public String getPsifre() {
        return psifre;
    }

    public void setPsifre(String psifre) {
        this.psifre = psifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pbilgi)) {
            return false;
        }
        Pbilgi other = (Pbilgi) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Pbilgi[ pid=" + pid + " ]";
    }
    
}
