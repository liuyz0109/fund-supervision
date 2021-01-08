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
@Table(name = "FCJY_XJSPF_XJSPFYSXK", schema = "SCOTT", catalog = "")
public class FcjyXjspfXjspfysxkEntity implements Serializable {
    private String xkid;
    private Long xkbh;
    private String xkzh;
    private String gsmc;
    private String xmmc;
    private Long yjjgmj;
    private Long yjjgts;
    private Time yjjgrq;
    private String fwlx;
    private String jzlx;
    private String jzjg;
    private String fwzh;
    private Long cs;
    private Long ts;
    private Long zjzmj;
    private Long xkmj;
    private Long xkts;
    private Time xsksrq;
    private Time xsjsrq;
    private Long pzyszfzmj;
    private Long zfyssbpjjg;
    private Long pzyssyyyyfzmj;
    private Long syyyyfyssbpjjg;
    private Long pzysbglzmj;
    private Long bglyssbpjjg;
    private Long pzysqtfwzmj;
    private Long qtfwsbpjjg;
    private String yxkzh;
    private String bz;

    @Id
    @Column(name = "XKID")
    public String getXkid() {
        return xkid;
    }

    public void setXkid(String xkid) {
        this.xkid = xkid;
    }

    @Basic
    @Column(name = "XKBH")
    public Long getXkbh() {
        return xkbh;
    }

    public void setXkbh(Long xkbh) {
        this.xkbh = xkbh;
    }

    @Basic
    @Column(name = "XKZH")
    public String getXkzh() {
        return xkzh;
    }

    public void setXkzh(String xkzh) {
        this.xkzh = xkzh;
    }

    @Basic
    @Column(name = "GSMC")
    public String getGsmc() {
        return gsmc;
    }

    public void setGsmc(String gsmc) {
        this.gsmc = gsmc;
    }

    @Basic
    @Column(name = "XMMC")
    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    @Basic
    @Column(name = "YJJGMJ")
    public Long getYjjgmj() {
        return yjjgmj;
    }

    public void setYjjgmj(Long yjjgmj) {
        this.yjjgmj = yjjgmj;
    }

    @Basic
    @Column(name = "YJJGTS")
    public Long getYjjgts() {
        return yjjgts;
    }

    public void setYjjgts(Long yjjgts) {
        this.yjjgts = yjjgts;
    }

    @Basic
    @Column(name = "YJJGRQ")
    public Time getYjjgrq() {
        return yjjgrq;
    }

    public void setYjjgrq(Time yjjgrq) {
        this.yjjgrq = yjjgrq;
    }

    @Basic
    @Column(name = "FWLX")
    public String getFwlx() {
        return fwlx;
    }

    public void setFwlx(String fwlx) {
        this.fwlx = fwlx;
    }

    @Basic
    @Column(name = "JZLX")
    public String getJzlx() {
        return jzlx;
    }

    public void setJzlx(String jzlx) {
        this.jzlx = jzlx;
    }

    @Basic
    @Column(name = "JZJG")
    public String getJzjg() {
        return jzjg;
    }

    public void setJzjg(String jzjg) {
        this.jzjg = jzjg;
    }

    @Basic
    @Column(name = "FWZH")
    public String getFwzh() {
        return fwzh;
    }

    public void setFwzh(String fwzh) {
        this.fwzh = fwzh;
    }

    @Basic
    @Column(name = "CS")
    public Long getCs() {
        return cs;
    }

    public void setCs(Long cs) {
        this.cs = cs;
    }

    @Basic
    @Column(name = "TS")
    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    @Basic
    @Column(name = "ZJZMJ")
    public Long getZjzmj() {
        return zjzmj;
    }

    public void setZjzmj(Long zjzmj) {
        this.zjzmj = zjzmj;
    }

    @Basic
    @Column(name = "XKMJ")
    public Long getXkmj() {
        return xkmj;
    }

    public void setXkmj(Long xkmj) {
        this.xkmj = xkmj;
    }

    @Basic
    @Column(name = "XKTS")
    public Long getXkts() {
        return xkts;
    }

    public void setXkts(Long xkts) {
        this.xkts = xkts;
    }

    @Basic
    @Column(name = "XSKSRQ")
    public Time getXsksrq() {
        return xsksrq;
    }

    public void setXsksrq(Time xsksrq) {
        this.xsksrq = xsksrq;
    }

    @Basic
    @Column(name = "XSJSRQ")
    public Time getXsjsrq() {
        return xsjsrq;
    }

    public void setXsjsrq(Time xsjsrq) {
        this.xsjsrq = xsjsrq;
    }

    @Basic
    @Column(name = "PZYSZFZMJ")
    public Long getPzyszfzmj() {
        return pzyszfzmj;
    }

