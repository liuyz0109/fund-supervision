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
@Table(name = "FCJY_CYZT_CYQYRYGLGX", schema = "SCOTT", catalog = "")
public class FcjyCyztCyqyryglgxEntity implements Serializable {
    private String qyid;
    private String ryid;
    private Long ryxh;
    private String zqyzzw;
    private Time jrqysj;
    private Time lkqysj;
    private String sfyx;

    @Id
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    @Basic
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
    }

    @Basic
    @Column(name = "RYXH")
    public Long getRyxh() {
        return ryxh;
    }

    public void setRyxh(Long ryxh) {
        this.ryxh = ryxh;
    }

    @Basic
    @Column(name = "ZQYZZW")
    public String getZqyzzw() {
        return zqyzzw;
    }

    public void setZqyzzw(String zqyzzw) {
        this.zqyzzw = zqyzzw;
    }

    @Basic
    @Column(name = "JRQYSJ")
    public Time getJrqysj() {
        return jrqysj;
    }

    public void setJrqysj(Time jrqysj) {
        this.jrqysj = jrqysj;
    }

    @Basic
    @Column(name = "LKQYSJ")
    public Time getLkqysj() {
        return lkqysj;
    }

    public void setLkqysj(Time lkqysj) {
        this.lkqysj = lkqysj;
    }

    @Basic
    @Column(name = "SFYX")
    public String getSfyx() {
        return sfyx;
    }

    public void setSfyx(String sfyx) {
        this.sfyx = sfyx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyCyztCyqyryglgxEntity that = (FcjyCyztCyqyryglgxEntity) o;
        return Objects.equals(qyid, that.qyid) &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(ryxh, that.ryxh) &&
                Objects.equals(zqyzzw, that.zqyzzw) &&
                Objects.equals(jrqysj, that.jrqysj) &&
                Objects.equals(lkqysj, that.lkqysj) &&
                Objects.equals(sfyx, that.sfyx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qyid, ryid, ryxh, zqyzzw, jrqysj, lkqysj, sfyx);
    }
}
