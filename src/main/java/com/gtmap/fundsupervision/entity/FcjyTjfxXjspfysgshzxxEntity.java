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
@Table(name = "FCJY_TJFX_XJSPFYSGSHZXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxXjspfysgshzxxEntity implements Serializable {
    private String id;
    private String xmmc;
    private String xmdz;
    private Integer zts;
    private Long zmj;
    private String qxh;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "XMDZ")
    public String getXmdz() {
        return xmdz;
    }

    public void setXmdz(String xmdz) {
        this.xmdz = xmdz;
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

    @Basic
    @Column(name = "QXH")
    public String getQxh() {
        return qxh;
    }

    public void setQxh(String qxh) {
        this.qxh = qxh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxXjspfysgshzxxEntity that = (FcjyTjfxXjspfysgshzxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(xmdz, that.xmdz) &&
                Objects.equals(zts, that.zts) &&
                Objects.equals(zmj, that.zmj) &&
                Objects.equals(qxh, that.qxh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, xmmc, xmdz, zts, zmj, qxh);
    }
}
