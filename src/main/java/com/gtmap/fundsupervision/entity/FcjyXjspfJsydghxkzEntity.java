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
@Table(name = "FCJY_XJSPF_JSYDGHXKZ", schema = "SCOTT", catalog = "")
public class FcjyXjspfJsydghxkzEntity implements Serializable {
    private String xkzid;
    private Long xmbh;
    private String xmmc;
    private String xkzh;
    private Time fzrq;
    private Long zjsydmj;

    @Id
    @Column(name = "XKZID")
    public String getXkzid() {
        return xkzid;
    }

    public void setXkzid(String xkzid) {
        this.xkzid = xkzid;
    }

    @Basic
    @Column(name = "XMBH")
    public Long getXmbh() {
        return xmbh;
    }

    public void setXmbh(Long xmbh) {
        this.xmbh = xmbh;
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
    @Column(name = "XKZH")
    public String getXkzh() {
        return xkzh;
    }

    public void setXkzh(String xkzh) {
        this.xkzh = xkzh;
    }

    @Basic
    @Column(name = "FZRQ")
    public Time getFzrq() {
        return fzrq;
    }

    public void setFzrq(Time fzrq) {
        this.fzrq = fzrq;
    }

    @Basic
    @Column(name = "ZJSYDMJ")
    public Long getZjsydmj() {
        return zjsydmj;
    }

    public void setZjsydmj(Long zjsydmj) {
        this.zjsydmj = zjsydmj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyXjspfJsydghxkzEntity that = (FcjyXjspfJsydghxkzEntity) o;
        return Objects.equals(xkzid, that.xkzid) &&
                Objects.equals(xmbh, that.xmbh) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(xkzh, that.xkzh) &&
                Objects.equals(fzrq, that.fzrq) &&
                Objects.equals(zjsydmj, that.zjsydmj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xkzid, xmbh, xmmc, xkzh, fzrq, zjsydmj);
    }
}
