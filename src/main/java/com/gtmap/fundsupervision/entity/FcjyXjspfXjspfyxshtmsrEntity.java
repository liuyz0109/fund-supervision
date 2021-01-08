package com.gtmap.fundsupervision.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description
 */
@Entity
@Table(name = "FCJY_XJSPF_XJSPFYXSHTMSR", schema = "SCOTT", catalog = "")
public class FcjyXjspfXjspfyxshtmsrEntity implements Serializable {
    private String msrid;
    private Long htbh;
    private String msrxm;
    private String xb;
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
    private Time csrq;
    private String bz;

    @Id
    @Column(name = "MSRID")
    public String getMsrid() {
        return msrid;
    }

    public void setMsrid(String msrid) {
        this.msrid = msrid;
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
    @Column(name = "MSRXM")
    public String getMsrxm() {
        return msrxm;
    }

    public void setMsrxm(String msrxm) {
        this.msrxm = msrxm;
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
    @Column(name = "CSRQ")
    public Time getCsrq() {
        return csrq;
    }

    public void setCsrq(Time csrq) {
        this.csrq = csrq;
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
        FcjyXjspfXjspfyxshtmsrEntity that = (FcjyXjspfXjspfyxshtmsrEntity) o;
        return Objects.equals(msrid, that.msrid) &&
                Objects.equals(htbh, that.htbh) &&
                Objects.equals(msrxm, that.msrxm) &&
                Objects.equals(xb, that.xb) &&
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
                Objects.equals(csrq, that.csrq) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msrid, htbh, msrxm, xb, zjlb, zjhm, fzjg, dz, lxdh, yb, dzyj, gjdq, hjszs1, hjszs2, jzszs1, jzszs2, csrq, bz);
    }
}
