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
@Table(name = "FCJY_TJFX_XJSPFCJHZXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxXjspfcjhzxxEntity implements Serializable {
    private String id;
    private String qylx;
    private String qybh;
    private Long drqymj;
    private Integer drqyts;
    private Long drqyje;
    private Long drqyjj;
    private Long drqycxmj;
    private Integer drqycxts;
    private Long drqycxje;
    private Long drqycxjj;
    private Long drydmj;
    private Integer drydts;
    private Long drydje;
    private Long drydjj;
    private Long drydcxmj;
    private Integer drydcxts;
    private Long drydcxje;
    private Long drydcxjj;
    private Long drdjmj;
    private Integer drdjts;
    private Long drdjje;
    private Long drdjjj;
    private Long xmljqymj;
    private Integer xmljqyts;
    private Long xmljqyje;
    private Long xmljqyjj;
    private Long xmljqycxmj;
    private Integer xmljqycxts;
    private Long xmljqycxje;
    private Long xmljqycxjj;
    private Long xmljydmj;
    private Integer xmljydts;
    private Long xmljydje;
    private Long xmljydjj;
    private Long xmljydcxmj;
    private Integer xmljydcxts;
    private Long xmljydcxje;
    private Long xmljydcxjj;
    private Long xmljdjmj;
    private Integer xmljdjts;
    private Long xmljdjje;
    private Long xmljdjjj;
    private Time tjsj;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "QYLX")
    public String getQylx() {
        return qylx;
    }

    public void setQylx(String qylx) {
        this.qylx = qylx;
    }

    @Basic
    @Column(name = "QYBH")
    public String getQybh() {
        return qybh;
    }

    public void setQybh(String qybh) {
        this.qybh = qybh;
    }

    @Basic
    @Column(name = "DRQYMJ")
    public Long getDrqymj() {
        return drqymj;
    }

    public void setDrqymj(Long drqymj) {
        this.drqymj = drqymj;
    }

    @Basic
    @Column(name = "DRQYTS")
    public Integer getDrqyts() {
        return drqyts;
    }

    public void setDrqyts(Integer drqyts) {
        this.drqyts = drqyts;
    }

    @Basic
    @Column(name = "DRQYJE")
    public Long getDrqyje() {
        return drqyje;
    }

    public void setDrqyje(Long drqyje) {
        this.drqyje = drqyje;
    }

    @Basic
    @Column(name = "DRQYJJ")
    public Long getDrqyjj() {
        return drqyjj;
    }

    public void setDrqyjj(Long drqyjj) {
        this.drqyjj = drqyjj;
    }

    @Basic
    @Column(name = "DRQYCXMJ")
    public Long getDrqycxmj() {
        return drqycxmj;
    }

    public void setDrqycxmj(Long drqycxmj) {
        this.drqycxmj = drqycxmj;
    }

    @Basic
    @Column(name = "DRQYCXTS")
    public Integer getDrqycxts() {
        return drqycxts;
    }

    public void setDrqycxts(Integer drqycxts) {
        this.drqycxts = drqycxts;
    }

    @Basic
    @Column(name = "DRQYCXJE")
    public Long getDrqycxje() {
        return drqycxje;
    }

    public void setDrqycxje(Long drqycxje) {
        this.drqycxje = drqycxje;
    }

    @Basic
    @Column(name = "DRQYCXJJ")
    public Long getDrqycxjj() {
        return drqycxjj;
    }

    public void setDrqycxjj(Long drqycxjj) {
        this.drqycxjj = drqycxjj;
    }

    @Basic
    @Column(name = "DRYDMJ")
    public Long getDrydmj() {
        return drydmj;
    }

    public void setDrydmj(Long drydmj) {
        this.drydmj = drydmj;
    }

    @Basic
    @Column(name = "DRYDTS")
    public Integer getDrydts() {
        return drydts;
    }

    public void setDrydts(Integer drydts) {
        this.drydts = drydts;
    }

    @Basic
    @Column(name = "DRYDJE")
    public Long getDrydje() {
        return drydje;
    }

    public void setDrydje(Long drydje) {
        this.drydje = drydje;
    }

    @Basic
    @Column(name = "DRYDJJ")
    public Long getDrydjj() {
        return drydjj;
    }

    public void setDrydjj(Long drydjj) {
        this.drydjj = drydjj;
    }

    @Basic
    @Column(name = "DRYDCXMJ")
    public Long getDrydcxmj() {
        return drydcxmj;
    }

    public void setDrydcxmj(Long drydcxmj) {
        this.drydcxmj = drydcxmj;
    }

    @Basic
    @Column(name = "DRYDCXTS")
    public Integer getDrydcxts() {
        return drydcxts;
    }

    public void setDrydcxts(Integer drydcxts) {
        this.drydcxts = drydcxts;
    }

    @Basic
    @Column(name = "DRYDCXJE")
    public Long getDrydcxje() {
        return drydcxje;
    }

    public void setDrydcxje(Long drydcxje) {
        this.drydcxje = drydcxje;
    }

    @Basic
    @Column(name = "DRYDCXJJ")
    public Long getDrydcxjj() {
        return drydcxjj;
    }

    public void setDrydcxjj(Long drydcxjj) {
        this.drydcxjj = drydcxjj;
    }

    @Basic
    @Column(name = "DRDJMJ")
    public Long getDrdjmj() {
        return drdjmj;
    }

    public void setDrdjmj(Long drdjmj) {
        this.drdjmj = drdjmj;
    }

    @Basic
    @Column(name = "DRDJTS")
    public Integer getDrdjts() {
        return drdjts;
    }

    public void setDrdjts(Integer drdjts) {
        this.drdjts = drdjts;
    }

    @Basic
    @Column(name = "DRDJJE")
    public Long getDrdjje() {
        return drdjje;
    }

    public void setDrdjje(Long drdjje) {
        this.drdjje = drdjje;
    }

    @Basic
    @Column(name = "DRDJJJ")
    public Long getDrdjjj() {
        return drdjjj;
    }

    public void setDrdjjj(Long drdjjj) {
        this.drdjjj = drdjjj;
    }

    @Basic
    @Column(name = "XMLJQYMJ")
    public Long getXmljqymj() {
        return xmljqymj;
    }

    public void setXmljqymj(Long xmljqymj) {
        this.xmljqymj = xmljqymj;
    }

    @Basic
    @Column(name = "XMLJQYTS")
    public Integer getXmljqyts() {
        return xmljqyts;
    }

    public void setXmljqyts(Integer xmljqyts) {
        this.xmljqyts = xmljqyts;
    }

    @Basic
    @Column(name = "XMLJQYJE")
    public Long getXmljqyje() {
        return xmljqyje;
    }

    public void setXmljqyje(Long xmljqyje) {
        this.xmljqyje = xmljqyje;
    }

    @Basic
    @Column(name = "XMLJQYJJ")
    public Long getXmljqyjj() {
        return xmljqyjj;
    }

    public void setXmljqyjj(Long xmljqyjj) {
        this.xmljqyjj = xmljqyjj;
    }

    @Basic
    @Column(name = "XMLJQYCXMJ")
    public Long getXmljqycxmj() {
        return xmljqycxmj;
    }

    public void setXmljqycxmj(Long xmljqycxmj) {
        this.xmljqycxmj = xmljqycxmj;
    }

    @Basic
    @Column(name = "XMLJQYCXTS")
    public Integer getXmljqycxts() {
        return xmljqycxts;
    }

    public void setXmljqycxts(Integer xmljqycxts) {
        this.xmljqycxts = xmljqycxts;
    }

    @Basic
    @Column(name = "XMLJQYCXJE")
    public Long getXmljqycxje() {
        return xmljqycxje;
    }

    public void setXmljqycxje(Long xmljqycxje) {
        this.xmljqycxje = xmljqycxje;
    }

    @Basic
    @Column(name = "XMLJQYCXJJ")
    public Long getXmljqycxjj() {
        return xmljqycxjj;
    }

    public void setXmljqycxjj(Long xmljqycxjj) {
        this.xmljqycxjj = xmljqycxjj;
    }

    @Basic
    @Column(name = "XMLJYDMJ")
    public Long getXmljydmj() {
        return xmljydmj;
    }

    public void setXmljydmj(Long xmljydmj) {
        this.xmljydmj = xmljydmj;
    }

    @Basic
    @Column(name = "XMLJYDTS")
    public Integer getXmljydts() {
        return xmljydts;
    }

    public void setXmljydts(Integer xmljydts) {
        this.xmljydts = xmljydts;
    }

    @Basic
    @Column(name = "XMLJYDJE")
    public Long getXmljydje() {
        return xmljydje;
    }

    public void setXmljydje(Long xmljydje) {
        this.xmljydje = xmljydje;
    }

    @Basic
    @Column(name = "XMLJYDJJ")
    public Long getXmljydjj() {
        return xmljydjj;
    }

    public void setXmljydjj(Long xmljydjj) {
        this.xmljydjj = xmljydjj;
    }

    @Basic
    @Column(name = "XMLJYDCXMJ")
    public Long getXmljydcxmj() {
        return xmljydcxmj;
    }

    public void setXmljydcxmj(Long xmljydcxmj) {
        this.xmljydcxmj = xmljydcxmj;
    }

    @Basic
    @Column(name = "XMLJYDCXTS")
    public Integer getXmljydcxts() {
        return xmljydcxts;
    }

    public void setXmljydcxts(Integer xmljydcxts) {
        this.xmljydcxts = xmljydcxts;
    }

    @Basic
    @Column(name = "XMLJYDCXJE")
    public Long getXmljydcxje() {
        return xmljydcxje;
    }

    public void setXmljydcxje(Long xmljydcxje) {
        this.xmljydcxje = xmljydcxje;
    }

    @Basic
    @Column(name = "XMLJYDCXJJ")
    public Long getXmljydcxjj() {
        return xmljydcxjj;
    }

    public void setXmljydcxjj(Long xmljydcxjj) {
        this.xmljydcxjj = xmljydcxjj;
    }

    @Basic
    @Column(name = "XMLJDJMJ")
    public Long getXmljdjmj() {
        return xmljdjmj;
    }

    public void setXmljdjmj(Long xmljdjmj) {
        this.xmljdjmj = xmljdjmj;
    }

    @Basic
    @Column(name = "XMLJDJTS")
    public Integer getXmljdjts() {
        return xmljdjts;
    }

    public void setXmljdjts(Integer xmljdjts) {
        this.xmljdjts = xmljdjts;
    }

    @Basic
    @Column(name = "XMLJDJJE")
    public Long getXmljdjje() {
        return xmljdjje;
    }

    public void setXmljdjje(Long xmljdjje) {
        this.xmljdjje = xmljdjje;
    }

    @Basic
    @Column(name = "XMLJDJJJ")
    public Long getXmljdjjj() {
        return xmljdjjj;
    }

    public void setXmljdjjj(Long xmljdjjj) {
        this.xmljdjjj = xmljdjjj;
    }

    @Basic
    @Column(name = "TJSJ")
    public Time getTjsj() {
        return tjsj;
    }

    public void setTjsj(Time tjsj) {
        this.tjsj = tjsj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxXjspfcjhzxxEntity that = (FcjyTjfxXjspfcjhzxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qylx, that.qylx) &&
                Objects.equals(qybh, that.qybh) &&
                Objects.equals(drqymj, that.drqymj) &&
                Objects.equals(drqyts, that.drqyts) &&
                Objects.equals(drqyje, that.drqyje) &&
                Objects.equals(drqyjj, that.drqyjj) &&
                Objects.equals(drqycxmj, that.drqycxmj) &&
                Objects.equals(drqycxts, that.drqycxts) &&
                Objects.equals(drqycxje, that.drqycxje) &&
                Objects.equals(drqycxjj, that.drqycxjj) &&
                Objects.equals(drydmj, that.drydmj) &&
                Objects.equals(drydts, that.drydts) &&
                Objects.equals(drydje, that.drydje) &&
                Objects.equals(drydjj, that.drydjj) &&
                Objects.equals(drydcxmj, that.drydcxmj) &&
                Objects.equals(drydcxts, that.drydcxts) &&
                Objects.equals(drydcxje, that.drydcxje) &&
                Objects.equals(drydcxjj, that.drydcxjj) &&
                Objects.equals(drdjmj, that.drdjmj) &&
                Objects.equals(drdjts, that.drdjts) &&
                Objects.equals(drdjje, that.drdjje) &&
                Objects.equals(drdjjj, that.drdjjj) &&
                Objects.equals(xmljqymj, that.xmljqymj) &&
                Objects.equals(xmljqyts, that.xmljqyts) &&
                Objects.equals(xmljqyje, that.xmljqyje) &&
                Objects.equals(xmljqyjj, that.xmljqyjj) &&
                Objects.equals(xmljqycxmj, that.xmljqycxmj) &&
                Objects.equals(xmljqycxts, that.xmljqycxts) &&
                Objects.equals(xmljqycxje, that.xmljqycxje) &&
                Objects.equals(xmljqycxjj, that.xmljqycxjj) &&
                Objects.equals(xmljydmj, that.xmljydmj) &&
                Objects.equals(xmljydts, that.xmljydts) &&
                Objects.equals(xmljydje, that.xmljydje) &&
                Objects.equals(xmljydjj, that.xmljydjj) &&
                Objects.equals(xmljydcxmj, that.xmljydcxmj) &&
                Objects.equals(xmljydcxts, that.xmljydcxts) &&
                Objects.equals(xmljydcxje, that.xmljydcxje) &&
                Objects.equals(xmljydcxjj, that.xmljydcxjj) &&
                Objects.equals(xmljdjmj, that.xmljdjmj) &&
                Objects.equals(xmljdjts, that.xmljdjts) &&
                Objects.equals(xmljdjje, that.xmljdjje) &&
                Objects.equals(xmljdjjj, that.xmljdjjj) &&
                Objects.equals(tjsj, that.tjsj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qylx, qybh, drqymj, drqyts, drqyje, drqyjj, drqycxmj, drqycxts, drqycxje, drqycxjj, drydmj, drydts, drydje, drydjj, drydcxmj, drydcxts, drydcxje, drydcxjj, drdjmj, drdjts, drdjje, drdjjj, xmljqymj, xmljqyts, xmljqyje, xmljqyjj, xmljqycxmj, xmljqycxts, xmljqycxje, xmljqycxjj, xmljydmj, xmljydts, xmljydje, xmljydjj, xmljydcxmj, xmljydcxts, xmljydcxje, xmljydcxjj, xmljdjmj, xmljdjts, xmljdjje, xmljdjjj, tjsj);
    }
}
