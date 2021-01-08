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
@Table(name = "FCJY_TJFX_XJSPFZXX", schema = "SCOTT")
public class FcjyTjfxXjspfzxxEntity implements Serializable {
    private String id;
    private Long ldbh;
    private String ldmc;
    private String xmmc;
    private Long kpbh;
    private Long ckjg;
    private Integer zksts;
    private Long zksmj;
    private Integer zts;
    private Long zmj;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "LDMC")
    public String getLdmc() {
        return ldmc;
    }

    public void setLdmc(String ldmc) {
        this.ldmc = ldmc;
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
    @Column(name = "KPBH")
    public Long getKpbh() {
        return kpbh;
    }

    public void setKpbh(Long kpbh) {
        this.kpbh = kpbh;
    }

    @Basic
    @Column(name = "CKJG")
    public Long getCkjg() {
        return ckjg;
    }

    public void setCkjg(Long ckjg) {
        this.ckjg = ckjg;
    }

    @Basic
    @Column(name = "ZKSTS")
    public Integer getZksts() {
        return zksts;
    }

    public void setZksts(Integer zksts) {
        this.zksts = zksts;
    }

    @Basic
    @Column(name = "ZKSMJ")
    public Long getZksmj() {
        return zksmj;
    }

    public void setZksmj(Long zksmj) {
        this.zksmj = zksmj;
    }

    @Basic
    @Column(name = "ZTS")
    public Integer getZts() {
        return zts;
    }

    public void setZts(Integer zts) {
        this.zts = zts;
    }

    @Basic
    @Column(name = "ZMJ")
    public Long getZmj() {
        return zmj;
    }

    public void setZmj(Long zmj) {
        this.zmj = zmj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxXjspfzxxEntity that = (FcjyTjfxXjspfzxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ldbh, that.ldbh) &&
                Objects.equals(ldmc, that.ldmc) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(kpbh, that.kpbh) &&
                Objects.equals(ckjg, that.ckjg) &&
                Objects.equals(zksts, that.zksts) &&
                Objects.equals(zksmj, that.zksmj) &&
                Objects.equals(zts, that.zts) &&
                Objects.equals(zmj, that.zmj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ldbh, ldmc, xmmc, kpbh, ckjg, zksts, zksmj, zts, zmj);
    }
}
