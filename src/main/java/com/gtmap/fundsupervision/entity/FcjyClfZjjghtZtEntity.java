package com.gtmap.fundsupervision.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description
 */
@Entity
@Table(name = "FCJY_CLF_ZJJGHT_ZT", schema = "SCOTT")
public class FcjyClfZjjghtZtEntity implements Serializable {
    private String ztid;
    private Long ztbh;
    private String htid;
    private String jgid;
    private String ztlb;
    private String ztxm;
    private String xb;
    private Date csrq;
    private String zjlb;
    private String zjhm;
    private String fzjg;
    private String dz;
    private String lxdh;
    private String yb;
    private String dzyj;
    private String gjdq;
    private String hjszs1;
    private String hjszs2;
    private String jzszs1;
    private String jzszs2;
    private String yh;
    private String hm;
    private String zh;
    private String dlrxm;
    private String dlrzjlb;
    private String dlrzjhm;
    private String dlrdz;
    private String dlrlxdh;
    private String bz;

    @Id
    @Column(name = "ZTID")
    public String getZtid() {
        return ztid;
    }

    public void setZtid(String ztid) {
        this.ztid = ztid;
    }

    @Basic
    @Column(name = "ZTBH")
    public Long getZtbh() {
        return ztbh;
    }

    public void setZtbh(Long ztbh) {
        this.ztbh = ztbh;
    }

    @Basic
    @Column(name = "HTID")
    public String getHtid() {
        return htid;
    }

    public void setHtid(String htid) {
        this.htid = htid;
    }

    @Basic
    @Column(name = "JGID")
    public String getJgid() {
        return jgid;
    }

    public void setJgid(String jgid) {
        this.jgid = jgid;
    }

    @Basic
    @Column(name = "ZTLB")
    public String getZtlb() {
        return ztlb;
    }

    public void setZtlb(String ztlb) {
        this.ztlb = ztlb;
    }

    @Basic
    @Column(name = "ZTXM")
    public String getZtxm() {
        return ztxm;
    }

    public void setZtxm(String ztxm) {
        this.ztxm = ztxm;
    }

    @Basic
    @Column(name = "XB")
    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    @Basic
    @Column(name = "CSRQ")
    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    @Basic
    @Column(name = "ZJLB")
    public String getZjlb() {
        return zjlb;
    }

    public void setZjlb(String zjlb) {
        this.zjlb = zjlb;
    }

    @Basic
    @Column(name = "ZJHM")
    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    @Basic
    @Column(name = "FZJG")
    public String getFzjg() {
        return fzjg;
    }

    public void setFzjg(String fzjg) {
        this.fzjg = fzjg;
    }

    @Basic
    @Column(name = "DZ")
    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    @Basic
    @Column(name = "LXDH")
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "YB")
    public String getYb() {
        return yb;
    }

    public void setYb(String yb) {
        this.yb = yb;
    }

    @Basic
    @Column(name = "DZYJ")
    public String getDzyj() {
        return dzyj;
    }

    public void setDzyj(String dzyj) {
        this.dzyj = dzyj;
    }

    @Basic
    @Column(name = "GJDQ")
    public String getGjdq() {
        return gjdq;
    }

    public void setGjdq(String gjdq) {
        this.gjdq = gjdq;
    }

    @Basic
    @Column(name = "HJSZS1")
    public String getHjszs1() {
        return hjszs1;
    }

    public void setHjszs1(String hjszs1) {
        this.hjszs1 = hjszs1;
    }

    @Basic
    @Column(name = "HJSZS2")
    public String getHjszs2() {
        return hjszs2;
    }

    public void setHjszs2(String hjszs2) {
        this.hjszs2 = hjszs2;
    }

    @Basic
    @Column(name = "JZSZS1")
    public String getJzszs1() {
        return jzszs1;
    }

    public void setJzszs1(String jzszs1) {
        this.jzszs1 = jzszs1;
    }

    @Basic
    @Column(name = "JZSZS2")
    public String getJzszs2() {
        return jzszs2;
    }

    public void setJzszs2(String jzszs2) {
        this.jzszs2 = jzszs2;
    }

    @Basic
    @Column(name = "YH")
    public String getYh() {
        return yh;
    }

    public void setYh(String yh) {
        this.yh = yh;
    }

    @Basic
    @Column(name = "HM")
    public String getHm() {
        return hm;
    }

    public void setHm(String hm) {
        this.hm = hm;
    }

    @Basic
    @Column(name = "ZH")
    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    @Basic
    @Column(name = "DLRXM")
    public String getDlrxm() {
        return dlrxm;
    }

    public void setDlrxm(String dlrxm) {
        this.dlrxm = dlrxm;
    }

    @Basic
    @Column(name = "DLRZJLB")
    public String getDlrzjlb() {
        return dlrzjlb;
    }

    public void setDlrzjlb(String dlrzjlb) {
        this.dlrzjlb = dlrzjlb;
    }

    @Basic
    @Column(name = "DLRZJHM")
    public String getDlrzjhm() {
        return dlrzjhm;
    }

    public void setDlrzjhm(String dlrzjhm) {
        this.dlrzjhm = dlrzjhm;
    }

    @Basic
    @Column(name = "DLRDZ")
    public String getDlrdz() {
        return dlrdz;
    }

    public void setDlrdz(String dlrdz) {
        this.dlrdz = dlrdz;
    }

    @Basic
    @Column(name = "DLRLXDH")
    public String getDlrlxdh() {
        return dlrlxdh;
    }

    public void setDlrlxdh(String dlrlxdh) {
        this.dlrlxdh = dlrlxdh;
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
        FcjyClfZjjghtZtEntity that = (FcjyClfZjjghtZtEntity) o;
        return Objects.equals(ztid, that.ztid) &&
                Objects.equals(ztbh, that.ztbh) &&
                Objects.equals(htid, that.htid) &&
                Objects.equals(jgid, that.jgid) &&
                Objects.equals(ztlb, that.ztlb) &&
                Objects.equals(ztxm, that.ztxm) &&
                Objects.equals(xb, that.xb) &&
                Objects.equals(csrq, that.csrq) &&
                Objects.equals(zjlb, that.zjlb) &&
                Objects.equals(zjhm, that.zjhm) &&
                Objects.equals(fzjg, that.fzjg) &&
                Objects.equals(dz, that.dz) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(yb, that.yb) &&
                Objects.equals(dzyj, that.dzyj) &&
                Objects.equals(gjdq, that.gjdq) &&
                Objects.equals(hjszs1, that.hjszs1) &&
                Objects.equals(hjszs2, that.hjszs2) &&
                Objects.equals(jzszs1, that.jzszs1) &&
                Objects.equals(jzszs2, that.jzszs2) &&
                Objects.equals(yh, that.yh) &&
                Objects.equals(hm, that.hm) &&
                Objects.equals(zh, that.zh) &&
                Objects.equals(dlrxm, that.dlrxm) &&
                Objects.equals(dlrzjlb, that.dlrzjlb) &&
                Objects.equals(dlrzjhm, that.dlrzjhm) &&
                Objects.equals(dlrdz, that.dlrdz) &&
                Objects.equals(dlrlxdh, that.dlrlxdh) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ztid, ztbh, htid, jgid, ztlb, ztxm, xb, csrq, zjlb, zjhm, fzjg, dz, lxdh, yb, dzyj, gjdq, hjszs1, hjszs2, jzszs1, jzszs2, yh, hm, zh, dlrxm, dlrzjlb, dlrzjhm, dlrdz, dlrlxdh, bz);
    }
}
