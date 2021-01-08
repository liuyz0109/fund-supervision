package com.gtmap.fundsupervision.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description
 */
@Entity
@Table(name = "FCJY_CLF_ZJJGZH", schema = "SCOTT")
public class FcjyClfZjjgzhEntity implements Serializable {
    private String zhid;
    private Long zhbh;
    private String jgid;
    private String mmsfbz;
    private String zhlb;
    private String sfdg;
    private String zhsyr;
    private String zhh;
    private String yhbh;
    private String yhmc;
    private String khyh;
    private String khhbh;
    private String yhjhh;
    private double csje;
    private double hcjelj;
    private double hjjelj;
    private double dqje;
    private double yhdqye;
    private String hbzl;
    private String jzbz;
    private Date jzsj;
    private String jzrbh;
    private String zt;
    private String bz;

    @Id
    @Column(name = "ZHID")
    public String getZhid() {
        return zhid;
    }

    public void setZhid(String zhid) {
        this.zhid = zhid;
    }

    @Basic
    @Column(name = "ZHBH")
    public Long getZhbh() {
        return zhbh;
    }

    public void setZhbh(Long zhbh) {
        this.zhbh = zhbh;
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
    @Column(name = "MMSFBZ")
    public String getMmsfbz() {
        return mmsfbz;
    }

    public void setMmsfbz(String mmsfbz) {
        this.mmsfbz = mmsfbz;
    }

    @Basic
    @Column(name = "ZHLB")
    public String getZhlb() {
        return zhlb;
    }

    public void setZhlb(String zhlb) {
        this.zhlb = zhlb;
    }

    @Basic
    @Column(name = "SFDG")
    public String getSfdg() {
        return sfdg;
    }

    public void setSfdg(String sfdg) {
        this.sfdg = sfdg;
    }

    @Basic
    @Column(name = "ZHSYR")
    public String getZhsyr() {
        return zhsyr;
    }

    public void setZhsyr(String zhsyr) {
        this.zhsyr = zhsyr;
    }

    @Basic
    @Column(name = "ZHH")
    public String getZhh() {
        return zhh;
    }

    public void setZhh(String zhh) {
        this.zhh = zhh;
    }

    @Basic
    @Column(name = "YHBH")
    public String getYhbh() {
        return yhbh;
    }

    public void setYhbh(String yhbh) {
        this.yhbh = yhbh;
    }

    @Basic
    @Column(name = "YHMC")
    public String getYhmc() {
        return yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
    }

    @Basic
    @Column(name = "KHYH")
    public String getKhyh() {
        return khyh;
    }

    public void setKhyh(String khyh) {
        this.khyh = khyh;
    }

    @Basic
    @Column(name = "KHHBH")
    public String getKhhbh() {
        return khhbh;
    }

    public void setKhhbh(String khhbh) {
        this.khhbh = khhbh;
    }

    @Basic
    @Column(name = "YHJHH")
    public String getYhjhh() {
        return yhjhh;
    }

    public void setYhjhh(String yhjhh) {
        this.yhjhh = yhjhh;
    }

    @Basic
    @Column(name = "CSJE")
    public double getCsje() {
        return csje;
    }

    public void setCsje(double csje) {
        this.csje = csje;
    }

    @Basic
    @Column(name = "HCJELJ")
    public double getHcjelj() {
        return hcjelj;
    }

    public void setHcjelj(double hcjelj) {
        this.hcjelj = hcjelj;
    }

    @Basic
    @Column(name = "HJJELJ")
    public double getHjjelj() {
        return hjjelj;
    }

    public void setHjjelj(double hjjelj) {
        this.hjjelj = hjjelj;
    }

    @Basic
    @Column(name = "DQJE")
    public double getDqje() {
        return dqje;
    }

    public void setDqje(double dqje) {
        this.dqje = dqje;
    }

    @Basic
    @Column(name = "YHDQYE")
    public double getYhdqye() {
        return yhdqye;
    }

    public void setYhdqye(double yhdqye) {
        this.yhdqye = yhdqye;
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
    @Column(name = "JZBZ")
    public String getJzbz() {
        return jzbz;
    }

    public void setJzbz(String jzbz) {
        this.jzbz = jzbz;
    }

    @Basic
    @Column(name = "JZSJ")
    public Date getJzsj() {
        return jzsj;
    }

    public void setJzsj(Date jzsj) {
        this.jzsj = jzsj;
    }

    @Basic
    @Column(name = "JZRBH")
    public String getJzrbh() {
        return jzrbh;
    }

    public void setJzrbh(String jzrbh) {
        this.jzrbh = jzrbh;
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
        FcjyClfZjjgzhEntity that = (FcjyClfZjjgzhEntity) o;
        return Objects.equals(zhid, that.zhid) &&
                Objects.equals(zhbh, that.zhbh) &&
                Objects.equals(jgid, that.jgid) &&
                Objects.equals(mmsfbz, that.mmsfbz) &&
                Objects.equals(zhlb, that.zhlb) &&
                Objects.equals(sfdg, that.sfdg) &&
                Objects.equals(zhsyr, that.zhsyr) &&
                Objects.equals(zhh, that.zhh) &&
                Objects.equals(yhbh, that.yhbh) &&
                Objects.equals(yhmc, that.yhmc) &&
                Objects.equals(khyh, that.khyh) &&
                Objects.equals(khhbh, that.khhbh) &&
                Objects.equals(yhjhh, that.yhjhh) &&
                Objects.equals(csje, that.csje) &&
                Objects.equals(hcjelj, that.hcjelj) &&
                Objects.equals(hjjelj, that.hjjelj) &&
                Objects.equals(dqje, that.dqje) &&
                Objects.equals(yhdqye, that.yhdqye) &&
                Objects.equals(hbzl, that.hbzl) &&
                Objects.equals(jzbz, that.jzbz) &&
                Objects.equals(jzsj, that.jzsj) &&
                Objects.equals(jzrbh, that.jzrbh) &&
                Objects.equals(zt, that.zt) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhid, zhbh, jgid, mmsfbz, zhlb, sfdg, zhsyr, zhh, yhbh, yhmc, khyh, khhbh, yhjhh, csje, hcjelj, hjjelj, dqje, yhdqye, hbzl, jzbz, jzsj, jzrbh, zt, bz);
    }
}
