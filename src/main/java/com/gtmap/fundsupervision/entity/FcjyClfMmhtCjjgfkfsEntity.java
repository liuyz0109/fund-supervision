package com.gtmap.fundsupervision.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description
 */
@Entity
@Table(name = "FCJY_CLF_MMHT_CJJGFKFS", schema = "SCOTT", catalog = "")
public class FcjyClfMmhtCjjgfkfsEntity implements Serializable {
    private String id;
    private String htid;
    private String sfdl;
    private Long mmfjk;
    private String fkfs;
    private Long ycxfkjgje;
    private String ycxfkyh;
    private String ycxfkhm;
    private String ycxfkzh;
    private Long yhdksf;
    private Long yhdkdkje;
    private String yhdkdkzl;
    private String grzhkhyh;
    private String grzhhm;
    private String grzhzh;
    private String sfzjjg;
    private Long zjjgje;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HTID")
    public String getHtid() {
        return htid;
    }

    public void setHtid(String htid) {
        this.htid = htid;
    }

    @Basic
    @Column(name = "SFDL")
    public String getSfdl() {
        return sfdl;
    }

    public void setSfdl(String sfdl) {
        this.sfdl = sfdl;
    }

    @Basic
    @Column(name = "MMFJK")
    public Long getMmfjk() {
        return mmfjk;
    }

    public void setMmfjk(Long mmfjk) {
        this.mmfjk = mmfjk;
    }

    @Basic
    @Column(name = "FKFS")
    public String getFkfs() {
        return fkfs;
    }

    public void setFkfs(String fkfs) {
        this.fkfs = fkfs;
    }

    @Basic
    @Column(name = "YCXFKJGJE")
    public Long getYcxfkjgje() {
        return ycxfkjgje;
    }

    public void setYcxfkjgje(Long ycxfkjgje) {
        this.ycxfkjgje = ycxfkjgje;
    }

    @Basic
    @Column(name = "YCXFKYH")
    public String getYcxfkyh() {
        return ycxfkyh;
    }

    public void setYcxfkyh(String ycxfkyh) {
        this.ycxfkyh = ycxfkyh;
    }

    @Basic
    @Column(name = "YCXFKHM")
    public String getYcxfkhm() {
        return ycxfkhm;
    }

    public void setYcxfkhm(String ycxfkhm) {
        this.ycxfkhm = ycxfkhm;
    }

    @Basic
    @Column(name = "YCXFKZH")
    public String getYcxfkzh() {
        return ycxfkzh;
    }

    public void setYcxfkzh(String ycxfkzh) {
        this.ycxfkzh = ycxfkzh;
    }

    @Basic
    @Column(name = "YHDKSF")
    public Long getYhdksf() {
        return yhdksf;
    }

    public void setYhdksf(Long yhdksf) {
        this.yhdksf = yhdksf;
    }

    @Basic
    @Column(name = "YHDKDKJE")
    public Long getYhdkdkje() {
        return yhdkdkje;
    }

    public void setYhdkdkje(Long yhdkdkje) {
        this.yhdkdkje = yhdkdkje;
    }

    @Basic
    @Column(name = "YHDKDKZL")
    public String getYhdkdkzl() {
        return yhdkdkzl;
    }

    public void setYhdkdkzl(String yhdkdkzl) {
        this.yhdkdkzl = yhdkdkzl;
    }

    @Basic
    @Column(name = "GRZHKHYH")
    public String getGrzhkhyh() {
        return grzhkhyh;
    }

    public void setGrzhkhyh(String grzhkhyh) {
        this.grzhkhyh = grzhkhyh;
    }

    @Basic
    @Column(name = "GRZHHM")
    public String getGrzhhm() {
        return grzhhm;
    }

    public void setGrzhhm(String grzhhm) {
        this.grzhhm = grzhhm;
    }

    @Basic
    @Column(name = "GRZHZH")
    public String getGrzhzh() {
        return grzhzh;
    }

    public void setGrzhzh(String grzhzh) {
        this.grzhzh = grzhzh;
    }

    @Basic
    @Column(name = "SFZJJG")
    public String getSfzjjg() {
        return sfzjjg;
    }

    public void setSfzjjg(String sfzjjg) {
        this.sfzjjg = sfzjjg;
    }

    @Basic
    @Column(name = "ZJJGJE")
    public Long getZjjgje() {
        return zjjgje;
    }

    public void setZjjgje(Long zjjgje) {
        this.zjjgje = zjjgje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfMmhtCjjgfkfsEntity that = (FcjyClfMmhtCjjgfkfsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(htid, that.htid) &&
                Objects.equals(sfdl, that.sfdl) &&
                Objects.equals(mmfjk, that.mmfjk) &&
                Objects.equals(fkfs, that.fkfs) &&
                Objects.equals(ycxfkjgje, that.ycxfkjgje) &&
                Objects.equals(ycxfkyh, that.ycxfkyh) &&
                Objects.equals(ycxfkhm, that.ycxfkhm) &&
                Objects.equals(ycxfkzh, that.ycxfkzh) &&
                Objects.equals(yhdksf, that.yhdksf) &&
                Objects.equals(yhdkdkje, that.yhdkdkje) &&
                Objects.equals(yhdkdkzl, that.yhdkdkzl) &&
                Objects.equals(grzhkhyh, that.grzhkhyh) &&
                Objects.equals(grzhhm, that.grzhhm) &&
                Objects.equals(grzhzh, that.grzhzh) &&
                Objects.equals(sfzjjg, that.sfzjjg) &&
                Objects.equals(zjjgje, that.zjjgje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, htid, sfdl, mmfjk, fkfs, ycxfkjgje, ycxfkyh, ycxfkhm, ycxfkzh, yhdksf, yhdkdkje, yhdkdkzl, grzhkhyh, grzhhm, grzhzh, sfzjjg, zjjgje);
    }
}
