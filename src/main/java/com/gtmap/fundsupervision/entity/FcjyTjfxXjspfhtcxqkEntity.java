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
@Table(name = "FCJY_TJFX_XJSPFHTCXQK", schema = "SCOTT", catalog = "")
public class FcjyTjfxXjspfhtcxqkEntity implements Serializable {
    private String id;
    private String qxh;
    private String bkh;
    private String xmdz;
    private String xmmc;
    private String qymc;
    private Long htcxzcs;
    private Long ljzzhtcxcs;
    private Long ljhtcxjj;
    private Long ljzzhtcxjj;

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
    @Column(name = "QYMC")
    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    @Basic
    @Column(name = "HTCXZCS")
    public Long getHtcxzcs() {
        return htcxzcs;
    }

    public void setHtcxzcs(Long htcxzcs) {
        this.htcxzcs = htcxzcs;
    }

    @Basic
    @Column(name = "LJZZHTCXCS")
    public Long getLjzzhtcxcs() {
        return ljzzhtcxcs;
    }

    public void setLjzzhtcxcs(Long ljzzhtcxcs) {
        this.ljzzhtcxcs = ljzzhtcxcs;
    }

    @Basic
    @Column(name = "LJHTCXJJ")
    public Long getLjhtcxjj() {
        return ljhtcxjj;
    }

    public void setLjhtcxjj(Long ljhtcxjj) {
        this.ljhtcxjj = ljhtcxjj;
    }

    @Basic
    @Column(name = "LJZZHTCXJJ")
    public Long getLjzzhtcxjj() {
        return ljzzhtcxjj;
    }

    public void setLjzzhtcxjj(Long ljzzhtcxjj) {
        this.ljzzhtcxjj = ljzzhtcxjj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxXjspfhtcxqkEntity that = (FcjyTjfxXjspfhtcxqkEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(bkh, that.bkh) &&
                Objects.equals(xmdz, that.xmdz) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(qymc, that.qymc) &&
                Objects.equals(htcxzcs, that.htcxzcs) &&
                Objects.equals(ljzzhtcxcs, that.ljzzhtcxcs) &&
                Objects.equals(ljhtcxjj, that.ljhtcxjj) &&
                Objects.equals(ljzzhtcxjj, that.ljzzhtcxjj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qxh, bkh, xmdz, xmmc, qymc, htcxzcs, ljzzhtcxcs, ljhtcxjj, ljzzhtcxjj);
    }
}
