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
@Table(name = "FCJY_TJFX_XJSPFZXSXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxXjspfzxsxxEntity implements Serializable {
    private String id;
    private Long ldbh;
    private String ldmc;
    private String xmmc;
    private Long kpbh;
    private Long ckjg;
    private Integer ksts;
    private Long ksmj;
    private Integer ydts;
    private Long ydmj;
    private Integer djts;
    private Long djmj;

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
    @Column(name = "KSTS")
    public Integer getKsts() {
        return ksts;
    }

    public void setKsts(Integer ksts) {
        this.ksts = ksts;
    }

    @Basic
    @Column(name = "KSMJ")
    public Long getKsmj() {
        return ksmj;
    }

    public void setKsmj(Long ksmj) {
        this.ksmj = ksmj;
    }

    @Basic
    @Column(name = "YDTS")
    public Integer getYdts() {
        return ydts;
    }

    public void setYdts(Integer ydts) {
        this.ydts = ydts;
    }

    @Basic
    @Column(name = "YDMJ")
    public Long getYdmj() {
        return ydmj;
    }

    public void setYdmj(Long ydmj) {
        this.ydmj = ydmj;
    }

    @Basic
    @Column(name = "DJTS")
    public Integer getDjts() {
        return djts;
    }

    public void setDjts(Integer djts) {
        this.djts = djts;
    }

    @Basic
    @Column(name = "DJMJ")
    public Long getDjmj() {
        return djmj;
    }

    public void setDjmj(Long djmj) {
        this.djmj = djmj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxXjspfzxsxxEntity that = (FcjyTjfxXjspfzxsxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ldbh, that.ldbh) &&
                Objects.equals(ldmc, that.ldmc) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(kpbh, that.kpbh) &&
                Objects.equals(ckjg, that.ckjg) &&
                Objects.equals(ksts, that.ksts) &&
                Objects.equals(ksmj, that.ksmj) &&
                Objects.equals(ydts, that.ydts) &&
                Objects.equals(ydmj, that.ydmj) &&
                Objects.equals(djts, that.djts) &&
                Objects.equals(djmj, that.djmj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ldbh, ldmc, xmmc, kpbh, ckjg, ksts, ksmj, ydts, ydmj, djts, djmj);
    }
}
