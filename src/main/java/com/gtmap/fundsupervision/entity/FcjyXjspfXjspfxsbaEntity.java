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
@Table(name = "FCJY_XJSPF_XJSPFXSBA", schema = "SCOTT", catalog = "")
public class FcjyXjspfXjspfxsbaEntity implements Serializable {
    private String baid;
    private Long babh;
    private String bazh;
    private String gsmc;
    private String xmmc;
    private Long sjjgmj;
    private Long sjjgts;
    private Time sjjgrq;
    private String fwlx;
    private String jzlx;
    private String jzjg;
    private String fwzh;
    private Long cs;
    private Long ts;
    private Long zjzmj;
    private Long xsbamj;
    private Long xsbats;
    private Time xsksrq;
    private Time xsjsrq;
    private Long ljpzxszfzmj;
    private Long zfxssbpjjg;
    private Long xsbasyyyyfzmj;
    private Long syyyyfxssbpjjg;
    private Long xsbabglzmj;
    private Long bglxssbpjjg;
    private Long xsbaqtfwzmj;
    private Long qtfwsbpjjg;
    private String yxkzh;
    private String bz;

    @Id
    @Column(name = "BAID")
    public String getBaid() {
        return baid;
    }

    public void setBaid(String baid) {
        this.baid = baid;
    }

    @Basic
    @Column(name = "BABH")
    public Long getBabh() {
        return babh;
    }

    public void setBabh(Long babh) {
        this.babh = babh;
    }

    @Basic
    @Column(name = "BAZH")
    public String getBazh() {
        return bazh;
    }

    public void setBazh(String bazh) {
        this.bazh = bazh;
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
    @Column(name = "SJJGMJ")
    public Long getSjjgmj() {
        return sjjgmj;
    }

    public void setSjjgmj(Long sjjgmj) {
        this.sjjgmj = sjjgmj;
    }

    @Basic
    @Column(name = "SJJGTS")
    public Long getSjjgts() {
        return sjjgts;
    }

    public void setSjjgts(Long sjjgts) {
        this.sjjgts = sjjgts;
    }

    @Basic
    @Column(name = "SJJGRQ")
    public Time getSjjgrq() {
        return sjjgrq;
    }

    public void setSjjgrq(Time sjjgrq) {
        this.sjjgrq = sjjgrq;
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
    @Column(name = "XSBAMJ")
    public Long getXsbamj() {
        return xsbamj;
    }

    public void setXsbamj(Long xsbamj) {
        this.xsbamj = xsbamj;
    }

    @Basic
    @Column(name = "XSBATS")
    public Long getXsbats() {
        return xsbats;
    }

    public void setXsbats(Long xsbats) {
        this.xsbats = xsbats;
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
    @Column(name = "LJPZXSZFZMJ")
    public Long getLjpzxszfzmj() {
        return ljpzxszfzmj;
    }

    public void setLjpzxszfzmj(Long ljpzxszfzmj) {
        this.ljpzxszfzmj = ljpzxszfzmj;
    }

    @Basic
    @Column(name = "ZFXSSBPJJG")
    public Long getZfxssbpjjg() {
        return zfxssbpjjg;
    }

    public void setZfxssbpjjg(Long zfxssbpjjg) {
        this.zfxssbpjjg = zfxssbpjjg;
    }

    @Basic
    @Column(name = "XSBASYYYYFZMJ")
    public Long getXsbasyyyyfzmj() {
        return xsbasyyyyfzmj;
    }

    public void setXsbasyyyyfzmj(Long xsbasyyyyfzmj) {
        this.xsbasyyyyfzmj = xsbasyyyyfzmj;
    }

    @Basic
    @Column(name = "SYYYYFXSSBPJJG")
    public Long getSyyyyfxssbpjjg() {
        return syyyyfxssbpjjg;
    }

    public void setSyyyyfxssbpjjg(Long syyyyfxssbpjjg) {
        this.syyyyfxssbpjjg = syyyyfxssbpjjg;
    }

    @Basic
    @Column(name = "XSBABGLZMJ")
    public Long getXsbabglzmj() {
        return xsbabglzmj;
    }

    public void setXsbabglzmj(Long xsbabglzmj) {
        this.xsbabglzmj = xsbabglzmj;
    }

    @Basic
    @Column(name = "BGLXSSBPJJG")
    public Long getBglxssbpjjg() {
        return bglxssbpjjg;
    }

    public void setBglxssbpjjg(Long bglxssbpjjg) {
        this.bglxssbpjjg = bglxssbpjjg;
    }

    @Basic
    @Column(name = "XSBAQTFWZMJ")
    public Long getXsbaqtfwzmj() {
        return xsbaqtfwzmj;
    }

    public void setXsbaqtfwzmj(Long xsbaqtfwzmj) {
        this.xsbaqtfwzmj = xsbaqtfwzmj;
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
        FcjyXjspfXjspfxsbaEntity that = (FcjyXjspfXjspfxsbaEntity) o;
        return Objects.equals(baid, that.baid) &&
                Objects.equals(babh, that.babh) &&
                Objects.equals(bazh, that.bazh) &&
                Objects.equals(gsmc, that.gsmc) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(sjjgmj, that.sjjgmj) &&
                Objects.equals(sjjgts, that.sjjgts) &&
                Objects.equals(sjjgrq, that.sjjgrq) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(jzlx, that.jzlx) &&
                Objects.equals(jzjg, that.jzjg) &&
                Objects.equals(fwzh, that.fwzh) &&
                Objects.equals(cs, that.cs) &&
                Objects.equals(ts, that.ts) &&
                Objects.equals(zjzmj, that.zjzmj) &&
                Objects.equals(xsbamj, that.xsbamj) &&
                Objects.equals(xsbats, that.xsbats) &&
                Objects.equals(xsksrq, that.xsksrq) &&
                Objects.equals(xsjsrq, that.xsjsrq) &&
                Objects.equals(ljpzxszfzmj, that.ljpzxszfzmj) &&
                Objects.equals(zfxssbpjjg, that.zfxssbpjjg) &&
                Objects.equals(xsbasyyyyfzmj, that.xsbasyyyyfzmj) &&
                Objects.equals(syyyyfxssbpjjg, that.syyyyfxssbpjjg) &&
                Objects.equals(xsbabglzmj, that.xsbabglzmj) &&
                Objects.equals(bglxssbpjjg, that.bglxssbpjjg) &&
                Objects.equals(xsbaqtfwzmj, that.xsbaqtfwzmj) &&
                Objects.equals(qtfwsbpjjg, that.qtfwsbpjjg) &&
                Objects.equals(yxkzh, that.yxkzh) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baid, babh, bazh, gsmc, xmmc, sjjgmj, sjjgts, sjjgrq, fwlx, jzlx, jzjg, fwzh, cs, ts, zjzmj, xsbamj, xsbats, xsksrq, xsjsrq, ljpzxszfzmj, zfxssbpjjg, xsbasyyyyfzmj, syyyyfxssbpjjg, xsbabglzmj, bglxssbpjjg, xsbaqtfwzmj, qtfwsbpjjg, yxkzh, bz);
    }
}
