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
@Table(name = "FCJY_TJFX_XJSPFHXXXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxXjspfhxxxxEntity implements Serializable {
    private String id;
    private Long hh;
    private Long ldbh;
    private String sh;
    private Byte sjc;
    private String myc;
    private Long xfjzmj;
    private Long xftnjzmj;
    private Long xfgyjzmj;
    private Long qfjzmj;
    private Long qftnjzmj;
    private Long qfgyjzmj;
    private String hx;
    private String fwlx;
    private String rggy;
    private String fwxz;
    private String zt;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HH")
    public Long getHh() {
        return hh;
    }

    public void setHh(Long hh) {
        this.hh = hh;
    }

    @Basic
    @Column(name = "LDBH")
    public Long getLdbh() {
        return ldbh;
    }

    public void setLdbh(Long ldbh) {
        this.ldbh = ldbh;
    }

    @Basic
    @Column(name = "SH")
    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    @Basic
    @Column(name = "SJC")
    public Byte getSjc() {
        return sjc;
    }

    public void setSjc(Byte sjc) {
        this.sjc = sjc;
    }

    @Basic
    @Column(name = "MYC")
    public String getMyc() {
        return myc;
    }

    public void setMyc(String myc) {
        this.myc = myc;
    }

    @Basic
    @Column(name = "XFJZMJ")
    public Long getXfjzmj() {
        return xfjzmj;
    }

    public void setXfjzmj(Long xfjzmj) {
        this.xfjzmj = xfjzmj;
    }

    @Basic
    @Column(name = "XFTNJZMJ")
    public Long getXftnjzmj() {
        return xftnjzmj;
    }

    public void setXftnjzmj(Long xftnjzmj) {
        this.xftnjzmj = xftnjzmj;
    }

    @Basic
    @Column(name = "XFGYJZMJ")
    public Long getXfgyjzmj() {
        return xfgyjzmj;
    }

    public void setXfgyjzmj(Long xfgyjzmj) {
        this.xfgyjzmj = xfgyjzmj;
    }

    @Basic
    @Column(name = "QFJZMJ")
    public Long getQfjzmj() {
        return qfjzmj;
    }

    public void setQfjzmj(Long qfjzmj) {
        this.qfjzmj = qfjzmj;
    }

    @Basic
    @Column(name = "QFTNJZMJ")
    public Long getQftnjzmj() {
        return qftnjzmj;
    }

    public void setQftnjzmj(Long qftnjzmj) {
        this.qftnjzmj = qftnjzmj;
    }

    @Basic
    @Column(name = "QFGYJZMJ")
    public Long getQfgyjzmj() {
        return qfgyjzmj;
    }

    public void setQfgyjzmj(Long qfgyjzmj) {
        this.qfgyjzmj = qfgyjzmj;
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
    @Column(name = "FWLX")
    public String getFwlx() {
        return fwlx;
    }

    public void setFwlx(String fwlx) {
        this.fwlx = fwlx;
    }

    @Basic
    @Column(name = "RGGY")
    public String getRggy() {
        return rggy;
    }

    public void setRggy(String rggy) {
        this.rggy = rggy;
    }

    @Basic
    @Column(name = "FWXZ")
    public String getFwxz() {
        return fwxz;
    }

    public void setFwxz(String fwxz) {
        this.fwxz = fwxz;
    }

    @Basic
    @Column(name = "ZT")
    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxXjspfhxxxxEntity that = (FcjyTjfxXjspfhxxxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(hh, that.hh) &&
                Objects.equals(ldbh, that.ldbh) &&
                Objects.equals(sh, that.sh) &&
                Objects.equals(sjc, that.sjc) &&
                Objects.equals(myc, that.myc) &&
                Objects.equals(xfjzmj, that.xfjzmj) &&
                Objects.equals(xftnjzmj, that.xftnjzmj) &&
                Objects.equals(xfgyjzmj, that.xfgyjzmj) &&
                Objects.equals(qfjzmj, that.qfjzmj) &&
                Objects.equals(qftnjzmj, that.qftnjzmj) &&
                Objects.equals(qfgyjzmj, that.qfgyjzmj) &&
                Objects.equals(hx, that.hx) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(rggy, that.rggy) &&
                Objects.equals(fwxz, that.fwxz) &&
                Objects.equals(zt, that.zt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hh, ldbh, sh, sjc, myc, xfjzmj, xftnjzmj, xfgyjzmj, qfjzmj, qftnjzmj, qfgyjzmj, hx, fwlx, rggy, fwxz, zt);
    }
}
