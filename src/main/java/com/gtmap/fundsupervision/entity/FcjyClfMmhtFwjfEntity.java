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
@Table(name = "FCJY_CLF_MMHT_FWJF", schema = "SCOTT", catalog = "")
public class FcjyClfMmhtFwjfEntity implements Serializable {
    private String id;
    private String htid;
    private String jffs;
    private Byte qdhjfr;
    private Byte mfycxjfr;
    private Byte mfsfkjfr;
    private Byte mfskjfr;
    private String qt;

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
    @Column(name = "JFFS")
    public String getJffs() {
        return jffs;
    }

    public void setJffs(String jffs) {
        this.jffs = jffs;
    }

    @Basic
    @Column(name = "QDHJFR")
    public Byte getQdhjfr() {
        return qdhjfr;
    }

    public void setQdhjfr(Byte qdhjfr) {
        this.qdhjfr = qdhjfr;
    }

    @Basic
    @Column(name = "MFYCXJFR")
    public Byte getMfycxjfr() {
        return mfycxjfr;
    }

    public void setMfycxjfr(Byte mfycxjfr) {
        this.mfycxjfr = mfycxjfr;
    }

    @Basic
    @Column(name = "MFSFKJFR")
    public Byte getMfsfkjfr() {
        return mfsfkjfr;
    }

    public void setMfsfkjfr(Byte mfsfkjfr) {
        this.mfsfkjfr = mfsfkjfr;
    }

    @Basic
    @Column(name = "MFSKJFR")
    public Byte getMfskjfr() {
        return mfskjfr;
    }

    public void setMfskjfr(Byte mfskjfr) {
        this.mfskjfr = mfskjfr;
    }

    @Basic
    @Column(name = "QT")
    public String getQt() {
        return qt;
    }

    public void setQt(String qt) {
        this.qt = qt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfMmhtFwjfEntity that = (FcjyClfMmhtFwjfEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(htid, that.htid) &&
                Objects.equals(jffs, that.jffs) &&
                Objects.equals(qdhjfr, that.qdhjfr) &&
                Objects.equals(mfycxjfr, that.mfycxjfr) &&
                Objects.equals(mfsfkjfr, that.mfsfkjfr) &&
                Objects.equals(mfskjfr, that.mfskjfr) &&
                Objects.equals(qt, that.qt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, htid, jffs, qdhjfr, mfycxjfr, mfsfkjfr, mfskjfr, qt);
    }
}
