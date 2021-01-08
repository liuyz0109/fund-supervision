package com.gtmap.fundsupervision.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description 资金监管协议
 */
@Entity
@Table(name = "FCJY_CLF_ZJJGXY", schema = "SCOTT")
public class FcjyClfZjjgxyEntity implements Serializable {
    private String jgid;
    private Long jgbh;
    private String jgfwjgbh;
    private String jgfwjgmc;
    private String jgfwrybh;
    private String hbzl;
    private double htzje;
    private double zjgje;
    private double msrzyzjje;
    private double msrdkje;
    private Date zyzjjkqx;
    private double gjjdkje;
    private double sydkje;
    private Date qdxyrq;
    private String msrmm;
    private String cmrmm;
    private String cmrdyjyzt;
    private Date cxsj;
    private Date gdsj;
    private String zt;
    private String sfyx;
    private String bz;

    @Id
    @Column(name = "JGID")
    public String getJgid() {
        return jgid;
    }

    public void setJgid(String jgid) {
        this.jgid = jgid;
    }

    @Basic
    @Column(name = "JGBH")
    public Long getJgbh() {
        return jgbh;
    }

    public void setJgbh(Long jgbh) {
        this.jgbh = jgbh;
    }

    @Basic
    @Column(name = "JGFWJGBH")
    public String getJgfwjgbh() {
        return jgfwjgbh;
    }

    public void setJgfwjgbh(String jgfwjgbh) {
        this.jgfwjgbh = jgfwjgbh;
    }

    @Basic
    @Column(name = "JGFWJGMC")
    public String getJgfwjgmc() {
        return jgfwjgmc;
    }

    public void setJgfwjgmc(String jgfwjgmc) {
        this.jgfwjgmc = jgfwjgmc;
    }

    @Basic
    @Column(name = "JGFWRYBH")
    public String getJgfwrybh() {
        return jgfwrybh;
    }

    public void setJgfwrybh(String jgfwrybh) {
        this.jgfwrybh = jgfwrybh;
    }

    @Basic
    @Column(name = "HBZL")
    public String getHbzl() {
        return hbzl;
    }

    public void setHbzl(String hbzl) {
        this.hbzl = hbzl;
    }

    @Basic
    @Column(name = "HTZJE")
    public double getHtzje() {
        return htzje;
    }

    public void setHtzje(double htzje) {
        this.htzje = htzje;
    }

    @Basic
    @Column(name = "ZJGJE")
    public double getZjgje() {
        return zjgje;
    }

    public void setZjgje(double zjgje) {
        this.zjgje = zjgje;
    }

    @Basic
    @Column(name = "MSRZYZJJE")
    public double getMsrzyzjje() {
        return msrzyzjje;
    }

    public void setMsrzyzjje(double msrzyzjje) {
        this.msrzyzjje = msrzyzjje;
    }

    @Basic
    @Column(name = "MSRDKJE")
    public double getMsrdkje() {
        return msrdkje;
    }

    public void setMsrdkje(double msrdkje) {
        this.msrdkje = msrdkje;
    }

    @Basic
    @Column(name = "ZYZJJKQX")
    public Date getZyzjjkqx() {
        return zyzjjkqx;
    }

    public void setZyzjjkqx(Date zyzjjkqx) {
        this.zyzjjkqx = zyzjjkqx;
    }

    @Basic
    @Column(name = "GJJDKJE")
    public double getGjjdkje() {
        return gjjdkje;
    }

    public void setGjjdkje(double gjjdkje) {
        this.gjjdkje = gjjdkje;
    }

    @Basic
    @Column(name = "SYDKJE")
    public double getSydkje() {
        return sydkje;
    }

    public void setSydkje(double sydkje) {
        this.sydkje = sydkje;
    }

    @Basic
    @Column(name = "QDXYRQ")
    public Date getQdxyrq() {
        return qdxyrq;
    }

    public void setQdxyrq(Date qdxyrq) {
        this.qdxyrq = qdxyrq;
    }

    @Basic
    @Column(name = "MSRMM")
    public String getMsrmm() {
        return msrmm;
    }

    public void setMsrmm(String msrmm) {
        this.msrmm = msrmm;
    }

    @Basic
    @Column(name = "CMRMM")
    public String getCmrmm() {
        return cmrmm;
    }

    public void setCmrmm(String cmrmm) {
        this.cmrmm = cmrmm;
    }

    @Basic
    @Column(name = "CMRDYJYZT")
    public String getCmrdyjyzt() {
        return cmrdyjyzt;
    }

    public void setCmrdyjyzt(String cmrdyjyzt) {
        this.cmrdyjyzt = cmrdyjyzt;
    }

    @Basic
    @Column(name = "CXSJ")
    public Date getCxsj() {
        return cxsj;
    }

    public void setCxsj(Date cxsj) {
        this.cxsj = cxsj;
    }

    @Basic
    @Column(name = "GDSJ")
    public Date getGdsj() {
        return gdsj;
    }

    public void setGdsj(Date gdsj) {
        this.gdsj = gdsj;
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
        FcjyClfZjjgxyEntity that = (FcjyClfZjjgxyEntity) o;
        return Objects.equals(jgid, that.jgid) &&
                Objects.equals(jgbh, that.jgbh) &&
                Objects.equals(jgfwjgbh, that.jgfwjgbh) &&
                Objects.equals(jgfwjgmc, that.jgfwjgmc) &&
                Objects.equals(jgfwrybh, that.jgfwrybh) &&
                Objects.equals(hbzl, that.hbzl) &&
                Objects.equals(htzje, that.htzje) &&
                Objects.equals(zjgje, that.zjgje) &&
                Objects.equals(msrzyzjje, that.msrzyzjje) &&
                Objects.equals(msrdkje, that.msrdkje) &&
                Objects.equals(zyzjjkqx, that.zyzjjkqx) &&
                Objects.equals(gjjdkje, that.gjjdkje) &&
                Objects.equals(sydkje, that.sydkje) &&
                Objects.equals(qdxyrq, that.qdxyrq) &&
                Objects.equals(msrmm, that.msrmm) &&
                Objects.equals(cmrmm, that.cmrmm) &&
                Objects.equals(cmrdyjyzt, that.cmrdyjyzt) &&
                Objects.equals(cxsj, that.cxsj) &&
                Objects.equals(gdsj, that.gdsj) &&
                Objects.equals(zt, that.zt) &&
                Objects.equals(sfyx, that.sfyx) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jgid, jgbh, jgfwjgbh, jgfwjgmc, jgfwrybh, hbzl, htzje, zjgje, msrzyzjje, msrdkje, zyzjjkqx, gjjdkje, sydkje, qdxyrq, msrmm, cmrmm, cmrdyjyzt, cxsj, gdsj, zt, sfyx, bz);
    }
}
