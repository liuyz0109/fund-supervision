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
@Table(name = "FCJY_TJFX_CLFJYXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxClfjyxxEntity implements Serializable {
    private String id;
    private Long hbh;
    private String cqzh;
    private String qxh;
    private String fwzl;
    private String shbw;
    private String fwlx;
    private String jzjg;
    private String hx;
    private Long jzmj;
    private Long tnjzmj;
    private Long jg;
    private String zt;
    private String sfyx;
    private String czry;
    private Time czrq;
    private Time zhxgsj;
    private Time qrsj;
    private Time qrqzsj;
    private Time zhbgtgsj;
    private Time cxsj;
    private Time jssj;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HBH")
    public Long getHbh() {
        return hbh;
    }

    public void setHbh(Long hbh) {
        this.hbh = hbh;
    }

    @Basic
    @Column(name = "CQZH")
    public String getCqzh() {
        return cqzh;
    }

    public void setCqzh(String cqzh) {
        this.cqzh = cqzh;
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
    @Column(name = "FWZL")
    public String getFwzl() {
        return fwzl;
    }

    public void setFwzl(String fwzl) {
        this.fwzl = fwzl;
    }

    @Basic
    @Column(name = "SHBW")
    public String getShbw() {
        return shbw;
    }

    public void setShbw(String shbw) {
        this.shbw = shbw;
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
    @Column(name = "JZJG")
    public String getJzjg() {
        return jzjg;
    }

    public void setJzjg(String jzjg) {
        this.jzjg = jzjg;
    }

    @Basic
    @Column(name = "HX")
    public String getHx() {
        return hx;
    }

    public void setHx(String hx) {
        this.hx = hx;
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
    @Column(name = "TNJZMJ")
    public Long getTnjzmj() {
        return tnjzmj;
    }

    public void setTnjzmj(Long tnjzmj) {
        this.tnjzmj = tnjzmj;
    }

    @Basic
    @Column(name = "JG")
    public Long getJg() {
        return jg;
    }

    public void setJg(Long jg) {
        this.jg = jg;
    }

    @Basic
    @Column(name = "ZT")
    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    @Basic
    @Column(name = "SFYX")
    public String getSfyx() {
        return sfyx;
    }

    public void setSfyx(String sfyx) {
        this.sfyx = sfyx;
    }

    @Basic
    @Column(name = "CZRY")
    public String getCzry() {
        return czry;
    }

    public void setCzry(String czry) {
        this.czry = czry;
    }

    @Basic
    @Column(name = "CZRQ")
    public Time getCzrq() {
        return czrq;
    }

    public void setCzrq(Time czrq) {
        this.czrq = czrq;
    }

    @Basic
    @Column(name = "ZHXGSJ")
    public Time getZhxgsj() {
        return zhxgsj;
    }

    public void setZhxgsj(Time zhxgsj) {
        this.zhxgsj = zhxgsj;
    }

    @Basic
    @Column(name = "QRSJ")
    public Time getQrsj() {
        return qrsj;
    }

    public void setQrsj(Time qrsj) {
        this.qrsj = qrsj;
    }

    @Basic
    @Column(name = "QRQZSJ")
    public Time getQrqzsj() {
        return qrqzsj;
    }

    public void setQrqzsj(Time qrqzsj) {
        this.qrqzsj = qrqzsj;
    }

    @Basic
    @Column(name = "ZHBGTGSJ")
    public Time getZhbgtgsj() {
        return zhbgtgsj;
    }

    public void setZhbgtgsj(Time zhbgtgsj) {
        this.zhbgtgsj = zhbgtgsj;
    }

    @Basic
    @Column(name = "CXSJ")
    public Time getCxsj() {
        return cxsj;
    }

    public void setCxsj(Time cxsj) {
        this.cxsj = cxsj;
    }

    @Basic
    @Column(name = "JSSJ")
    public Time getJssj() {
        return jssj;
    }

    public void setJssj(Time jssj) {
        this.jssj = jssj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxClfjyxxEntity that = (FcjyTjfxClfjyxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(hbh, that.hbh) &&
                Objects.equals(cqzh, that.cqzh) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(fwzl, that.fwzl) &&
                Objects.equals(shbw, that.shbw) &&
                Objects.equals(fwlx, that.fwlx) &&
                Objects.equals(jzjg, that.jzjg) &&
                Objects.equals(hx, that.hx) &&
                Objects.equals(jzmj, that.jzmj) &&
                Objects.equals(tnjzmj, that.tnjzmj) &&
                Objects.equals(jg, that.jg) &&
                Objects.equals(zt, that.zt) &&
                Objects.equals(sfyx, that.sfyx) &&
                Objects.equals(czry, that.czry) &&
                Objects.equals(czrq, that.czrq) &&
                Objects.equals(zhxgsj, that.zhxgsj) &&
                Objects.equals(qrsj, that.qrsj) &&
                Objects.equals(qrqzsj, that.qrqzsj) &&
                Objects.equals(zhbgtgsj, that.zhbgtgsj) &&
                Objects.equals(cxsj, that.cxsj) &&
                Objects.equals(jssj, that.jssj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hbh, cqzh, qxh, fwzl, shbw, fwlx, jzjg, hx, jzmj, tnjzmj, jg, zt, sfyx, czry, czrq, zhxgsj, qrsj, qrqzsj, zhbgtgsj, cxsj, jssj);
    }
}
