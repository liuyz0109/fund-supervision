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
@Table(name = "FCJY_CLF_ZJJGRZJL", schema = "SCOTT")
public class FcjyClfZjjgrzjlEntity implements Serializable {
    private String rzjlid;
    private Long rzjlbh;
    private String jgid;
    private Long hkzlbh;
    private String zhh;
    private double je;
    private String hbzl;
    private String fkrxm;
    private String fkrzh;
    private String jgyhbh;
    private String dgfkyhbh;
    private String dgfzyhbh;
    private String dgtkhm;
    private String dgtkzh;
    private String dgfkyhmc;
    private String dgfkyhjhh;
    private String dgyhzh;
    private Date sjczsj;
    private String yhlsh;
    private String sfdg;
    private String sflx;
    private String sftk;
    private String fhqk;
    private String fhbz;
    private String fhr;
    private String fhrxm;
    private Date fhsj;
    private String shrxm;
    private Date shsj;
    private String shqk;
    private String czrxm;
    private String sfyx;
    private String bz;

    @Id
    @Column(name = "RZJLID")
    public String getRzjlid() {
        return rzjlid;
    }

    public void setRzjlid(String rzjlid) {
        this.rzjlid = rzjlid;
    }

    @Basic
    @Column(name = "RZJLBH")
    public Long getRzjlbh() {
        return rzjlbh;
    }

    public void setRzjlbh(Long rzjlbh) {
        this.rzjlbh = rzjlbh;
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
    @Column(name = "HKZLBH")
    public Long getHkzlbh() {
        return hkzlbh;
    }

    public void setHkzlbh(Long hkzlbh) {
        this.hkzlbh = hkzlbh;
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
    @Column(name = "JE")
    public double getJe() {
        return je;
    }

    public void setJe(double je) {
        this.je = je;
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
    @Column(name = "FKRXM")
    public String getFkrxm() {
        return fkrxm;
    }

    public void setFkrxm(String fkrxm) {
        this.fkrxm = fkrxm;
    }

    @Basic
    @Column(name = "FKRZH")
    public String getFkrzh() {
        return fkrzh;
    }

    public void setFkrzh(String fkrzh) {
        this.fkrzh = fkrzh;
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
    @Column(name = "DGFKYHBH")
    public String getDgfkyhbh() {
        return dgfkyhbh;
    }

    public void setDgfkyhbh(String dgfkyhbh) {
        this.dgfkyhbh = dgfkyhbh;
    }

    @Basic
    @Column(name = "DGFZYHBH")
    public String getDgfzyhbh() {
        return dgfzyhbh;
    }

    public void setDgfzyhbh(String dgfzyhbh) {
        this.dgfzyhbh = dgfzyhbh;
    }

    @Basic
    @Column(name = "DGTKHM")
    public String getDgtkhm() {
        return dgtkhm;
    }

    public void setDgtkhm(String dgtkhm) {
        this.dgtkhm = dgtkhm;
    }

    @Basic
    @Column(name = "DGTKZH")
    public String getDgtkzh() {
        return dgtkzh;
    }

    public void setDgtkzh(String dgtkzh) {
        this.dgtkzh = dgtkzh;
    }

    @Basic
    @Column(name = "DGFKYHMC")
    public String getDgfkyhmc() {
        return dgfkyhmc;
    }

    public void setDgfkyhmc(String dgfkyhmc) {
        this.dgfkyhmc = dgfkyhmc;
    }

    @Basic
    @Column(name = "DGFKYHJHH")
    public String getDgfkyhjhh() {
        return dgfkyhjhh;
    }

    public void setDgfkyhjhh(String dgfkyhjhh) {
        this.dgfkyhjhh = dgfkyhjhh;
    }

    @Basic
    @Column(name = "DGYHZH")
    public String getDgyhzh() {
        return dgyhzh;
    }

    public void setDgyhzh(String dgyhzh) {
        this.dgyhzh = dgyhzh;
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
    @Column(name = "YHLSH")
    public String getYhlsh() {
        return yhlsh;
    }

    public void setYhlsh(String yhlsh) {
        this.yhlsh = yhlsh;
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
    @Column(name = "SFLX")
    public String getSflx() {
        return sflx;
    }

    public void setSflx(String sflx) {
        this.sflx = sflx;
    }

    @Basic
    @Column(name = "SFTK")
    public String getSftk() {
        return sftk;
    }

    public void setSftk(String sftk) {
        this.sftk = sftk;
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
    @Column(name = "SHQK")
    public String getShqk() {
        return shqk;
    }

    public void setShqk(String shqk) {
        this.shqk = shqk;
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
        FcjyClfZjjgrzjlEntity that = (FcjyClfZjjgrzjlEntity) o;
        return Objects.equals(rzjlid, that.rzjlid) &&
                Objects.equals(rzjlbh, that.rzjlbh) &&
                Objects.equals(jgid, that.jgid) &&
                Objects.equals(hkzlbh, that.hkzlbh) &&
                Objects.equals(zhh, that.zhh) &&
                Objects.equals(je, that.je) &&
                Objects.equals(hbzl, that.hbzl) &&
                Objects.equals(fkrxm, that.fkrxm) &&
                Objects.equals(fkrzh, that.fkrzh) &&
                Objects.equals(jgyhbh, that.jgyhbh) &&
                Objects.equals(dgfkyhbh, that.dgfkyhbh) &&
                Objects.equals(dgfzyhbh, that.dgfzyhbh) &&
                Objects.equals(dgtkhm, that.dgtkhm) &&
                Objects.equals(dgtkzh, that.dgtkzh) &&
                Objects.equals(dgfkyhmc, that.dgfkyhmc) &&
                Objects.equals(dgfkyhjhh, that.dgfkyhjhh) &&
                Objects.equals(dgyhzh, that.dgyhzh) &&
                Objects.equals(sjczsj, that.sjczsj) &&
                Objects.equals(yhlsh, that.yhlsh) &&
                Objects.equals(sfdg, that.sfdg) &&
                Objects.equals(sflx, that.sflx) &&
                Objects.equals(sftk, that.sftk) &&
                Objects.equals(fhqk, that.fhqk) &&
                Objects.equals(fhbz, that.fhbz) &&
                Objects.equals(fhr, that.fhr) &&
                Objects.equals(fhrxm, that.fhrxm) &&
                Objects.equals(fhsj, that.fhsj) &&
                Objects.equals(shrxm, that.shrxm) &&
                Objects.equals(shsj, that.shsj) &&
                Objects.equals(shqk, that.shqk) &&
                Objects.equals(czrxm, that.czrxm) &&
                Objects.equals(sfyx, that.sfyx) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rzjlid, rzjlbh, jgid, hkzlbh, zhh, je, hbzl, fkrxm, fkrzh, jgyhbh, dgfkyhbh, dgfzyhbh, dgtkhm, dgtkzh, dgfkyhmc, dgfkyhjhh, dgyhzh, sjczsj, yhlsh, sfdg, sflx, sftk, fhqk, fhbz, fhr, fhrxm, fhsj, shrxm, shsj, shqk, czrxm, sfyx, bz);
    }
}
