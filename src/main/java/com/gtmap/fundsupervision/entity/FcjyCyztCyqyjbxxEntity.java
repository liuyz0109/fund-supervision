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
@Table(name = "FCJY_CYZT_CYQYJBXX", schema = "SCOTT", catalog = "")
public class FcjyCyztCyqyjbxxEntity implements Serializable {
    private String qyid;
    private Long qybh;
    private String qylb;
    private String qymc;
    private String qyjc;
    private String zzjgdm;
    private String szss;
    private String qxh;
    private String jyfw;
    private String zcdz;
    private String lxdz;
    private String yzbm;
    private String lxr;
    private String lxdh;
    private String cz;
    private String dzyj;
    private String wz;
    private String zzdj;
    private String zzzsbh;
    private Time zzzsyxqsrq;
    private Time zzzsyxzzrq;
    private Long yzczyrs;
    private Long gjzcrs;
    private Long zcryzs;
    private Long zjzcrs;
    private Long cjzcrs;
    private String yyzzhm;
    private Time yyzzjyqxqsr;
    private Time yyzzjyqxdqr;
    private Long jzc;
    private Long zzc;
    private Long zczb;
    private String zczbdw;
    private String zjl;
    private String fddbr;
    private String frdblxdh;
    private String frdbzjmc;
    private String frdbzjhm;
    private String djqxh;
    private Time cjsj;
    private Time xgsj;
    private String sfyx;
    private String cyqyzt;
    private String qyxz;
    private Time clrq;
    private Time pzcsfdcywrq;
    private String bz;

    @Id
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    @Basic
    @Column(name = "QYBH")
    public Long getQybh() {
        return qybh;
    }

    public void setQybh(Long qybh) {
        this.qybh = qybh;
    }

    @Basic
    @Column(name = "QYLB")
    public String getQylb() {
        return qylb;
    }

    public void setQylb(String qylb) {
        this.qylb = qylb;
    }

    @Basic
    @Column(name = "QYMC")
    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    @Basic
    @Column(name = "QYJC")
    public String getQyjc() {
        return qyjc;
    }

    public void setQyjc(String qyjc) {
        this.qyjc = qyjc;
    }

