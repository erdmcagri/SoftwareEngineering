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
@Table(name = "SEVK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sevk.findAll", query = "SELECT s FROM Sevk s"),
    @NamedQuery(name = "Sevk.findBySevkid", query = "SELECT s FROM Sevk s WHERE s.sevkid = :sevkid"),
    @NamedQuery(name = "Sevk.findBySadsoyad", query = "SELECT s FROM Sevk s WHERE s.sadsoyad = :sadsoyad"),
    @NamedQuery(name = "Sevk.findByStcno", query = "SELECT s FROM Sevk s WHERE s.stcno = :stcno"),
    @NamedQuery(name = "Sevk.findBySdtarih", query = "SELECT s FROM Sevk s WHERE s.sdtarih = :sdtarih"),
    @NamedQuery(name = "Sevk.findBySdyer", query = "SELECT s FROM Sevk s WHERE s.sdyer = :sdyer"),
    @NamedQuery(name = "Sevk.findBySevktarihi", query = "SELECT s FROM Sevk s WHERE s.sevktarihi = :sevktarihi"),
    @NamedQuery(name = "Sevk.findBySevkedenkurum", query = "SELECT s FROM Sevk s WHERE s.sevkedenkurum = :sevkedenkurum"),
    @NamedQuery(name = "Sevk.findBySevkedendr", query = "SELECT s FROM Sevk s WHERE s.sevkedendr = :sevkedendr"),
    @NamedQuery(name = "Sevk.findBySevkedilenkur", query = "SELECT s FROM Sevk s WHERE s.sevkedilenkur = :sevkedilenkur"),
    @NamedQuery(name = "Sevk.findBySneden", query = "SELECT s FROM Sevk s WHERE s.sneden = :sneden")})
public class Sevk implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SEVKID")
    private Integer sevkid;
    @Basic(optional = false)
    @Column(name = "SADSOYAD")
    private String sadsoyad;
    @Basic(optional = false)
    @Column(name = "STCNO")
    private String stcno;
    @Column(name = "SDTARIH")
    private String sdtarih;
    @Column(name = "SDYER")
    private String sdyer;
    @Basic(optional = false)
    @Column(name = "SEVKTARIHI")
    private String sevktarihi;
    @Basic(optional = false)
    @Column(name = "SEVKEDENKURUM")
    private String sevkedenkurum;
    @Basic(optional = false)
    @Column(name = "SEVKEDENDR")
    private String sevkedendr;
    @Basic(optional = false)
    @Column(name = "SEVKEDILENKUR")
    private String sevkedilenkur;
    @Column(name = "SNEDEN")
    private String sneden;

    public Sevk() {
    }

    public Sevk(Integer sevkid) {
        this.sevkid = sevkid;
    }

    public Sevk(Integer sevkid, String sadsoyad, String stcno, String sevktarihi, String sevkedenkurum, String sevkedendr, String sevkedilenkur) {
        this.sevkid = sevkid;
        this.sadsoyad = sadsoyad;
        this.stcno = stcno;
        this.sevktarihi = sevktarihi;
        this.sevkedenkurum = sevkedenkurum;
        this.sevkedendr = sevkedendr;
        this.sevkedilenkur = sevkedilenkur;
    }

    public Integer getSevkid() {
        return sevkid;
    }

    public void setSevkid(Integer sevkid) {
        this.sevkid = sevkid;
    }

    public String getSadsoyad() {
        return sadsoyad;
    }

    public void setSadsoyad(String sadsoyad) {
        this.sadsoyad = sadsoyad;
    }

    public String getStcno() {
        return stcno;
    }

    public void setStcno(String stcno) {
        this.stcno = stcno;
    }

    public String getSdtarih() {
        return sdtarih;
    }

    public void setSdtarih(String sdtarih) {
        this.sdtarih = sdtarih;
    }

    public String getSdyer() {
        return sdyer;
    }

    public void setSdyer(String sdyer) {
        this.sdyer = sdyer;
    }

    public String getSevktarihi() {
        return sevktarihi;
    }

    public void setSevktarihi(String sevktarihi) {
        this.sevktarihi = sevktarihi;
    }

    public String getSevkedenkurum() {
        return sevkedenkurum;
    }

    public void setSevkedenkurum(String sevkedenkurum) {
        this.sevkedenkurum = sevkedenkurum;
    }

    public String getSevkedendr() {
        return sevkedendr;
    }

    public void setSevkedendr(String sevkedendr) {
        this.sevkedendr = sevkedendr;
    }

    public String getSevkedilenkur() {
        return sevkedilenkur;
    }

    public void setSevkedilenkur(String sevkedilenkur) {
        this.sevkedilenkur = sevkedilenkur;
    }

    public String getSneden() {
        return sneden;
    }

    public void setSneden(String sneden) {
        this.sneden = sneden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sevkid != null ? sevkid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sevk)) {
            return false;
        }
        Sevk other = (Sevk) object;
        if ((this.sevkid == null && other.sevkid != null) || (this.sevkid != null && !this.sevkid.equals(other.sevkid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yaz\u0131l\u0131mm\u00fchendisli\u011fi.Sevk[ sevkid=" + sevkid + " ]";
    }
    
}
