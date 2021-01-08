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
@Table(name = "FCJY_XJSPF_XJSPFYSHT", schema = "SCOTT", catalog = "")
public class FcjyXjspfXjspfyshtEntity implements Serializable {
    private String htid;
    private Long htbh;
    private String hbh;
    private String htzl;
    private String xsfs;
    private Time htqdrq;
    private Time htqrrq;
    private String htqrr;
    private Long jzmj;
    private Long tnjzmj;
    private Long htje;
    private String htbz;
    private String jjfs;
    private String fklx;
    private String dkfs;
    private Time fksj;
    private Long dj;
    private String fdckfqymc;
    private String fdckfqydh;
    private String fdckfqydz;
    private Time htcxrq;
    private String htcxqrr;
    private String bz;

    @Id
    @Column(name = "HTID")
    public String getHtid() {
        return htid;
    }

    public void setHtid(String htid) {
        this.htid = htid;
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
    @Column(name = "HTZL")
    public String getHtzl() {
        return htzl;
    }

    public void setHtzl(String htzl) {
        this.htzl = htzl;
    }

    @Basic
    @Column(name = "XSFS")
    public String getXsfs() {
        return xsfs;
    }

    public void setXsfs(String xsfs) {
        this.xsfs = xsfs;
    }

    @Basic
    @Column(name = "HTQDRQ")
    public Time getHtqdrq() {
        return htqdrq;
    }

    public void setHtqdrq(Time htqdrq) {
        this.htqdrq = htqdrq;
    }

    @Basic
    @Column(name = "HTQRRQ")
    public Time getHtqrrq() {
        return htqrrq;
    }

    public void setHtqrrq(Time htqrrq) {
        this.htqrrq = htqrrq;
    }

    @Basic
    @Column(name = "HTQRR")
    public String getHtqrr() {
        return htqrr;
    }

    public void setHtqrr(String htqrr) {
        this.htqrr = htqrr;
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
    @Column(name = "HTJE")
    public Long getHtje() {
        return htje;
    }

    public void setHtje(Long htje) {
        this.htje = htje;
    }

    @Basic
    @Column(name = "HTBZ")
    public String getHtbz() {
        return htbz;
    }

    public void setHtbz(String htbz) {
        this.htbz = htbz;
    }

    @Basic
    @Column(name = "JJFS")
    public String getJjfs() {
        return jjfs;
    }

    public void setJjfs(String jjfs) {
        this.jjfs = jjfs;
    }

    @Basic
    @Column(name = "FKLX")
    public String getFklx() {
        return fklx;
    }

    public void setFklx(String fklx) {
        this.fklx = fklx;
    }

    @Basic
    @Column(name = "DKFS")
    public String getDkfs() {
        return dkfs;
    }

    public void setDkfs(String dkfs) {
        this.dkfs = dkfs;
    }

    @Basic
    @Column(name = "FKSJ")
    public Time getFksj() {
        return fksj;
    }

    public void setFksj(Time fksj) {
        this.fksj = fksj;
    }

    @Basic
    @Column(name = "DJ")
    public Long getDj() {
        return dj;
    }

    public void setDj(Long dj) {
        this.dj = dj;
    }

    @Basic
    @Column(name = "FDCKFQYMC")
    public String getFdckfqymc() {
        return fdckfqymc;
    }

    public void setFdckfqymc(String fdckfqymc) {
        this.fdckfqymc = fdckfqymc;
    }

    @Basic
    @Column(name = "FDCKFQYDH")
    public String getFdckfqydh() {
        return fdckfqydh;
    }

    public void setFdckfqydh(String fdckfqydh) {
        this.fdckfqydh = fdckfqydh;
    }

    @Basic
    @Column(name = "FDCKFQYDZ")
    public String getFdckfqydz() {
        return fdckfqydz;
    }

    public void setFdckfqydz(String fdckfqydz) {
        this.fdckfqydz = fdckfqydz;
    }

    @Basic
    @Column(name = "HTCXRQ")
    public Time getHtcxrq() {
        return htcxrq;
    }

    public void setHtcxrq(Time htcxrq) {
        this.htcxrq = htcxrq;
    }

    @Basic
    @Column(name = "HTCXQRR")
    public String getHtcxqrr() {
        return htcxqrr;
    }

    public void setHtcxqrr(String htcxqrr) {
        this.htcxqrr = htcxqrr;
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
        FcjyXjspfXjspfyshtEntity that = (FcjyXjspfXjspfyshtEntity) o;
        return Objects.equals(htid, that.htid) &&
                Objects.equals(htbh, that.htbh) &&
                Objects.equals(hbh, that.hbh) &&
                Objects.equals(htzl, that.htzl) &&
                Objects.equals(xsfs, that.xsfs) &&
                Objects.equals(htqdrq, that.htqdrq) &&
                Objects.equals(htqrrq, that.htqrrq) &&
                Objects.equals(htqrr, that.htqrr) &&
                Objects.equals(jzmj, that.jzmj) &&
                Objects.equals(tnjzmj, that.tnjzmj) &&
                Objects.equals(htje, that.htje) &&
                Objects.equals(htbz, that.htbz) &&
                Objects.equals(jjfs, that.jjfs) &&
                Objects.equals(fklx, that.fklx) &&
                Objects.equals(dkfs, that.dkfs) &&
                Objects.equals(fksj, that.fksj) &&
                Objects.equals(dj, that.dj) &&
                Objects.equals(fdckfqymc, that.fdckfqymc) &&
                Objects.equals(fdckfqydh, that.fdckfqydh) &&
                Objects.equals(fdckfqydz, that.fdckfqydz) &&
                Objects.equals(htcxrq, that.htcxrq) &&
                Objects.equals(htcxqrr, that.htcxqrr) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(htid, htbh, hbh, htzl, xsfs, htqdrq, htqrrq, htqrr, jzmj, tnjzmj, htje, htbz, jjfs, fklx, dkfs, fksj, dj, fdckfqymc, fdckfqydh, fdckfqydz, htcxrq, htcxqrr, bz);
    }
}
