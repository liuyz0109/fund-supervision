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
@Table(name = "FCJY_TJFX_CLFZSJBXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxClfzsjbxxEntity implements Serializable {
    private String id;
    private String qxh;
    private Long zj;
    private Long mj;
    private String fwlx;
    private String fwzl;
    private String lc;
    private String cx;

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
    @Column(name = "ZJ")
    public Long getZj() {
        return zj;
    }

    public void setZj(Long zj) {
        this.zj = zj;
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
    @Column(name = "FWLX")
    public String getFwlx() {
        return fwlx;
    }

    public void setFwlx(String fwlx) {
        this.fwlx = fwlx;
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
    @Column(name = "LC")
    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    @Basic
    @Column(name = "CX")
    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxClfzsjbxxEntity that = (FcjyTjfxClfzsjbxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(zj, that.zj) &&
                Objects.equals(mj, that.mj) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(fwzl, that.fwzl) &&
                Objects.equals(lc, that.lc) &&
                Objects.equals(cx, that.cx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qxh, zj, mj, fwlx, fwzl, lc, cx);
    }
}