    public void setPzyszfzmj(Long pzyszfzmj) {
        this.pzyszfzmj = pzyszfzmj;
    }

    @Basic
    @Column(name = "ZFYSSBPJJG")
    public Long getZfyssbpjjg() {
        return zfyssbpjjg;
    }

    public void setZfyssbpjjg(Long zfyssbpjjg) {
        this.zfyssbpjjg = zfyssbpjjg;
    }

    @Basic
    @Column(name = "PZYSSYYYYFZMJ")
    public Long getPzyssyyyyfzmj() {
        return pzyssyyyyfzmj;
    }

    public void setPzyssyyyyfzmj(Long pzyssyyyyfzmj) {
        this.pzyssyyyyfzmj = pzyssyyyyfzmj;
    }

    @Basic
    @Column(name = "SYYYYFYSSBPJJG")
    public Long getSyyyyfyssbpjjg() {
        return syyyyfyssbpjjg;
    }

    public void setSyyyyfyssbpjjg(Long syyyyfyssbpjjg) {
        this.syyyyfyssbpjjg = syyyyfyssbpjjg;
    }

    @Basic
    @Column(name = "PZYSBGLZMJ")
    public Long getPzysbglzmj() {
        return pzysbglzmj;
    }

    public void setPzysbglzmj(Long pzysbglzmj) {
        this.pzysbglzmj = pzysbglzmj;
    }

    @Basic
    @Column(name = "BGLYSSBPJJG")
    public Long getBglyssbpjjg() {
        return bglyssbpjjg;
    }

    public void setBglyssbpjjg(Long bglyssbpjjg) {
        this.bglyssbpjjg = bglyssbpjjg;
    }

    @Basic
    @Column(name = "PZYSQTFWZMJ")
    public Long getPzysqtfwzmj() {
        return pzysqtfwzmj;
    }

    public void setPzysqtfwzmj(Long pzysqtfwzmj) {
        this.pzysqtfwzmj = pzysqtfwzmj;
    }

    @Basic
    @Column(name = "QTFWSBPJJG")
    public Long getQtfwsbpjjg() {
        return qtfwsbpjjg;
    }

    public void setQtfwsbpjjg(Long qtfwsbpjjg) {
        this.qtfwsbpjjg = qtfwsbpjjg;
    }

    @Basic
    @Column(name = "YXKZH")
    public String getYxkzh() {
        return yxkzh;
    }

    public void setYxkzh(String yxkzh) {
        this.yxkzh = yxkzh;
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
        FcjyXjspfXjspfysxkEntity that = (FcjyXjspfXjspfysxkEntity) o;
        return Objects.equals(xkid, that.xkid) &&
                Objects.equals(xkbh, that.xkbh) &&
                Objects.equals(xkzh, that.xkzh) &&
                Objects.equals(gsmc, that.gsmc) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(yjjgmj, that.yjjgmj) &&
                Objects.equals(yjjgts, that.yjjgts) &&
                Objects.equals(yjjgrq, that.yjjgrq) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(jzlx, that.jzlx) &&
                Objects.equals(jzjg, that.jzjg) &&
                Objects.equals(fwzh, that.fwzh) &&
                Objects.equals(cs, that.cs) &&
                Objects.equals(ts, that.ts) &&
                Objects.equals(zjzmj, that.zjzmj) &&
                Objects.equals(xkmj, that.xkmj) &&
                Objects.equals(xkts, that.xkts) &&
                Objects.equals(xsksrq, that.xsksrq) &&
                Objects.equals(xsjsrq, that.xsjsrq) &&
                Objects.equals(pzyszfzmj, that.pzyszfzmj) &&
                Objects.equals(zfyssbpjjg, that.zfyssbpjjg) &&
                Objects.equals(pzyssyyyyfzmj, that.pzyssyyyyfzmj) &&
                Objects.equals(syyyyfyssbpjjg, that.syyyyfyssbpjjg) &&
                Objects.equals(pzysbglzmj, that.pzysbglzmj) &&
                Objects.equals(bglyssbpjjg, that.bglyssbpjjg) &&
                Objects.equals(pzysqtfwzmj, that.pzysqtfwzmj) &&
                Objects.equals(qtfwsbpjjg, that.qtfwsbpjjg) &&
                Objects.equals(yxkzh, that.yxkzh) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xkid, xkbh, xkzh, gsmc, xmmc, yjjgmj, yjjgts, yjjgrq, fwlx, jzlx, jzjg, fwzh, cs, ts, zjzmj, xkmj, xkts, xsksrq, xsjsrq, pzyszfzmj, zfyssbpjjg, pzyssyyyyfzmj, syyyyfyssbpjjg, pzysbglzmj, bglyssbpjjg, pzysqtfwzmj, qtfwsbpjjg, yxkzh, bz);
    }
}
