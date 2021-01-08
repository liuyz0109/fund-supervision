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
@Table(name = "FCJY_XJSPF_KFXM", schema = "SCOTT", catalog = "")
public class FcjyXjspfKfxmEntity implements Serializable {
    private String xmid;
    private Long xmbh;
    private String xmmc;
    private String xsmc;
    private String qxh;
    private String xmdz;
    private String fdckfqymc;
    private Long fdckfqybh;
    private Time kprq;
    private Time rzrq;
    private String sldh;
    private String sldz;
    private String tdsyqzh;
    private String tddj;
    private String ghyt;
    private String zts;
    private Long zjzmj;
    private String szfw;
    private Long zdmj;
    private String zrzs;
    private String dqksts;
    private Long dqksmj;
    private String yydts;
    private String ysts;
    private String lpjj;
    private String sbzx;
    private String sgjd;
    private String ptss;
    private String zwjt;
    private String lhl;
    private String rjl;
    private Long jzmd;
    private String cwgs;
    private String jsydghxkzh;
    private Long bkbh;
    private Long tdtz;
    private Long jhzjzmj;
    private Long jhztz;
    private Time jhkgsj;
    private Time jhjgsj;
    private Long sjwctz;
    private Time sjkgsj;
    private Time sjjgsj;
    private String bz;

    @Id
    @Column(name = "XMID")
    public String getXmid() {
        return xmid;
    }

    public void setXmid(String xmid) {
        this.xmid = xmid;
    }

    @Basic
    @Column(name = "XMBH")
    public Long getXmbh() {
        return xmbh;
    }

    public void setXmbh(Long xmbh) {
        this.xmbh = xmbh;
    }

    @Basic
    @Column(name = "XMMC")
    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    @Basic
    @Column(name = "XSMC")
    public String getXsmc() {
        return xsmc;
    }

