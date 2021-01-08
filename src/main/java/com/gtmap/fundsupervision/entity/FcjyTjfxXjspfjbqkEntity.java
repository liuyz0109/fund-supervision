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
@Table(name = "FCJY_TJFX_XJSPFJBQK", schema = "SCOTT", catalog = "")
public class FcjyTjfxXjspfjbqkEntity implements Serializable {
    private String id;
    private String qxh;
    private String bkh;
    private String xmdz;
    private String xmmc;
    private String fwlx;
    private String lpzt;
    private Long mj;
    private Long kpbh;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "BKH")
    public String getBkh() {
        return bkh;
    }

    public void setBkh(String bkh) {
        this.bkh = bkh;
    }

    @Basic
    @Column(name = "XMDZ")
    public String getXmdz() {
        return xmdz;
    }

    public void setXmdz(String xmdz) {
        this.xmdz = xmdz;
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
    @Column(name = "FWLX")
    public String getFwlx() {
        return fwlx;
    }

    public void setFwlx(String fwlx) {
        this.fwlx = fwlx;
    }

    @Basic
    @Column(name = "LPZT")
    public String getLpzt() {
        return lpzt;
    }

    public void setLpzt(String lpzt) {
        this.lpzt = lpzt;
    }

    @Basic
    @Column(name = "MJ")
    public Long getMj() {
        return mj;
    }

    public void setMj(Long mj) {
        this.mj = mj;
    }

    @Basic
    @Column(name = "KPBH")
    public Long getKpbh() {
        return kpbh;
    }

    public void setKpbh(Long kpbh) {
        this.kpbh = kpbh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxXjspfjbqkEntity that = (FcjyTjfxXjspfjbqkEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(bkh, that.bkh) &&
                Objects.equals(xmdz, that.xmdz) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(lpzt, that.lpzt) &&
                Objects.equals(mj, that.mj) &&
                Objects.equals(kpbh, that.kpbh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qxh, bkh, xmdz, xmmc, fwlx, lpzt, mj, kpbh);
    }
}