    @Basic
    @Column(name = "ZZJGDM")
    public String getZzjgdm() {
        return zzjgdm;
    }

    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm;
    }

    @Basic
    @Column(name = "SZSS")
    public String getSzss() {
        return szss;
    }

    public void setSzss(String szss) {
        this.szss = szss;
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
    @Column(name = "JYFW")
    public String getJyfw() {
        return jyfw;
    }

    public void setJyfw(String jyfw) {
        this.jyfw = jyfw;
    }

    @Basic
    @Column(name = "ZCDZ")
    public String getZcdz() {
        return zcdz;
    }

    public void setZcdz(String zcdz) {
        this.zcdz = zcdz;
    }

    @Basic
    @Column(name = "LXDZ")
    public String getLxdz() {
        return lxdz;
    }

    public void setLxdz(String lxdz) {
        this.lxdz = lxdz;
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
    @Column(name = "LXR")
    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
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
    @Column(name = "CZ")
    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
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
    @Column(name = "WZ")
    public String getWz() {
        return wz;
    }

    public void setWz(String wz) {
        this.wz = wz;
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
    @Column(name = "ZZZSBH")
    public String getZzzsbh() {
        return zzzsbh;
    }

    public void setZzzsbh(String zzzsbh) {
        this.zzzsbh = zzzsbh;
    }

    @Basic
    @Column(name = "ZZZSYXQSRQ")
    public Time getZzzsyxqsrq() {
        return zzzsyxqsrq;
    }

    public void setZzzsyxqsrq(Time zzzsyxqsrq) {
        this.zzzsyxqsrq = zzzsyxqsrq;
    }

    @Basic
    @Column(name = "ZZZSYXZZRQ")
    public Time getZzzsyxzzrq() {
        return zzzsyxzzrq;
    }

    public void setZzzsyxzzrq(Time zzzsyxzzrq) {
        this.zzzsyxzzrq = zzzsyxzzrq;
    }

    @Basic
    @Column(name = "YZCZYRS")
    public Long getYzczyrs() {
        return yzczyrs;
    }

    public void setYzczyrs(Long yzczyrs) {
        this.yzczyrs = yzczyrs;
    }

    @Basic
    @Column(name = "GJZCRS")
    public Long getGjzcrs() {
        return gjzcrs;
    }

    public void setGjzcrs(Long gjzcrs) {
        this.gjzcrs = gjzcrs;
    }

    @Basic
    @Column(name = "ZCRYZS")
    public Long getZcryzs() {
        return zcryzs;
    }

    public void setZcryzs(Long zcryzs) {
        this.zcryzs = zcryzs;
    }

    @Basic
    @Column(name = "ZJZCRS")
    public Long getZjzcrs() {
        return zjzcrs;
    }

    public void setZjzcrs(Long zjzcrs) {
        this.zjzcrs = zjzcrs;
    }

    @Basic
    @Column(name = "CJZCRS")
    public Long getCjzcrs() {
        return cjzcrs;
    }

    public void setCjzcrs(Long cjzcrs) {
        this.cjzcrs = cjzcrs;
    }

    @Basic
    @Column(name = "YYZZHM")
    public String getYyzzhm() {
        return yyzzhm;
    }

    public void setYyzzhm(String yyzzhm) {
        this.yyzzhm = yyzzhm;
    }

    @Basic
    @Column(name = "YYZZJYQXQSR")
    public Time getYyzzjyqxqsr() {
        return yyzzjyqxqsr;
    }

    public void setYyzzjyqxqsr(Time yyzzjyqxqsr) {
        this.yyzzjyqxqsr = yyzzjyqxqsr;
    }

    @Basic
    @Column(name = "YYZZJYQXDQR")
    public Time getYyzzjyqxdqr() {
        return yyzzjyqxdqr;
    }

    public void setYyzzjyqxdqr(Time yyzzjyqxdqr) {
        this.yyzzjyqxdqr = yyzzjyqxdqr;
    }

    @Basic
    @Column(name = "JZC")
    public Long getJzc() {
        return jzc;
    }

    public void setJzc(Long jzc) {
        this.jzc = jzc;
    }

    @Basic
    @Column(name = "ZZC")
    public Long getZzc() {
        return zzc;
    }

    public void setZzc(Long zzc) {
        this.zzc = zzc;
    }

    @Basic
    @Column(name = "ZCZB")
    public Long getZczb() {
        return zczb;
    }

    public void setZczb(Long zczb) {
        this.zczb = zczb;
    }

    @Basic
    @Column(name = "ZCZBDW")
    public String getZczbdw() {
        return zczbdw;
    }

    public void setZczbdw(String zczbdw) {
        this.zczbdw = zczbdw;
    }

    @Basic
    @Column(name = "ZJL")
    public String getZjl() {
        return zjl;
    }

    public void setZjl(String zjl) {
        this.zjl = zjl;
    }

    @Basic
    @Column(name = "FDDBR")
    public String getFddbr() {
        return fddbr;
    }

    public void setFddbr(String fddbr) {
        this.fddbr = fddbr;
    }

    @Basic
    @Column(name = "FRDBLXDH")
    public String getFrdblxdh() {
        return frdblxdh;
    }

    public void setFrdblxdh(String frdblxdh) {
        this.frdblxdh = frdblxdh;
    }

    @Basic
    @Column(name = "FRDBZJMC")
    public String getFrdbzjmc() {
        return frdbzjmc;
    }

    public void setFrdbzjmc(String frdbzjmc) {
        this.frdbzjmc = frdbzjmc;
    }

    @Basic
    @Column(name = "FRDBZJHM")
    public String getFrdbzjhm() {
        return frdbzjhm;
    }

    public void setFrdbzjhm(String frdbzjhm) {
        this.frdbzjhm = frdbzjhm;
    }

    @Basic
    @Column(name = "DJQXH")
    public String getDjqxh() {
        return djqxh;
    }

    public void setDjqxh(String djqxh) {
        this.djqxh = djqxh;
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
    @Column(name = "CYQYZT")
    public String getCyqyzt() {
        return cyqyzt;
    }

    public void setCyqyzt(String cyqyzt) {
        this.cyqyzt = cyqyzt;
    }

    @Basic
    @Column(name = "QYXZ")
    public String getQyxz() {
        return qyxz;
    }

    public void setQyxz(String qyxz) {
        this.qyxz = qyxz;
    }

    @Basic
    @Column(name = "CLRQ")
    public Time getClrq() {
        return clrq;
    }

    public void setClrq(Time clrq) {
        this.clrq = clrq;
    }

    @Basic
    @Column(name = "PZCSFDCYWRQ")
    public Time getPzcsfdcywrq() {
        return pzcsfdcywrq;
    }

    public void setPzcsfdcywrq(Time pzcsfdcywrq) {
        this.pzcsfdcywrq = pzcsfdcywrq;
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
        FcjyCyztCyqyjbxxEntity that = (FcjyCyztCyqyjbxxEntity) o;
        return Objects.equals(qyid, that.qyid) &&
                Objects.equals(qybh, that.qybh) &&
                Objects.equals(qylb, that.qylb) &&
                Objects.equals(qymc, that.qymc) &&
                Objects.equals(qyjc, that.qyjc) &&
                Objects.equals(zzjgdm, that.zzjgdm) &&
                Objects.equals(szss, that.szss) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(jyfw, that.jyfw) &&
                Objects.equals(zcdz, that.zcdz) &&
                Objects.equals(lxdz, that.lxdz) &&
                Objects.equals(yzbm, that.yzbm) &&
                Objects.equals(lxr, that.lxr) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(cz, that.cz) &&
                Objects.equals(dzyj, that.dzyj) &&
                Objects.equals(wz, that.wz) &&
                Objects.equals(zzdj, that.zzdj) &&
                Objects.equals(zzzsbh, that.zzzsbh) &&
                Objects.equals(zzzsyxqsrq, that.zzzsyxqsrq) &&
                Objects.equals(zzzsyxzzrq, that.zzzsyxzzrq) &&
                Objects.equals(yzczyrs, that.yzczyrs) &&
                Objects.equals(gjzcrs, that.gjzcrs) &&
                Objects.equals(zcryzs, that.zcryzs) &&
                Objects.equals(zjzcrs, that.zjzcrs) &&
                Objects.equals(cjzcrs, that.cjzcrs) &&
                Objects.equals(yyzzhm, that.yyzzhm) &&
                Objects.equals(yyzzjyqxqsr, that.yyzzjyqxqsr) &&
                Objects.equals(yyzzjyqxdqr, that.yyzzjyqxdqr) &&
                Objects.equals(jzc, that.jzc) &&
                Objects.equals(zzc, that.zzc) &&
                Objects.equals(zczb, that.zczb) &&
                Objects.equals(zczbdw, that.zczbdw) &&
                Objects.equals(zjl, that.zjl) &&
                Objects.equals(fddbr, that.fddbr) &&
                Objects.equals(frdblxdh, that.frdblxdh) &&
                Objects.equals(frdbzjmc, that.frdbzjmc) &&
                Objects.equals(frdbzjhm, that.frdbzjhm) &&
                Objects.equals(djqxh, that.djqxh) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(xgsj, that.xgsj) &&
                Objects.equals(sfyx, that.sfyx) &&
                Objects.equals(cyqyzt, that.cyqyzt) &&
                Objects.equals(qyxz, that.qyxz) &&
                Objects.equals(clrq, that.clrq) &&
                Objects.equals(pzcsfdcywrq, that.pzcsfdcywrq) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qyid, qybh, qylb, qymc, qyjc, zzjgdm, szss, qxh, jyfw, zcdz, lxdz, yzbm, lxr, lxdh, cz, dzyj, wz, zzdj, zzzsbh, zzzsyxqsrq, zzzsyxzzrq, yzczyrs, gjzcrs, zcryzs, zjzcrs, cjzcrs, yyzzhm, yyzzjyqxqsr, yyzzjyqxdqr, jzc, zzc, zczb, zczbdw, zjl, fddbr, frdblxdh, frdbzjmc, frdbzjhm, djqxh, cjsj, xgsj, sfyx, cyqyzt, qyxz, clrq, pzcsfdcywrq, bz);
    }
}
