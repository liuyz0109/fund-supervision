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
@Table(name = "FCJY_CYZT_CYRYJBXX", schema = "SCOTT", catalog = "")
public class FcjyCyztCyryjbxxEntity implements Serializable {
    private String ryid;
    private Long rybh;
    private String rylb;
    private String xm;
    private String xb;
    private Time csrq;
    private String zjlx;
    private String zjhm;
    private String zjdz;
    private String zp;
    private String gjdq;
    private String sfcs;
    private String txdz;
    private String yzbm;
    private String yddh;
    private String lxdh;
    private String dzyj;
    private String sfzc;
    private String whcd;
    private String zslb;
    private String zzdj;
    private String sfcjjxjy;
    private String jxjyxgxx;
    private Time cjsj;
    private Time xgsj;
    private String sfyx;
    private String zyzsbh;
    private String cyryzt;
    private String bz;

    @Id
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
    }

    @Basic
    @Column(name = "RYBH")
    public Long getRybh() {
        return rybh;
    }

    public void setRybh(Long rybh) {
        this.rybh = rybh;
    }

    @Basic
    @Column(name = "RYLB")
    public String getRylb() {
        return rylb;
    }

    public void setRylb(String rylb) {
        this.rylb = rylb;
    }

    @Basic
    @Column(name = "XM")
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "XB")
    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    @Basic
    @Column(name = "CSRQ")
    public Time getCsrq() {
        return csrq;
    }

    public void setCsrq(Time csrq) {
        this.csrq = csrq;
    }

    @Basic
    @Column(name = "ZJLX")
    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    @Basic
    @Column(name = "ZJHM")
    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    @Basic
    @Column(name = "ZJDZ")
    public String getZjdz() {
        return zjdz;
    }

    public void setZjdz(String zjdz) {
        this.zjdz = zjdz;
    }

    @Basic
    @Column(name = "ZP")
    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }

    @Basic
    @Column(name = "GJDQ")
    public String getGjdq() {
        return gjdq;
    }

    public void setGjdq(String gjdq) {
        this.gjdq = gjdq;
    }

    @Basic
    @Column(name = "SFCS")
    public String getSfcs() {
        return sfcs;
    }

    public void setSfcs(String sfcs) {
        this.sfcs = sfcs;
    }

    @Basic
    @Column(name = "TXDZ")
    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    @Basic
    @Column(name = "YZBM")
    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    @Basic
    @Column(name = "YDDH")
    public String getYddh() {
        return yddh;
    }

    public void setYddh(String yddh) {
        this.yddh = yddh;
    }

    @Basic
    @Column(name = "LXDH")
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "DZYJ")
    public String getDzyj() {
        return dzyj;
    }

    public void setDzyj(String dzyj) {
        this.dzyj = dzyj;
    }

    @Basic
    @Column(name = "SFZC")
    public String getSfzc() {
        return sfzc;
    }

    public void setSfzc(String sfzc) {
        this.sfzc = sfzc;
    }

    @Basic
    @Column(name = "WHCD")
    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }

    @Basic
    @Column(name = "ZSLB")
    public String getZslb() {
        return zslb;
    }

    public void setZslb(String zslb) {
        this.zslb = zslb;
    }

    @Basic
    @Column(name = "ZZDJ")
    public String getZzdj() {
        return zzdj;
    }

    public void setZzdj(String zzdj) {
        this.zzdj = zzdj;
    }

    @Basic
    @Column(name = "SFCJJXJY")
    public String getSfcjjxjy() {
        return sfcjjxjy;
    }

    public void setSfcjjxjy(String sfcjjxjy) {
        this.sfcjjxjy = sfcjjxjy;
    }

    @Basic
    @Column(name = "JXJYXGXX")
    public String getJxjyxgxx() {
        return jxjyxgxx;
    }

    public void setJxjyxgxx(String jxjyxgxx) {
        this.jxjyxgxx = jxjyxgxx;
    }

    @Basic
    @Column(name = "CJSJ")
    public Time getCjsj() {
        return cjsj;
    }

    public void setCjsj(Time cjsj) {
        this.cjsj = cjsj;
    }

    @Basic
    @Column(name = "XGSJ")
    public Time getXgsj() {
        return xgsj;
    }

    public void setXgsj(Time xgsj) {
        this.xgsj = xgsj;
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
    @Column(name = "ZYZSBH")
    public String getZyzsbh() {
        return zyzsbh;
    }

    public void setZyzsbh(String zyzsbh) {
        this.zyzsbh = zyzsbh;
    }

    @Basic
    @Column(name = "CYRYZT")
    public String getCyryzt() {
        return cyryzt;
    }

    public void setCyryzt(String cyryzt) {
        this.cyryzt = cyryzt;
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
        FcjyCyztCyryjbxxEntity that = (FcjyCyztCyryjbxxEntity) o;
        return Objects.equals(ryid, that.ryid) &&
                Objects.equals(rybh, that.rybh) &&
                Objects.equals(rylb, that.rylb) &&
                Objects.equals(xm, that.xm) &&
                Objects.equals(xb, that.xb) &&
                Objects.equals(csrq, that.csrq) &&
                Objects.equals(zjlx, that.zjlx) &&
                Objects.equals(zjhm, that.zjhm) &&
                Objects.equals(zjdz, that.zjdz) &&
                Objects.equals(zp, that.zp) &&
                Objects.equals(gjdq, that.gjdq) &&
                Objects.equals(sfcs, that.sfcs) &&
                Objects.equals(txdz, that.txdz) &&
                Objects.equals(yzbm, that.yzbm) &&
                Objects.equals(yddh, that.yddh) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(dzyj, that.dzyj) &&
                Objects.equals(sfzc, that.sfzc) &&
                Objects.equals(whcd, that.whcd) &&
                Objects.equals(zslb, that.zslb) &&
                Objects.equals(zzdj, that.zzdj) &&
                Objects.equals(sfcjjxjy, that.sfcjjxjy) &&
                Objects.equals(jxjyxgxx, that.jxjyxgxx) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(xgsj, that.xgsj) &&
                Objects.equals(sfyx, that.sfyx) &&
                Objects.equals(zyzsbh, that.zyzsbh) &&
                Objects.equals(cyryzt, that.cyryzt) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ryid, rybh, rylb, xm, xb, csrq, zjlx, zjhm, zjdz, zp, gjdq, sfcs, txdz, yzbm, yddh, lxdh, dzyj, sfzc, whcd, zslb, zzdj, sfcjjxjy, jxjyxgxx, cjsj, xgsj, sfyx, zyzsbh, cyryzt, bz);
    }
}