    public void setXsmc(String xsmc) {
        this.xsmc = xsmc;
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
    @Column(name = "XMDZ")
    public String getXmdz() {
        return xmdz;
    }

    public void setXmdz(String xmdz) {
        this.xmdz = xmdz;
    }

    @Basic
    @Column(name = "FDCKFQYMC")
    public String getFdckfqymc() {
        return fdckfqymc;
    }

    public void setFdckfqymc(String fdckfqymc) {
        this.fdckfqymc = fdckfqymc;
    }

    @Basic
    @Column(name = "FDCKFQYBH")
    public Long getFdckfqybh() {
        return fdckfqybh;
    }

    public void setFdckfqybh(Long fdckfqybh) {
        this.fdckfqybh = fdckfqybh;
    }

    @Basic
    @Column(name = "KPRQ")
    public Time getKprq() {
        return kprq;
    }

    public void setKprq(Time kprq) {
        this.kprq = kprq;
    }

    @Basic
    @Column(name = "RZRQ")
    public Time getRzrq() {
        return rzrq;
    }

    public void setRzrq(Time rzrq) {
        this.rzrq = rzrq;
    }

    @Basic
    @Column(name = "SLDH")
    public String getSldh() {
        return sldh;
    }

    public void setSldh(String sldh) {
        this.sldh = sldh;
    }

    @Basic
    @Column(name = "SLDZ")
    public String getSldz() {
        return sldz;
    }

    public void setSldz(String sldz) {
        this.sldz = sldz;
    }

    @Basic
    @Column(name = "TDSYQZH")
    public String getTdsyqzh() {
        return tdsyqzh;
    }

    public void setTdsyqzh(String tdsyqzh) {
        this.tdsyqzh = tdsyqzh;
    }

    @Basic
    @Column(name = "TDDJ")
    public String getTddj() {
        return tddj;
    }

    public void setTddj(String tddj) {
        this.tddj = tddj;
    }

    @Basic
    @Column(name = "GHYT")
    public String getGhyt() {
        return ghyt;
    }

    public void setGhyt(String ghyt) {
        this.ghyt = ghyt;
    }

    @Basic
    @Column(name = "ZTS")
    public String getZts() {
        return zts;
    }

    public void setZts(String zts) {
        this.zts = zts;
    }

    @Basic
    @Column(name = "ZJZMJ")
    public Long getZjzmj() {
        return zjzmj;
    }

    public void setZjzmj(Long zjzmj) {
        this.zjzmj = zjzmj;
    }

    @Basic
    @Column(name = "SZFW")
    public String getSzfw() {
        return szfw;
    }

    public void setSzfw(String szfw) {
        this.szfw = szfw;
    }

    @Basic
    @Column(name = "ZDMJ")
    public Long getZdmj() {
        return zdmj;
    }

    public void setZdmj(Long zdmj) {
        this.zdmj = zdmj;
    }

    @Basic
    @Column(name = "ZRZS")
    public String getZrzs() {
        return zrzs;
    }

    public void setZrzs(String zrzs) {
        this.zrzs = zrzs;
    }

    @Basic
    @Column(name = "DQKSTS")
    public String getDqksts() {
        return dqksts;
    }

    public void setDqksts(String dqksts) {
        this.dqksts = dqksts;
    }

    @Basic
    @Column(name = "DQKSMJ")
    public Long getDqksmj() {
        return dqksmj;
    }

    public void setDqksmj(Long dqksmj) {
        this.dqksmj = dqksmj;
    }

    @Basic
    @Column(name = "YYDTS")
    public String getYydts() {
        return yydts;
    }

    public void setYydts(String yydts) {
        this.yydts = yydts;
    }

    @Basic
    @Column(name = "YSTS")
    public String getYsts() {
        return ysts;
    }

    public void setYsts(String ysts) {
        this.ysts = ysts;
    }

    @Basic
    @Column(name = "LPJJ")
    public String getLpjj() {
        return lpjj;
    }

    public void setLpjj(String lpjj) {
        this.lpjj = lpjj;
    }

    @Basic
    @Column(name = "SBZX")
    public String getSbzx() {
        return sbzx;
    }

    public void setSbzx(String sbzx) {
        this.sbzx = sbzx;
    }

    @Basic
    @Column(name = "SGJD")
    public String getSgjd() {
        return sgjd;
    }

    public void setSgjd(String sgjd) {
        this.sgjd = sgjd;
    }

    @Basic
    @Column(name = "PTSS")
    public String getPtss() {
        return ptss;
    }

    public void setPtss(String ptss) {
        this.ptss = ptss;
    }

    @Basic
    @Column(name = "ZWJT")
    public String getZwjt() {
        return zwjt;
    }

    public void setZwjt(String zwjt) {
        this.zwjt = zwjt;
    }

    @Basic
    @Column(name = "LHL")
    public String getLhl() {
        return lhl;
    }

    public void setLhl(String lhl) {
        this.lhl = lhl;
    }

    @Basic
    @Column(name = "RJL")
    public String getRjl() {
        return rjl;
    }

    public void setRjl(String rjl) {
        this.rjl = rjl;
    }

    @Basic
    @Column(name = "JZMD")
    public Long getJzmd() {
        return jzmd;
    }

    public void setJzmd(Long jzmd) {
        this.jzmd = jzmd;
    }

    @Basic
    @Column(name = "CWGS")
    public String getCwgs() {
        return cwgs;
    }

    public void setCwgs(String cwgs) {
        this.cwgs = cwgs;
    }

    @Basic
    @Column(name = "JSYDGHXKZH")
    public String getJsydghxkzh() {
        return jsydghxkzh;
    }

    public void setJsydghxkzh(String jsydghxkzh) {
        this.jsydghxkzh = jsydghxkzh;
    }

    @Basic
    @Column(name = "BKBH")
    public Long getBkbh() {
        return bkbh;
    }

    public void setBkbh(Long bkbh) {
        this.bkbh = bkbh;
    }

    @Basic
    @Column(name = "TDTZ")
    public Long getTdtz() {
        return tdtz;
    }

    public void setTdtz(Long tdtz) {
        this.tdtz = tdtz;
    }

    @Basic
    @Column(name = "JHZJZMJ")
    public Long getJhzjzmj() {
        return jhzjzmj;
    }

    public void setJhzjzmj(Long jhzjzmj) {
        this.jhzjzmj = jhzjzmj;
    }

    @Basic
    @Column(name = "JHZTZ")
    public Long getJhztz() {
        return jhztz;
    }

    public void setJhztz(Long jhztz) {
        this.jhztz = jhztz;
    }

    @Basic
    @Column(name = "JHKGSJ")
    public Time getJhkgsj() {
        return jhkgsj;
    }

    public void setJhkgsj(Time jhkgsj) {
        this.jhkgsj = jhkgsj;
    }

    @Basic
    @Column(name = "JHJGSJ")
    public Time getJhjgsj() {
        return jhjgsj;
    }

    public void setJhjgsj(Time jhjgsj) {
        this.jhjgsj = jhjgsj;
    }

    @Basic
    @Column(name = "SJWCTZ")
    public Long getSjwctz() {
        return sjwctz;
    }

    public void setSjwctz(Long sjwctz) {
        this.sjwctz = sjwctz;
    }

    @Basic
    @Column(name = "SJKGSJ")
    public Time getSjkgsj() {
        return sjkgsj;
    }

    public void setSjkgsj(Time sjkgsj) {
        this.sjkgsj = sjkgsj;
    }

    @Basic
    @Column(name = "SJJGSJ")
    public Time getSjjgsj() {
        return sjjgsj;
    }

    public void setSjjgsj(Time sjjgsj) {
        this.sjjgsj = sjjgsj;
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
        FcjyXjspfKfxmEntity that = (FcjyXjspfKfxmEntity) o;
        return Objects.equals(xmid, that.xmid) &&
                Objects.equals(xmbh, that.xmbh) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(xsmc, that.xsmc) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(xmdz, that.xmdz) &&
                Objects.equals(fdckfqymc, that.fdckfqymc) &&
                Objects.equals(fdckfqybh, that.fdckfqybh) &&
                Objects.equals(kprq, that.kprq) &&
                Objects.equals(rzrq, that.rzrq) &&
                Objects.equals(sldh, that.sldh) &&
                Objects.equals(sldz, that.sldz) &&
                Objects.equals(tdsyqzh, that.tdsyqzh) &&
                Objects.equals(tddj, that.tddj) &&
                Objects.equals(ghyt, that.ghyt) &&
                Objects.equals(zts, that.zts) &&
                Objects.equals(zjzmj, that.zjzmj) &&
                Objects.equals(szfw, that.szfw) &&
                Objects.equals(zdmj, that.zdmj) &&
                Objects.equals(zrzs, that.zrzs) &&
                Objects.equals(dqksts, that.dqksts) &&
                Objects.equals(dqksmj, that.dqksmj) &&
                Objects.equals(yydts, that.yydts) &&
                Objects.equals(ysts, that.ysts) &&
                Objects.equals(lpjj, that.lpjj) &&
                Objects.equals(sbzx, that.sbzx) &&
                Objects.equals(sgjd, that.sgjd) &&
                Objects.equals(ptss, that.ptss) &&
                Objects.equals(zwjt, that.zwjt) &&
                Objects.equals(lhl, that.lhl) &&
                Objects.equals(rjl, that.rjl) &&
                Objects.equals(jzmd, that.jzmd) &&
                Objects.equals(cwgs, that.cwgs) &&
                Objects.equals(jsydghxkzh, that.jsydghxkzh) &&
                Objects.equals(bkbh, that.bkbh) &&
                Objects.equals(tdtz, that.tdtz) &&
                Objects.equals(jhzjzmj, that.jhzjzmj) &&
                Objects.equals(jhztz, that.jhztz) &&
                Objects.equals(jhkgsj, that.jhkgsj) &&
                Objects.equals(jhjgsj, that.jhjgsj) &&
                Objects.equals(sjwctz, that.sjwctz) &&
                Objects.equals(sjkgsj, that.sjkgsj) &&
                Objects.equals(sjjgsj, that.sjjgsj) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xmid, xmbh, xmmc, xsmc, qxh, xmdz, fdckfqymc, fdckfqybh, kprq, rzrq, sldh, sldz, tdsyqzh, tddj, ghyt, zts, zjzmj, szfw, zdmj, zrzs, dqksts, dqksmj, yydts, ysts, lpjj, sbzx, sgjd, ptss, zwjt, lhl, rjl, jzmd, cwgs, jsydghxkzh, bkbh, tdtz, jhzjzmj, jhztz, jhkgsj, jhjgsj, sjwctz, sjkgsj, sjjgsj, bz);
    }
}
