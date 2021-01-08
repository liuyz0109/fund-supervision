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
@Table(name = "FCJY_CLF_MMHT", schema = "SCOTT", catalog = "")
public class FcjyClfMmhtEntity implements Serializable {
    private String htid;
    private Long htbh;
    private String cqzh;
    private String hbh;
    private String fwzl;
    private String fwlx;
    private String fwjg;
    private String hx;
    private Long jzmj;
    private Long tnjzmj;
    private Long jg;
    private String htbz;
    private String fklx;
    private String dkfs;
    private Time fksj;
    private Time qdrq;
    private Time qrsj;
    private Time qrqzsj;
    private Time zhbgtgsj;
    private Time cxsj;
    private Time jssj;
    private String zt;
    private String sfyx;
    private String wqrxm;
    private String bdcdjblzt;
    private Time barq;

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
    @Column(name = "CQZH")
    public String getCqzh() {
        return cqzh;
    }

    public void setCqzh(String cqzh) {
        this.cqzh = cqzh;
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
    @Column(name = "JG")
    public Long getJg() {
        return jg;
    }

    public void setJg(Long jg) {
        this.jg = jg;
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
    @Column(name = "QDRQ")
    public Time getQdrq() {
        return qdrq;
    }

    public void setQdrq(Time qdrq) {
        this.qdrq = qdrq;
    }

    @Basic
    @Column(name = "QRSJ")
    public Time getQrsj() {
        return qrsj;
    }

    public void setQrsj(Time qrsj) {
        this.qrsj = qrsj;
    }

    @Basic
    @Column(name = "QRQZSJ")
    public Time getQrqzsj() {
        return qrqzsj;
    }

    public void setQrqzsj(Time qrqzsj) {
        this.qrqzsj = qrqzsj;
    }

    @Basic
    @Column(name = "ZHBGTGSJ")
    public Time getZhbgtgsj() {
        return zhbgtgsj;
    }

    public void setZhbgtgsj(Time zhbgtgsj) {
        this.zhbgtgsj = zhbgtgsj;
    }

    @Basic
    @Column(name = "CXSJ")
    public Time getCxsj() {
        return cxsj;
    }

    public void setCxsj(Time cxsj) {
        this.cxsj = cxsj;
    }

    @Basic
    @Column(name = "JSSJ")
    public Time getJssj() {
        return jssj;
    }

    public void setJssj(Time jssj) {
        this.jssj = jssj;
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
    @Column(name = "WQRXM")
    public String getWqrxm() {
        return wqrxm;
    }

    public void setWqrxm(String wqrxm) {
        this.wqrxm = wqrxm;
    }

    @Basic
    @Column(name = "BDCDJBLZT")
    public String getBdcdjblzt() {
        return bdcdjblzt;
    }

    public void setBdcdjblzt(String bdcdjblzt) {
        this.bdcdjblzt = bdcdjblzt;
    }

    @Basic
    @Column(name = "BARQ")
    public Time getBarq() {
        return barq;
    }

    public void setBarq(Time barq) {
        this.barq = barq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfMmhtEntity that = (FcjyClfMmhtEntity) o;
        return Objects.equals(htid, that.htid) &&
                Objects.equals(htbh, that.htbh) &&
                Objects.equals(cqzh, that.cqzh) &&
                Objects.equals(hbh, that.hbh) &&
                Objects.equals(fwzl, that.fwzl) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(fwjg, that.fwjg) &&
                Objects.equals(hx, that.hx) &&
                Objects.equals(jzmj, that.jzmj) &&
                Objects.equals(tnjzmj, that.tnjzmj) &&
                Objects.equals(jg, that.jg) &&
                Objects.equals(htbz, that.htbz) &&
                Objects.equals(fklx, that.fklx) &&
                Objects.equals(dkfs, that.dkfs) &&
                Objects.equals(fksj, that.fksj) &&
                Objects.equals(qdrq, that.qdrq) &&
                Objects.equals(qrsj, that.qrsj) &&
                Objects.equals(qrqzsj, that.qrqzsj) &&
                Objects.equals(zhbgtgsj, that.zhbgtgsj) &&
                Objects.equals(cxsj, that.cxsj) &&
                Objects.equals(jssj, that.jssj) &&
                Objects.equals(zt, that.zt) &&
                Objects.equals(sfyx, that.sfyx) &&
                Objects.equals(wqrxm, that.wqrxm) &&
                Objects.equals(bdcdjblzt, that.bdcdjblzt) &&
                Objects.equals(barq, that.barq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(htid, htbh, cqzh, hbh, fwzl, fwlx, fwjg, hx, jzmj, tnjzmj, jg, htbz, fklx, dkfs, fksj, qdrq, qrsj, qrqzsj, zhbgtgsj, cxsj, jssj, zt, sfyx, wqrxm, bdcdjblzt, barq);
    }
}
