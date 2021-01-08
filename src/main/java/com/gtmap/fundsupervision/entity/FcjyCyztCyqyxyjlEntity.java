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
@Table(name = "FCJY_CYZT_CYQYXYJL", schema = "SCOTT", catalog = "")
public class FcjyCyztCyqyxyjlEntity implements Serializable {
    private String xyjlid;
    private Long xyjlbh;
    private String xyjllx;
    private Long xyjlfz;
    private String qyid;
    private String jlry;
    private Time jlsj;
    private String bz;

    @Id
    @Column(name = "XYJLID")
    public String getXyjlid() {
        return xyjlid;
    }

    public void setXyjlid(String xyjlid) {
        this.xyjlid = xyjlid;
    }

    @Basic
    @Column(name = "XYJLBH")
    public Long getXyjlbh() {
        return xyjlbh;
    }

    public void setXyjlbh(Long xyjlbh) {
        this.xyjlbh = xyjlbh;
    }

    @Basic
    @Column(name = "XYJLLX")
    public String getXyjllx() {
        return xyjllx;
    }

    public void setXyjllx(String xyjllx) {
        this.xyjllx = xyjllx;
    }

    @Basic
    @Column(name = "XYJLFZ")
    public Long getXyjlfz() {
        return xyjlfz;
    }

    public void setXyjlfz(Long xyjlfz) {
        this.xyjlfz = xyjlfz;
    }

    @Basic
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    @Basic
    @Column(name = "JLRY")
    public String getJlry() {
        return jlry;
    }

    public void setJlry(String jlry) {
        this.jlry = jlry;
    }

    @Basic
    @Column(name = "JLSJ")
    public Time getJlsj() {
        return jlsj;
    }

    public void setJlsj(Time jlsj) {
        this.jlsj = jlsj;
    }

    @Basic
    @Column(name = "BZ")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyCyztCyqyxyjlEntity that = (FcjyCyztCyqyxyjlEntity) o;
        return Objects.equals(xyjlid, that.xyjlid) &&
                Objects.equals(xyjlbh, that.xyjlbh) &&
                Objects.equals(xyjllx, that.xyjllx) &&
                Objects.equals(xyjlfz, that.xyjlfz) &&
                Objects.equals(qyid, that.qyid) &&
                Objects.equals(jlry, that.jlry) &&
                Objects.equals(jlsj, that.jlsj) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xyjlid, xyjlbh, xyjllx, xyjlfz, qyid, jlry, jlsj, bz);
    }
}
