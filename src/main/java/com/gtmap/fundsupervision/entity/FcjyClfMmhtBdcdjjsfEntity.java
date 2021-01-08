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
@Table(name = "FCJY_CLF_MMHT_BDCDJJSF", schema = "SCOTT", catalog = "")
public class FcjyClfMmhtBdcdjjsfEntity implements Serializable {
    private String id;
    private String htid;
    private Time bldjqx;
    private String sfzdsm;

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
    @Column(name = "BLDJQX")
    public Time getBldjqx() {
        return bldjqx;
    }

    public void setBldjqx(Time bldjqx) {
        this.bldjqx = bldjqx;
    }

    @Basic
    @Column(name = "SFZDSM")
    public String getSfzdsm() {
        return sfzdsm;
    }

    public void setSfzdsm(String sfzdsm) {
        this.sfzdsm = sfzdsm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfMmhtBdcdjjsfEntity that = (FcjyClfMmhtBdcdjjsfEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(htid, that.htid) &&
                Objects.equals(bldjqx, that.bldjqx) &&
                Objects.equals(sfzdsm, that.sfzdsm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, htid, bldjqx, sfzdsm);
    }
}
