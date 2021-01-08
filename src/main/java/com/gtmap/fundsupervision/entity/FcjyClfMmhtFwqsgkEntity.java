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
@Table(name = "FCJY_CLF_MMHT_FWQSGK", schema = "SCOTT", catalog = "")
public class FcjyClfMmhtFwqsgkEntity implements Serializable {
    private String id;
    private String htid;
    private String hbh;
    private String fwzl;
    private String fwlx;
    private String fwjg;
    private String hx;
    private Long jzmj;
    private Long tnjzmj;
    private String syqr;
    private String syqzh;
    private Long symj;
    private Long ftmj;
    private String ghyt;
    private String czs;
    private Long jcnf;
    private String fwxzqtsm;
    private String bz;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "FWLX")
    public String getFwlx() {
        return fwlx;
    }

    public void setFwlx(String fwlx) {
        this.fwlx = fwlx;
    }

    @Basic
    @Column(name = "FWJG")
    public String getFwjg() {
        return fwjg;
    }

    public void setFwjg(String fwjg) {
        this.fwjg = fwjg;
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
    @Column(name = "JZMJ")
    public Long getJzmj() {
        return jzmj;
    }

    public void setJzmj(Long jzmj) {
        this.jzmj = jzmj;
    }

    @Basic
    @Column(name = "TNJZMJ")
    public Long getTnjzmj() {
        return tnjzmj;
    }

    public void setTnjzmj(Long tnjzmj) {
        this.tnjzmj = tnjzmj;
    }

    @Basic
    @Column(name = "SYQR")
    public String getSyqr() {
        return syqr;
    }

    public void setSyqr(String syqr) {
        this.syqr = syqr;
    }

    @Basic
    @Column(name = "SYQZH")
    public String getSyqzh() {
        return syqzh;
    }

    public void setSyqzh(String syqzh) {
        this.syqzh = syqzh;
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
    @Column(name = "FTMJ")
    public Long getFtmj() {
        return ftmj;
    }

    public void setFtmj(Long ftmj) {
        this.ftmj = ftmj;
    }

    @Basic
    @Column(name = "GHYT")
    public String getGhyt() {
        return ghyt;
    }

    public void setGhyt(String ghyt) {
        this.ghyt = ghyt;
    }

    @Basic
    @Column(name = "CZS")
    public String getCzs() {
        return czs;
    }

    public void setCzs(String czs) {
        this.czs = czs;
    }

    @Basic
    @Column(name = "JCNF")
    public Long getJcnf() {
        return jcnf;
    }

    public void setJcnf(Long jcnf) {
        this.jcnf = jcnf;
    }

    @Basic
    @Column(name = "FWXZQTSM")
    public String getFwxzqtsm() {
        return fwxzqtsm;
    }

    public void setFwxzqtsm(String fwxzqtsm) {
        this.fwxzqtsm = fwxzqtsm;
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
        FcjyClfMmhtFwqsgkEntity that = (FcjyClfMmhtFwqsgkEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(htid, that.htid) &&
                Objects.equals(hbh, that.hbh) &&
                Objects.equals(fwzl, that.fwzl) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(fwjg, that.fwjg) &&
                Objects.equals(hx, that.hx) &&
                Objects.equals(jzmj, that.jzmj) &&
                Objects.equals(tnjzmj, that.tnjzmj) &&
                Objects.equals(syqr, that.syqr) &&
                Objects.equals(syqzh, that.syqzh) &&
                Objects.equals(symj, that.symj) &&
                Objects.equals(ftmj, that.ftmj) &&
                Objects.equals(ghyt, that.ghyt) &&
                Objects.equals(czs, that.czs) &&
                Objects.equals(jcnf, that.jcnf) &&
                Objects.equals(fwxzqtsm, that.fwxzqtsm) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, htid, hbh, fwzl, fwlx, fwjg, hx, jzmj, tnjzmj, syqr, syqzh, symj, ftmj, ghyt, czs, jcnf, fwxzqtsm, bz);
    }
}
