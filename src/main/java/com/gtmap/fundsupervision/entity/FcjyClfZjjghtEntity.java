package com.gtmap.fundsupervision.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description
 */
@Entity
@Table(name = "FCJY_CLF_ZJJGHT", schema = "SCOTT")
public class FcjyClfZjjghtEntity implements Serializable {
    private String jgid;
    private Long htbh;
    private String hbh;
    private String fwzl;
    private double fwmj;
    private String fwsyqzh;
    private String cqrxm;
    private String cqrdh;
    private double htje;
    private String hbzl;
    private String jjjgbh;
    private String jjjgmc;
    private String lybz;
    private String txzh;
    private String txqlr;
    private String bz;

    @Id
    @Column(name = "JGID")
    public String getJgid() {
        return jgid;
    }

    public void setJgid(String jgid) {
        this.jgid = jgid;
    }

    @Basic
    @Column(name = "HTBH")
    public Long getHtbh() {
        return htbh;
    }

    public void setHtbh(Long htbh) {
        this.htbh = htbh;
    }

    @Basic
    @Column(name = "HBH")
    public String getHbh() {
        return hbh;
    }

    public void setHbh(String hbh) {
        this.hbh = hbh;
    }

    @Basic
    @Column(name = "FWZL")
    public String getFwzl() {
        return fwzl;
    }

    public void setFwzl(String fwzl) {
        this.fwzl = fwzl;
    }

    @Basic
    @Column(name = "FWMJ")
    public double getFwmj() {
        return fwmj;
    }

    public void setFwmj(double fwmj) {
        this.fwmj = fwmj;
    }

    @Basic
    @Column(name = "FWSYQZH")
    public String getFwsyqzh() {
        return fwsyqzh;
    }

    public void setFwsyqzh(String fwsyqzh) {
        this.fwsyqzh = fwsyqzh;
    }

    @Basic
    @Column(name = "CQRXM")
    public String getCqrxm() {
        return cqrxm;
    }

    public void setCqrxm(String cqrxm) {
        this.cqrxm = cqrxm;
    }

    @Basic
    @Column(name = "CQRDH")
    public String getCqrdh() {
        return cqrdh;
    }

    public void setCqrdh(String cqrdh) {
        this.cqrdh = cqrdh;
    }

    @Basic
    @Column(name = "HTJE")
    public double getHtje() {
        return htje;
    }

    public void setHtje(double htje) {
        this.htje = htje;
    }

    @Basic
    @Column(name = "HBZL")
    public String getHbzl() {
        return hbzl;
    }

    public void setHbzl(String hbzl) {
        this.hbzl = hbzl;
    }

    @Basic
    @Column(name = "JJJGBH")
    public String getJjjgbh() {
        return jjjgbh;
    }

    public void setJjjgbh(String jjjgbh) {
        this.jjjgbh = jjjgbh;
    }

    @Basic
    @Column(name = "JJJGMC")
    public String getJjjgmc() {
        return jjjgmc;
    }

    public void setJjjgmc(String jjjgmc) {
        this.jjjgmc = jjjgmc;
    }

    @Basic
    @Column(name = "LYBZ")
    public String getLybz() {
        return lybz;
    }

    public void setLybz(String lybz) {
        this.lybz = lybz;
    }

    @Basic
    @Column(name = "TXZH")
    public String getTxzh() {
        return txzh;
    }

    public void setTxzh(String txzh) {
        this.txzh = txzh;
    }

    @Basic
    @Column(name = "TXQLR")
    public String getTxqlr() {
        return txqlr;
    }

    public void setTxqlr(String txqlr) {
        this.txqlr = txqlr;
    }

    @Basic
    @Column(name = "BZ")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfZjjghtEntity that = (FcjyClfZjjghtEntity) o;
        return Objects.equals(jgid, that.jgid) &&
                Objects.equals(htbh, that.htbh) &&
                Objects.equals(hbh, that.hbh) &&
                Objects.equals(fwzl, that.fwzl) &&
                Objects.equals(fwmj, that.fwmj) &&
                Objects.equals(fwsyqzh, that.fwsyqzh) &&
                Objects.equals(cqrxm, that.cqrxm) &&
                Objects.equals(cqrdh, that.cqrdh) &&
                Objects.equals(htje, that.htje) &&
                Objects.equals(hbzl, that.hbzl) &&
                Objects.equals(jjjgbh, that.jjjgbh) &&
                Objects.equals(jjjgmc, that.jjjgmc) &&
                Objects.equals(lybz, that.lybz) &&
                Objects.equals(txzh, that.txzh) &&
                Objects.equals(txqlr, that.txqlr) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jgid, htbh, hbh, fwzl, fwmj, fwsyqzh, cqrxm, cqrdh, htje, hbzl, jjjgbh, jjjgmc, lybz, txzh, txqlr, bz);
    }
}
