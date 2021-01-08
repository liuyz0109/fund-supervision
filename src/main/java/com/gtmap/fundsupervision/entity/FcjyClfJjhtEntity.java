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
@Table(name = "FCJY_CLF_JJHT", schema = "SCOTT")
public class FcjyClfJjhtEntity implements Serializable {
    private String jjhtid;
    private Long jjhtbh;
    private String wtlx;
    private String wtly;
    private Time wtsj;
    private String wtdd;
    private String hbh;
    private String fwsyqzh;
    private String qlr;
    private String zjlx;
    private String zjhm;
    private String wtrdz;
    private String lxdh;
    private String fdcjjjgbh;
    private String fdcjjrbh;
    private String zt;
    private String sfyx;
    private String bz;

    @Id
    @Column(name = "JJHTID")
    public String getJjhtid() {
        return jjhtid;
    }

    public void setJjhtid(String jjhtid) {
        this.jjhtid = jjhtid;
    }

    @Basic
    @Column(name = "JJHTBH")
    public Long getJjhtbh() {
        return jjhtbh;
    }

    public void setJjhtbh(Long jjhtbh) {
        this.jjhtbh = jjhtbh;
    }

    @Basic
    @Column(name = "WTLX")
    public String getWtlx() {
        return wtlx;
    }

    public void setWtlx(String wtlx) {
        this.wtlx = wtlx;
    }

    @Basic
    @Column(name = "WTLY")
    public String getWtly() {
        return wtly;
    }

    public void setWtly(String wtly) {
        this.wtly = wtly;
    }

    @Basic
    @Column(name = "WTSJ")
    public Time getWtsj() {
        return wtsj;
    }

    public void setWtsj(Time wtsj) {
        this.wtsj = wtsj;
    }

    @Basic
    @Column(name = "WTDD")
    public String getWtdd() {
        return wtdd;
    }

    public void setWtdd(String wtdd) {
        this.wtdd = wtdd;
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
    @Column(name = "FWSYQZH")
    public String getFwsyqzh() {
        return fwsyqzh;
    }

    public void setFwsyqzh(String fwsyqzh) {
        this.fwsyqzh = fwsyqzh;
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
    @Column(name = "ZJLX")
    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
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
    @Column(name = "WTRDZ")
    public String getWtrdz() {
        return wtrdz;
    }

    public void setWtrdz(String wtrdz) {
        this.wtrdz = wtrdz;
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
    @Column(name = "FDCJJJGBH")
    public String getFdcjjjgbh() {
        return fdcjjjgbh;
    }

    public void setFdcjjjgbh(String fdcjjjgbh) {
        this.fdcjjjgbh = fdcjjjgbh;
    }

    @Basic
    @Column(name = "FDCJJRBH")
    public String getFdcjjrbh() {
        return fdcjjrbh;
    }

    public void setFdcjjrbh(String fdcjjrbh) {
        this.fdcjjrbh = fdcjjrbh;
    }

    @Basic
    @Column(name = "ZT")
    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    @Basic
    @Column(name = "SFYX")
    public String getSfyx() {
        return sfyx;
    }

    public void setSfyx(String sfyx) {
        this.sfyx = sfyx;
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
        FcjyClfJjhtEntity that = (FcjyClfJjhtEntity) o;
        return Objects.equals(jjhtid, that.jjhtid) &&
                Objects.equals(jjhtbh, that.jjhtbh) &&
                Objects.equals(wtlx, that.wtlx) &&
                Objects.equals(wtly, that.wtly) &&
                Objects.equals(wtsj, that.wtsj) &&
                Objects.equals(wtdd, that.wtdd) &&
                Objects.equals(hbh, that.hbh) &&
                Objects.equals(fwsyqzh, that.fwsyqzh) &&
                Objects.equals(qlr, that.qlr) &&
                Objects.equals(zjlx, that.zjlx) &&
                Objects.equals(zjhm, that.zjhm) &&
                Objects.equals(wtrdz, that.wtrdz) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(fdcjjjgbh, that.fdcjjjgbh) &&
                Objects.equals(fdcjjrbh, that.fdcjjrbh) &&
                Objects.equals(zt, that.zt) &&
                Objects.equals(sfyx, that.sfyx) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jjhtid, jjhtbh, wtlx, wtly, wtsj, wtdd, hbh, fwsyqzh, qlr, zjlx, zjhm, wtrdz, lxdh, fdcjjjgbh, fdcjjrbh, zt, sfyx, bz);
    }
}
