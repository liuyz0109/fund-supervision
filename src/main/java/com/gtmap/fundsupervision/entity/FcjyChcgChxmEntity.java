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
@Table(name = "FCJY_CHCG_CHXM", schema = "SCOTT", catalog = "")
public class FcjyChcgChxmEntity implements Serializable {
    private String xmid;
    private Long xmbh;
    private String cgh;
    private String xmlx;
    private String xmmc;
    private String fdczl;
    private String qxh;
    private String wtrmc;
    private String wtrdz;
    private String wtryzbm;
    private String wrdwlxr;
    private String lxdh;
    private String wtrdzyx;
    private String jsydghxkzbh;
    private String jsgcghxkzbh;
    private String jzgcsgxkzbh;
    private String xzyjsbh;
    private Long dctdmj;
    private Long dcjzmj;
    private Long fwzdmj;
    private Long fwjzzmj;
    private Long dsjzzmj;
    private Long dxjzzmj;
    private Long dytdzmj;
    private Time slrq;
    private String slr;
    private String chzzyq;
    private String chjsyq;
    private String jdyq;
    private String chdw;
    private String lxr;
    private String chfzr;
    private String glbm;
    private String qsdcy;
    private Time jsrq;

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
    @Column(name = "CGH")
    public String getCgh() {
        return cgh;
    }

    public void setCgh(String cgh) {
        this.cgh = cgh;
    }

    @Basic
    @Column(name = "XMLX")
    public String getXmlx() {
        return xmlx;
    }

