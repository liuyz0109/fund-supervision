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
@Table(name = "FCJY_CLF_CSGP", schema = "SCOTT", catalog = "")
public class FcjyClfCsgpEntity implements Serializable {
    private String csgpid;
    private Long csgpbh;
    private String gplx;
    private String hbh;
    private String qxh;
    private String slcbh;
    private String jyybh;
    private String gpbz;
    private Long gpjg;
    private String fbzl;
    private String xqmc;
    private String hx;
    private Long rjl;
    private String fxt;
    private String jgt;
    private String lc;
    private String cx;
    private String zxcd;
    private String fwzscl;
    private String wxzjjsfs;
    private String mjgc;
    private String ptss;
    private String jtxl;
    private String dlfw;
    private String wygs;
    private Long wyglf;
    private Time jfrq;
    private String dzyzk;
    private String qlr;
    private String qlrzjhm;
    private String qlrzz;
    private String qlrlxdh;
    private Long gpqx;
    private Time gpqsrq;
    private Time gpjzrq;
    private String gpzt;
    private String bz;

    @Id
    @Column(name = "CSGPID")
    public String getCsgpid() {
        return csgpid;
    }

    public void setCsgpid(String csgpid) {
        this.csgpid = csgpid;
    }

    @Basic
    @Column(name = "CSGPBH")
    public Long getCsgpbh() {
        return csgpbh;
    }

    public void setCsgpbh(Long csgpbh) {
        this.csgpbh = csgpbh;
    }

    @Basic
    @Column(name = "GPLX")
    public String getGplx() {
        return gplx;
    }

