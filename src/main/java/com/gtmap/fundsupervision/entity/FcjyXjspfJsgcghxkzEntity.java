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
@Table(name = "FCJY_XJSPF_JSGCGHXKZ", schema = "SCOTT", catalog = "")
public class FcjyXjspfJsgcghxkzEntity implements Serializable {
    private String xkzid;
    private Long xmbh;
    private String xmmc;
    private String xkzh;
    private Time fzrq;
    private Long rjl;
    private Long lhl;
    private Long jzmj;
    private Long zzmj;
    private Long symj;
    private Long bgmj;
    private Long qtmj;

    @Id
    @Column(name = "XKZID")
    public String getXkzid() {
        return xkzid;
    }

    public void setXkzid(String xkzid) {
        this.xkzid = xkzid;
    }

    @Basic
    @Column(name = "XMBH")
    public Long getXmbh() {
        return xmbh;
    }

    public void setXmbh(Long xmbh) {
        this.xmbh = xmbh;
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
    @Column(name = "XKZH")
    public String getXkzh() {
        return xkzh;
    }

    public void setXkzh(String xkzh) {
        this.xkzh = xkzh;
    }

    @Basic
    @Column(name = "FZRQ")
    public Time getFzrq() {
        return fzrq;
    }

    public void setFzrq(Time fzrq) {
        this.fzrq = fzrq;
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
    @Column(name = "LHL")
    public Long getLhl() {
        return lhl;
    }

    public void setLhl(Long lhl) {
        this.lhl = lhl;
    }

    @Basic
    @Column(name = "JZMJ")
    public Long getJzmj() {
        return jzmj;
    }

    public void setJzmj(Long jzmj) {
        this.jzmj = jzmj;
    }

    @Basic
    @Column(name = "ZZMJ")
    public Long getZzmj() {
        return zzmj;
    }

    public void setZzmj(Long zzmj) {
        this.zzmj = zzmj;
    }

    @Basic
    @Column(name = "SYMJ")
    public Long getSymj() {
        return symj;
    }

    public void setSymj(Long symj) {
        this.symj = symj;
    }

    @Basic
    @Column(name = "BGMJ")
    public Long getBgmj() {
        return bgmj;
    }

    public void setBgmj(Long bgmj) {
        this.bgmj = bgmj;
    }

    @Basic
    @Column(name = "QTMJ")
    public Long getQtmj() {
        return qtmj;
    }

    public void setQtmj(Long qtmj) {
        this.qtmj = qtmj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyXjspfJsgcghxkzEntity that = (FcjyXjspfJsgcghxkzEntity) o;
        return Objects.equals(xkzid, that.xkzid) &&
                Objects.equals(xmbh, that.xmbh) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(xkzh, that.xkzh) &&
                Objects.equals(fzrq, that.fzrq) &&
                Objects.equals(rjl, that.rjl) &&
                Objects.equals(lhl, that.lhl) &&
                Objects.equals(jzmj, that.jzmj) &&
                Objects.equals(zzmj, that.zzmj) &&
                Objects.equals(symj, that.symj) &&
                Objects.equals(bgmj, that.bgmj) &&
                Objects.equals(qtmj, that.qtmj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xkzid, xmbh, xmmc, xkzh, fzrq, rjl, lhl, jzmj, zzmj, symj, bgmj, qtmj);
    }
}
