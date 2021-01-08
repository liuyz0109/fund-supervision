package com.gtmap.fundsupervision.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description
 */
@Entity
@Table(name = "FCJY_CLF_ZJJGCZJL", schema = "SCOTT")
public class FcjyClfZjjgczjlEntity implements Serializable {
    private String czjlid;
    private Long czjlbh;
    private String jgid;
    private String zhbh;
    private String hkzlbh;
    private double je;
    private String bz1;
    private String skfxm;
    private String skfzh;
    private String skfyhmc;
    private String skfyhjhh;
    private Date hkrq;
    private Date sjczsj;
    private String zlzt;
    private String hktj;
    private String fhqk;
    private String fhbz;
    private String fhr;
    private String fhrxm;
    private Date fhsj;
    private String shqk;
    private String shr;
    private String shrxm;
    private Date shsj;
    private String jsgsbh;
    private String jgyhbh;
    private String zjsxbh;
    private String czrxm;
    private String sfyx;
    private String bz2;

    @Id
    @Column(name = "CZJLID")
    public String getCzjlid() {
        return czjlid;
    }

    public void setCzjlid(String czjlid) {
        this.czjlid = czjlid;
    }

    @Basic
    @Column(name = "CZJLBH")
    public Long getCzjlbh() {
        return czjlbh;
    }

    public void setCzjlbh(Long czjlbh) {
        this.czjlbh = czjlbh;
    }

    @Basic
    @Column(name = "JGID")
    public String getJgid() {
        return jgid;
    }

    public void setJgid(String jgid) {
        this.jgid = jgid;
    }

    @Basic
    @Column(name = "ZHBH")
    public String getZhbh() {
        return zhbh;
    }

    public void setZhbh(String zhbh) {
        this.zhbh = zhbh;
    }

    @Basic
    @Column(name = "HKZLBH")
    public String getHkzlbh() {
        return hkzlbh;
    }

    public void setHkzlbh(String hkzlbh) {
        this.hkzlbh = hkzlbh;
    }

    @Basic
    @Column(name = "JE")
    public double getJe() {
        return je;
    }

    public void setJe(double je) {
        this.je = je;
    }

    @Basic
    @Column(name = "BZ1")
    public String getBz1() {
        return bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1;
    }

    @Basic
    @Column(name = "SKFXM")
    public String getSkfxm() {
        return skfxm;
    }

    public void setSkfxm(String skfxm) {
        this.skfxm = skfxm;
    }

    @Basic
    @Column(name = "SKFZH")
    public String getSkfzh() {
        return skfzh;
    }

    public void setSkfzh(String skfzh) {
        this.skfzh = skfzh;
    }

    @Basic
    @Column(name = "SKFYHMC")
    public String getSkfyhmc() {
        return skfyhmc;
    }

    public void setSkfyhmc(String skfyhmc) {
        this.skfyhmc = skfyhmc;
    }

    @Basic
    @Column(name = "SKFYHJHH")
    public String getSkfyhjhh() {
        return skfyhjhh;
    }

    public void setSkfyhjhh(String skfyhjhh) {
        this.skfyhjhh = skfyhjhh;
    }

    @Basic
    @Column(name = "HKRQ")
    public Date getHkrq() {
        return hkrq;
    }

    public void setHkrq(Date hkrq) {
        this.hkrq = hkrq;
    }

    @Basic
    @Column(name = "SJCZSJ")
    public Date getSjczsj() {
        return sjczsj;
    }

    public void setSjczsj(Date sjczsj) {
        this.sjczsj = sjczsj;
    }

    @Basic
    @Column(name = "ZLZT")
    public String getZlzt() {
        return zlzt;
    }

    public void setZlzt(String zlzt) {
        this.zlzt = zlzt;
    }

    @Basic
    @Column(name = "HKTJ")
    public String getHktj() {
        return hktj;
    }

    public void setHktj(String hktj) {
        this.hktj = hktj;
    }

    @Basic
    @Column(name = "FHQK")
    public String getFhqk() {
        return fhqk;
    }

    public void setFhqk(String fhqk) {
        this.fhqk = fhqk;
    }

    @Basic
    @Column(name = "FHBZ")
    public String getFhbz() {
        return fhbz;
    }

    public void setFhbz(String fhbz) {
        this.fhbz = fhbz;
    }

    @Basic
    @Column(name = "FHR")
    public String getFhr() {
        return fhr;
    }

