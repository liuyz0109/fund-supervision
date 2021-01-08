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
@Table(name = "FCJY_CLF_MMHT_QTTK", schema = "SCOTT", catalog = "")
public class FcjyClfMmhtQttkEntity implements Serializable {
    private String id;
    private String htid;
    private String qtyd;
    private String wyzr;
    private String xyjcfs;
    private String xyjcqtsm;
    private String zyjjfs;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HTID")
    public String getHtid() {
        return htid;
    }

    public void setHtid(String htid) {
        this.htid = htid;
    }

    @Basic
    @Column(name = "QTYD")
    public String getQtyd() {
        return qtyd;
    }

    public void setQtyd(String qtyd) {
        this.qtyd = qtyd;
    }

    @Basic
    @Column(name = "WYZR")
    public String getWyzr() {
        return wyzr;
    }

    public void setWyzr(String wyzr) {
        this.wyzr = wyzr;
    }

    @Basic
    @Column(name = "XYJCFS")
    public String getXyjcfs() {
        return xyjcfs;
    }

    public void setXyjcfs(String xyjcfs) {
        this.xyjcfs = xyjcfs;
    }

    @Basic
    @Column(name = "XYJCQTSM")
    public String getXyjcqtsm() {
        return xyjcqtsm;
    }

    public void setXyjcqtsm(String xyjcqtsm) {
        this.xyjcqtsm = xyjcqtsm;
    }

    @Basic
    @Column(name = "ZYJJFS")
    public String getZyjjfs() {
        return zyjjfs;
    }

    public void setZyjjfs(String zyjjfs) {
        this.zyjjfs = zyjjfs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfMmhtQttkEntity that = (FcjyClfMmhtQttkEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(htid, that.htid) &&
                Objects.equals(qtyd, that.qtyd) &&
                Objects.equals(wyzr, that.wyzr) &&
                Objects.equals(xyjcfs, that.xyjcfs) &&
                Objects.equals(xyjcqtsm, that.xyjcqtsm) &&
                Objects.equals(zyjjfs, that.zyjjfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, htid, qtyd, wyzr, xyjcfs, xyjcqtsm, zyjjfs);
    }
}