    public void setXmlx(String xmlx) {
        this.xmlx = xmlx;
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
    @Column(name = "FDCZL")
    public String getFdczl() {
        return fdczl;
    }

    public void setFdczl(String fdczl) {
        this.fdczl = fdczl;
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
    @Column(name = "WTRMC")
    public String getWtrmc() {
        return wtrmc;
    }

    public void setWtrmc(String wtrmc) {
        this.wtrmc = wtrmc;
    }

    @Basic
    @Column(name = "WTRDZ")
    public String getWtrdz() {
        return wtrdz;
    }

    public void setWtrdz(String wtrdz) {
        this.wtrdz = wtrdz;
    }

    @Basic
    @Column(name = "WTRYZBM")
    public String getWtryzbm() {
        return wtryzbm;
    }

    public void setWtryzbm(String wtryzbm) {
        this.wtryzbm = wtryzbm;
    }

    @Basic
    @Column(name = "WRDWLXR")
    public String getWrdwlxr() {
        return wrdwlxr;
    }

    public void setWrdwlxr(String wrdwlxr) {
        this.wrdwlxr = wrdwlxr;
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
    @Column(name = "WTRDZYX")
    public String getWtrdzyx() {
        return wtrdzyx;
    }

    public void setWtrdzyx(String wtrdzyx) {
        this.wtrdzyx = wtrdzyx;
    }

    @Basic
    @Column(name = "JSYDGHXKZBH")
    public String getJsydghxkzbh() {
        return jsydghxkzbh;
    }

    public void setJsydghxkzbh(String jsydghxkzbh) {
        this.jsydghxkzbh = jsydghxkzbh;
    }

    @Basic
    @Column(name = "JSGCGHXKZBH")
    public String getJsgcghxkzbh() {
        return jsgcghxkzbh;
    }

    public void setJsgcghxkzbh(String jsgcghxkzbh) {
        this.jsgcghxkzbh = jsgcghxkzbh;
    }

    @Basic
    @Column(name = "JZGCSGXKZBH")
    public String getJzgcsgxkzbh() {
        return jzgcsgxkzbh;
    }

    public void setJzgcsgxkzbh(String jzgcsgxkzbh) {
        this.jzgcsgxkzbh = jzgcsgxkzbh;
    }

    @Basic
    @Column(name = "XZYJSBH")
    public String getXzyjsbh() {
        return xzyjsbh;
    }

    public void setXzyjsbh(String xzyjsbh) {
        this.xzyjsbh = xzyjsbh;
    }

    @Basic
    @Column(name = "DCTDMJ")
    public Long getDctdmj() {
        return dctdmj;
    }

    public void setDctdmj(Long dctdmj) {
        this.dctdmj = dctdmj;
    }

    @Basic
    @Column(name = "DCJZMJ")
    public Long getDcjzmj() {
        return dcjzmj;
    }

    public void setDcjzmj(Long dcjzmj) {
        this.dcjzmj = dcjzmj;
    }

    @Basic
    @Column(name = "FWZDMJ")
    public Long getFwzdmj() {
        return fwzdmj;
    }

    public void setFwzdmj(Long fwzdmj) {
        this.fwzdmj = fwzdmj;
    }

    @Basic
    @Column(name = "FWJZZMJ")
    public Long getFwjzzmj() {
        return fwjzzmj;
    }

    public void setFwjzzmj(Long fwjzzmj) {
        this.fwjzzmj = fwjzzmj;
    }

    @Basic
    @Column(name = "DSJZZMJ")
    public Long getDsjzzmj() {
        return dsjzzmj;
    }

    public void setDsjzzmj(Long dsjzzmj) {
        this.dsjzzmj = dsjzzmj;
    }

    @Basic
    @Column(name = "DXJZZMJ")
    public Long getDxjzzmj() {
        return dxjzzmj;
    }

    public void setDxjzzmj(Long dxjzzmj) {
        this.dxjzzmj = dxjzzmj;
    }

    @Basic
    @Column(name = "DYTDZMJ")
    public Long getDytdzmj() {
        return dytdzmj;
    }

    public void setDytdzmj(Long dytdzmj) {
        this.dytdzmj = dytdzmj;
    }

    @Basic
    @Column(name = "SLRQ")
    public Time getSlrq() {
        return slrq;
    }

    public void setSlrq(Time slrq) {
        this.slrq = slrq;
    }

    @Basic
    @Column(name = "SLR")
    public String getSlr() {
        return slr;
    }

    public void setSlr(String slr) {
        this.slr = slr;
    }

    @Basic
    @Column(name = "CHZZYQ")
    public String getChzzyq() {
        return chzzyq;
    }

    public void setChzzyq(String chzzyq) {
        this.chzzyq = chzzyq;
    }

    @Basic
    @Column(name = "CHJSYQ")
    public String getChjsyq() {
        return chjsyq;
    }

    public void setChjsyq(String chjsyq) {
        this.chjsyq = chjsyq;
    }

    @Basic
    @Column(name = "JDYQ")
    public String getJdyq() {
        return jdyq;
    }

    public void setJdyq(String jdyq) {
        this.jdyq = jdyq;
    }

    @Basic
    @Column(name = "CHDW")
    public String getChdw() {
        return chdw;
    }

    public void setChdw(String chdw) {
        this.chdw = chdw;
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
    @Column(name = "CHFZR")
    public String getChfzr() {
        return chfzr;
    }

    public void setChfzr(String chfzr) {
        this.chfzr = chfzr;
    }

    @Basic
    @Column(name = "GLBM")
    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm;
    }

    @Basic
    @Column(name = "QSDCY")
    public String getQsdcy() {
        return qsdcy;
    }

    public void setQsdcy(String qsdcy) {
        this.qsdcy = qsdcy;
    }

    @Basic
    @Column(name = "JSRQ")
    public Time getJsrq() {
        return jsrq;
    }

    public void setJsrq(Time jsrq) {
        this.jsrq = jsrq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyChcgChxmEntity that = (FcjyChcgChxmEntity) o;
        return Objects.equals(xmid, that.xmid) &&
                Objects.equals(xmbh, that.xmbh) &&
                Objects.equals(cgh, that.cgh) &&
                Objects.equals(xmlx, that.xmlx) &&
                Objects.equals(xmmc, that.xmmc) &&
                Objects.equals(fdczl, that.fdczl) &&
                Objects.equals(qxh, that.qxh) &&
                Objects.equals(wtrmc, that.wtrmc) &&
                Objects.equals(wtrdz, that.wtrdz) &&
                Objects.equals(wtryzbm, that.wtryzbm) &&
                Objects.equals(wrdwlxr, that.wrdwlxr) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(wtrdzyx, that.wtrdzyx) &&
                Objects.equals(jsydghxkzbh, that.jsydghxkzbh) &&
                Objects.equals(jsgcghxkzbh, that.jsgcghxkzbh) &&
                Objects.equals(jzgcsgxkzbh, that.jzgcsgxkzbh) &&
                Objects.equals(xzyjsbh, that.xzyjsbh) &&
                Objects.equals(dctdmj, that.dctdmj) &&
                Objects.equals(dcjzmj, that.dcjzmj) &&
                Objects.equals(fwzdmj, that.fwzdmj) &&
                Objects.equals(fwjzzmj, that.fwjzzmj) &&
                Objects.equals(dsjzzmj, that.dsjzzmj) &&
                Objects.equals(dxjzzmj, that.dxjzzmj) &&
                Objects.equals(dytdzmj, that.dytdzmj) &&
                Objects.equals(slrq, that.slrq) &&
                Objects.equals(slr, that.slr) &&
                Objects.equals(chzzyq, that.chzzyq) &&
                Objects.equals(chjsyq, that.chjsyq) &&
                Objects.equals(jdyq, that.jdyq) &&
                Objects.equals(chdw, that.chdw) &&
                Objects.equals(lxr, that.lxr) &&
                Objects.equals(chfzr, that.chfzr) &&
                Objects.equals(glbm, that.glbm) &&
                Objects.equals(qsdcy, that.qsdcy) &&
                Objects.equals(jsrq, that.jsrq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xmid, xmbh, cgh, xmlx, xmmc, fdczl, qxh, wtrmc, wtrdz, wtryzbm, wrdwlxr, lxdh, wtrdzyx, jsydghxkzbh, jsgcghxkzbh, jzgcsgxkzbh, xzyjsbh, dctdmj, dcjzmj, fwzdmj, fwjzzmj, dsjzzmj, dxjzzmj, dytdzmj, slrq, slr, chzzyq, chjsyq, jdyq, chdw, lxr, chfzr, glbm, qsdcy, jsrq);
    }
}
