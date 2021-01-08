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
@Table(name = "FCJY_TJFX_XJSPFXSXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxXjspfxsxxEntity implements Serializable {
    private String id;
    private String qxh;
    private String bkh;
    private String xmdz;
    private String xmmc;
    private String fwlx;
    private Long cjjj;
    private Long jzmj;
    private Integer ts;
    private Long ljjj;
    private Long ljzzjj;

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
    @Column(name = "CJJJ")
    public Long getCjjj() {
        return cjjj;
    }

    public void setCjjj(Long cjjj) {
        this.cjjj = cjjj;
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
    @Column(name = "TS")
    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    @Basic
    @Column(name = "LJJJ")
    public Long getLjjj() {
        return ljjj;
    }

    public void setLjjj(Long ljjj) {
        this.ljjj = ljjj;
    }

    @Basic
    @Column(name = "LJZZJJ")
    public Long getLjzzjj() {
        return ljzzjj;
    }

    public void setLjzzjj(Long ljzzjj) {
        this.ljzzjj = ljzzjj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxXjspfxsxxEntity that = (FcjyTjfxXjspfxsxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(bkh, that.bkh) &&
                Objects.equals(xmdz, that.xmdz) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(cjjj, that.cjjj) &&
                Objects.equals(jzmj, that.jzmj) &&
                Objects.equals(ts, that.ts) &&
                Objects.equals(ljjj, that.ljjj) &&
                Objects.equals(ljzzjj, that.ljzzjj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qxh, bkh, xmdz, xmmc, fwlx, cjjj, jzmj, ts, ljjj, ljzzjj);
    }
}