    public void setGplx(String gplx) {
        this.gplx = gplx;
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
    @Column(name = "QXH")
    public String getQxh() {
        return qxh;
    }

    public void setQxh(String qxh) {
        this.qxh = qxh;
    }

    @Basic
    @Column(name = "SLCBH")
    public String getSlcbh() {
        return slcbh;
    }

    public void setSlcbh(String slcbh) {
        this.slcbh = slcbh;
    }

    @Basic
    @Column(name = "JYYBH")
    public String getJyybh() {
        return jyybh;
    }

    public void setJyybh(String jyybh) {
        this.jyybh = jyybh;
    }

    @Basic
    @Column(name = "GPBZ")
    public String getGpbz() {
        return gpbz;
    }

    public void setGpbz(String gpbz) {
        this.gpbz = gpbz;
    }

    @Basic
    @Column(name = "GPJG")
    public Long getGpjg() {
        return gpjg;
    }

    public void setGpjg(Long gpjg) {
        this.gpjg = gpjg;
    }

    @Basic
    @Column(name = "FBZL")
    public String getFbzl() {
        return fbzl;
    }

    public void setFbzl(String fbzl) {
        this.fbzl = fbzl;
    }

    @Basic
    @Column(name = "XQMC")
    public String getXqmc() {
        return xqmc;
    }

    public void setXqmc(String xqmc) {
        this.xqmc = xqmc;
    }

    @Basic
    @Column(name = "HX")
    public String getHx() {
        return hx;
    }

    public void setHx(String hx) {
        this.hx = hx;
    }

    @Basic
    @Column(name = "RJL")
    public Long getRjl() {
        return rjl;
    }

    public void setRjl(Long rjl) {
        this.rjl = rjl;
    }

    @Basic
    @Column(name = "FXT")
    public String getFxt() {
        return fxt;
    }

    public void setFxt(String fxt) {
        this.fxt = fxt;
    }

    @Basic
    @Column(name = "JGT")
    public String getJgt() {
        return jgt;
    }

    public void setJgt(String jgt) {
        this.jgt = jgt;
    }

    @Basic
    @Column(name = "LC")
    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    @Basic
    @Column(name = "CX")
    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    @Basic
    @Column(name = "ZXCD")
    public String getZxcd() {
        return zxcd;
    }

    public void setZxcd(String zxcd) {
        this.zxcd = zxcd;
    }

    @Basic
    @Column(name = "FWZSCL")
    public String getFwzscl() {
        return fwzscl;
    }

    public void setFwzscl(String fwzscl) {
        this.fwzscl = fwzscl;
    }

    @Basic
    @Column(name = "WXZJJSFS")
    public String getWxzjjsfs() {
        return wxzjjsfs;
    }

    public void setWxzjjsfs(String wxzjjsfs) {
        this.wxzjjsfs = wxzjjsfs;
    }

    @Basic
    @Column(name = "MJGC")
    public String getMjgc() {
        return mjgc;
    }

    public void setMjgc(String mjgc) {
        this.mjgc = mjgc;
    }

    @Basic
    @Column(name = "PTSS")
    public String getPtss() {
        return ptss;
    }

    public void setPtss(String ptss) {
        this.ptss = ptss;
    }

    @Basic
    @Column(name = "JTXL")
    public String getJtxl() {
        return jtxl;
    }

    public void setJtxl(String jtxl) {
        this.jtxl = jtxl;
    }

    @Basic
    @Column(name = "DLFW")
    public String getDlfw() {
        return dlfw;
    }

    public void setDlfw(String dlfw) {
        this.dlfw = dlfw;
    }

    @Basic
    @Column(name = "WYGS")
    public String getWygs() {
        return wygs;
    }

    public void setWygs(String wygs) {
        this.wygs = wygs;
    }

    @Basic
    @Column(name = "WYGLF")
    public Long getWyglf() {
        return wyglf;
    }

    public void setWyglf(Long wyglf) {
        this.wyglf = wyglf;
    }

    @Basic
    @Column(name = "JFRQ")
    public Time getJfrq() {
        return jfrq;
    }

    public void setJfrq(Time jfrq) {
        this.jfrq = jfrq;
    }

    @Basic
    @Column(name = "DZYZK")
    public String getDzyzk() {
        return dzyzk;
    }

    public void setDzyzk(String dzyzk) {
        this.dzyzk = dzyzk;
    }

    @Basic
    @Column(name = "QLR")
    public String getQlr() {
        return qlr;
    }

    public void setQlr(String qlr) {
        this.qlr = qlr;
    }

    @Basic
    @Column(name = "QLRZJHM")
    public String getQlrzjhm() {
        return qlrzjhm;
    }

    public void setQlrzjhm(String qlrzjhm) {
        this.qlrzjhm = qlrzjhm;
    }

    @Basic
    @Column(name = "QLRZZ")
    public String getQlrzz() {
        return qlrzz;
    }

    public void setQlrzz(String qlrzz) {
        this.qlrzz = qlrzz;
    }

    @Basic
    @Column(name = "QLRLXDH")
    public String getQlrlxdh() {
        return qlrlxdh;
    }

    public void setQlrlxdh(String qlrlxdh) {
        this.qlrlxdh = qlrlxdh;
    }

    @Basic
    @Column(name = "GPQX")
    public Long getGpqx() {
        return gpqx;
    }

    public void setGpqx(Long gpqx) {
        this.gpqx = gpqx;
    }

    @Basic
    @Column(name = "GPQSRQ")
    public Time getGpqsrq() {
        return gpqsrq;
    }

    public void setGpqsrq(Time gpqsrq) {
        this.gpqsrq = gpqsrq;
    }

    @Basic
    @Column(name = "GPJZRQ")
    public Time getGpjzrq() {
        return gpjzrq;
    }

    public void setGpjzrq(Time gpjzrq) {
        this.gpjzrq = gpjzrq;
    }

    @Basic
    @Column(name = "GPZT")
    public String getGpzt() {
        return gpzt;
    }

    public void setGpzt(String gpzt) {
        this.gpzt = gpzt;
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
        FcjyClfCsgpEntity that = (FcjyClfCsgpEntity) o;
        return Objects.equals(csgpid, that.csgpid) &&
                Objects.equals(csgpbh, that.csgpbh) &&
                Objects.equals(gplx, that.gplx) &&
                Objects.equals(hbh, that.hbh) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(slcbh, that.slcbh) &&
                Objects.equals(jyybh, that.jyybh) &&
                Objects.equals(gpbz, that.gpbz) &&
                Objects.equals(gpjg, that.gpjg) &&
                Objects.equals(fbzl, that.fbzl) &&
                Objects.equals(xqmc, that.xqmc) &&
                Objects.equals(hx, that.hx) &&
                Objects.equals(rjl, that.rjl) &&
                Objects.equals(fxt, that.fxt) &&
                Objects.equals(jgt, that.jgt) &&
                Objects.equals(lc, that.lc) &&
                Objects.equals(cx, that.cx) &&
                Objects.equals(zxcd, that.zxcd) &&
                Objects.equals(fwzscl, that.fwzscl) &&
                Objects.equals(wxzjjsfs, that.wxzjjsfs) &&
                Objects.equals(mjgc, that.mjgc) &&
                Objects.equals(ptss, that.ptss) &&
                Objects.equals(jtxl, that.jtxl) &&
                Objects.equals(dlfw, that.dlfw) &&
                Objects.equals(wygs, that.wygs) &&
                Objects.equals(wyglf, that.wyglf) &&
                Objects.equals(jfrq, that.jfrq) &&
                Objects.equals(dzyzk, that.dzyzk) &&
                Objects.equals(qlr, that.qlr) &&
                Objects.equals(qlrzjhm, that.qlrzjhm) &&
                Objects.equals(qlrzz, that.qlrzz) &&
                Objects.equals(qlrlxdh, that.qlrlxdh) &&
                Objects.equals(gpqx, that.gpqx) &&
                Objects.equals(gpqsrq, that.gpqsrq) &&
                Objects.equals(gpjzrq, that.gpjzrq) &&
                Objects.equals(gpzt, that.gpzt) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csgpid, csgpbh, gplx, hbh, qxh, slcbh, jyybh, gpbz, gpjg, fbzl, xqmc, hx, rjl, fxt, jgt, lc, cx, zxcd, fwzscl, wxzjjsfs, mjgc, ptss, jtxl, dlfw, wygs, wyglf, jfrq, dzyzk, qlr, qlrzjhm, qlrzz, qlrlxdh, gpqx, gpqsrq, gpjzrq, gpzt, bz);
    }
}