    public void setFhr(String fhr) {
        this.fhr = fhr;
    }

    @Basic
    @Column(name = "FHRXM")
    public String getFhrxm() {
        return fhrxm;
    }

    public void setFhrxm(String fhrxm) {
        this.fhrxm = fhrxm;
    }

    @Basic
    @Column(name = "FHSJ")
    public Date getFhsj() {
        return fhsj;
    }

    public void setFhsj(Date fhsj) {
        this.fhsj = fhsj;
    }

    @Basic
    @Column(name = "SHQK")
    public String getShqk() {
        return shqk;
    }

    public void setShqk(String shqk) {
        this.shqk = shqk;
    }

    @Basic
    @Column(name = "SHR")
    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    @Basic
    @Column(name = "SHRXM")
    public String getShrxm() {
        return shrxm;
    }

    public void setShrxm(String shrxm) {
        this.shrxm = shrxm;
    }

    @Basic
    @Column(name = "SHSJ")
    public Date getShsj() {
        return shsj;
    }

    public void setShsj(Date shsj) {
        this.shsj = shsj;
    }

    @Basic
    @Column(name = "JSGSBH")
    public String getJsgsbh() {
        return jsgsbh;
    }

    public void setJsgsbh(String jsgsbh) {
        this.jsgsbh = jsgsbh;
    }

    @Basic
    @Column(name = "JGYHBH")
    public String getJgyhbh() {
        return jgyhbh;
    }

    public void setJgyhbh(String jgyhbh) {
        this.jgyhbh = jgyhbh;
    }

    @Basic
    @Column(name = "ZJSXBH")
    public String getZjsxbh() {
        return zjsxbh;
    }

    public void setZjsxbh(String zjsxbh) {
        this.zjsxbh = zjsxbh;
    }

    @Basic
    @Column(name = "CZRXM")
    public String getCzrxm() {
        return czrxm;
    }

    public void setCzrxm(String czrxm) {
        this.czrxm = czrxm;
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
    @Column(name = "BZ2")
    public String getBz2() {
        return bz2;
    }

    public void setBz2(String bz2) {
        this.bz2 = bz2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfZjjgczjlEntity that = (FcjyClfZjjgczjlEntity) o;
        return Objects.equals(czjlid, that.czjlid) &&
                Objects.equals(czjlbh, that.czjlbh) &&
                Objects.equals(jgid, that.jgid) &&
                Objects.equals(zhbh, that.zhbh) &&
                Objects.equals(hkzlbh, that.hkzlbh) &&
                Objects.equals(je, that.je) &&
                Objects.equals(bz1, that.bz1) &&
                Objects.equals(skfxm, that.skfxm) &&
                Objects.equals(skfzh, that.skfzh) &&
                Objects.equals(skfyhmc, that.skfyhmc) &&
                Objects.equals(skfyhjhh, that.skfyhjhh) &&
                Objects.equals(hkrq, that.hkrq) &&
                Objects.equals(sjczsj, that.sjczsj) &&
                Objects.equals(zlzt, that.zlzt) &&
                Objects.equals(hktj, that.hktj) &&
                Objects.equals(fhqk, that.fhqk) &&
                Objects.equals(fhbz, that.fhbz) &&
                Objects.equals(fhr, that.fhr) &&
                Objects.equals(fhrxm, that.fhrxm) &&
                Objects.equals(fhsj, that.fhsj) &&
                Objects.equals(shqk, that.shqk) &&
                Objects.equals(shr, that.shr) &&
                Objects.equals(shrxm, that.shrxm) &&
                Objects.equals(shsj, that.shsj) &&
                Objects.equals(jsgsbh, that.jsgsbh) &&
                Objects.equals(jgyhbh, that.jgyhbh) &&
                Objects.equals(zjsxbh, that.zjsxbh) &&
                Objects.equals(czrxm, that.czrxm) &&
                Objects.equals(sfyx, that.sfyx) &&
                Objects.equals(bz2, that.bz2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(czjlid, czjlbh, jgid, zhbh, hkzlbh, je, bz1, skfxm, skfzh, skfyhmc, skfyhjhh, hkrq, sjczsj, zlzt, hktj, fhqk, fhbz, fhr, fhrxm, fhsj, shqk, shr, shrxm, shsj, jsgsbh, jgyhbh, zjsxbh, czrxm, sfyx, bz2);
    }
}
