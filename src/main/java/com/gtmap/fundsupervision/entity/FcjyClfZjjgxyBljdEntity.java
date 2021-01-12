package com.gtmap.fundsupervision.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/29
 * @description 办理进度
 */
@Entity
@Table(name = "FCJY_CLF_ZJJGXY_BLJD", schema = "SCOTT")
public class FcjyClfZjjgxyBljdEntity implements Serializable {
    private String xybhjd; //监管id
    private String xyqdrjd;
    private String xyqdrqjd;
    private String jktzsfsc; //交款通知
    private String jktzscr;
    private String jktzscrq;
    private String jkqrsfqr; //交款确认
    private String jkqrqrr;
    private String jkqrqrrq;
    private String xycxsfcx; //协议撤销
    private String xycxcxr;
    private String xycxcxrq;
    private String sczqpzsfsc; //支取通知
    private String sczqpzscr;
    private String sczqpzscrq;
    private String zqqrsfqr; //支取确认
    private String zqqrqrr;
    private String zqqrqrrq;
    private String bjqrsfbj; //办结确认
    private String bjqrbjr;
    private String bjqrbjrq;

    @Id
    @Column(name = "XYBHJD")
    public String getXybhjd() {
        return xybhjd;
    }

    public void setXybhjd(String xybhjd) {
        this.xybhjd = xybhjd;
    }

    @Basic
    @Column(name = "XYQDRJD")
    public String getXyqdrjd() {
        return xyqdrjd;
    }

    public void setXyqdrjd(String xyqdrjd) {
        this.xyqdrjd = xyqdrjd;
    }

    @Basic
    @Column(name = "XYQDRQJD")
    public String getXyqdrqjd() {
        return xyqdrqjd;
    }

    public void setXyqdrqjd(String xyqdrqjd) {
        this.xyqdrqjd = xyqdrqjd;
    }

    @Basic
    @Column(name = "JKTZSFSC")
    public String getJktzsfsc() {
        return jktzsfsc;
    }

    public void setJktzsfsc(String jktzsfsc) {
        this.jktzsfsc = jktzsfsc;
    }

    @Basic
    @Column(name = "JKTZSCR")
    public String getJktzscr() {
        return jktzscr;
    }

    public void setJktzscr(String jktzscr) {
        this.jktzscr = jktzscr;
    }

    @Basic
    @Column(name = "JKTZSCRQ")
    public String getJktzscrq() {
        return jktzscrq;
    }

    public void setJktzscrq(String jktzscrq) {
        this.jktzscrq = jktzscrq;
    }

    @Basic
    @Column(name = "JKQRSFQR")
    public String getJkqrsfqr() {
        return jkqrsfqr;
    }

    public void setJkqrsfqr(String jkqrsfqr) {
        this.jkqrsfqr = jkqrsfqr;
    }

    @Basic
    @Column(name = "JKQRQRR")
    public String getJkqrqrr() {
        return jkqrqrr;
    }

    public void setJkqrqrr(String jkqrqrr) {
        this.jkqrqrr = jkqrqrr;
    }

    @Basic
    @Column(name = "JKQRQRRQ")
    public String getJkqrqrrq() {
        return jkqrqrrq;
    }

    public void setJkqrqrrq(String jkqrqrrq) {
        this.jkqrqrrq = jkqrqrrq;
    }

    @Basic
    @Column(name = "XYCXSFCX")
    public String getXycxsfcx() {
        return xycxsfcx;
    }

    public void setXycxsfcx(String xycxsfcx) {
        this.xycxsfcx = xycxsfcx;
    }

    @Basic
    @Column(name = "XYCXCXR")
    public String getXycxcxr() {
        return xycxcxr;
    }

    public void setXycxcxr(String xycxcxr) {
        this.xycxcxr = xycxcxr;
    }

    @Basic
    @Column(name = "XYCXCXRQ")
    public String getXycxcxrq() {
        return xycxcxrq;
    }

    public void setXycxcxrq(String xycxcxrq) {
        this.xycxcxrq = xycxcxrq;
    }

    @Basic
    @Column(name = "SCZQPZSFSC")
    public String getSczqpzsfsc() {
        return sczqpzsfsc;
    }

    public void setSczqpzsfsc(String sczqpzsfsc) {
        this.sczqpzsfsc = sczqpzsfsc;
    }

    @Basic
    @Column(name = "SCZQPZSCR")
    public String getSczqpzscr() {
        return sczqpzscr;
    }

    public void setSczqpzscr(String sczqpzscr) {
        this.sczqpzscr = sczqpzscr;
    }

    @Basic
    @Column(name = "SCZQPZSCRQ")
    public String getSczqpzscrq() {
        return sczqpzscrq;
    }

    public void setSczqpzscrq(String sczqpzscrq) {
        this.sczqpzscrq = sczqpzscrq;
    }

    @Basic
    @Column(name = "ZQQRSFQR")
    public String getZqqrsfqr() {
        return zqqrsfqr;
    }

    public void setZqqrsfqr(String zqqrsfqr) {
        this.zqqrsfqr = zqqrsfqr;
    }

    @Basic
    @Column(name = "ZQQRQRR")
    public String getZqqrqrr() {
        return zqqrqrr;
    }

    public void setZqqrqrr(String zqqrqrr) {
        this.zqqrqrr = zqqrqrr;
    }

    @Basic
    @Column(name = "ZQQRQRRQ")
    public String getZqqrqrrq() {
        return zqqrqrrq;
    }

    public void setZqqrqrrq(String zqqrqrrq) {
        this.zqqrqrrq = zqqrqrrq;
    }

    @Basic
    @Column(name = "BJQRSFBJ")
    public String getBjqrsfbj() {
        return bjqrsfbj;
    }

    public void setBjqrsfbj(String bjqrsfbj) {
        this.bjqrsfbj = bjqrsfbj;
    }

    @Basic
    @Column(name = "BJQRBJR")
    public String getBjqrbjr() {
        return bjqrbjr;
    }

    public void setBjqrbjr(String bjqrbjr) {
        this.bjqrbjr = bjqrbjr;
    }

    @Basic
    @Column(name = "BJQRBJRQ")
    public String getBjqrbjrq() {
        return bjqrbjrq;
    }

    public void setBjqrbjrq(String bjqrbjrq) {
        this.bjqrbjrq = bjqrbjrq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfZjjgxyBljdEntity that = (FcjyClfZjjgxyBljdEntity) o;
        return Objects.equals(xybhjd, that.xybhjd) &&
                Objects.equals(xyqdrjd, that.xyqdrjd) &&
                Objects.equals(xyqdrqjd, that.xyqdrqjd) &&
                Objects.equals(jktzsfsc, that.jktzsfsc) &&
                Objects.equals(jktzscr, that.jktzscr) &&
                Objects.equals(jktzscrq, that.jktzscrq) &&
                Objects.equals(jkqrsfqr, that.jkqrsfqr) &&
                Objects.equals(jkqrqrr, that.jkqrqrr) &&
                Objects.equals(jkqrqrrq, that.jkqrqrrq) &&
                Objects.equals(xycxsfcx, that.xycxsfcx) &&
                Objects.equals(xycxcxr, that.xycxcxr) &&
                Objects.equals(xycxcxrq, that.xycxcxrq) &&
                Objects.equals(sczqpzsfsc, that.sczqpzsfsc) &&
                Objects.equals(sczqpzscr, that.sczqpzscr) &&
                Objects.equals(sczqpzscrq, that.sczqpzscrq) &&
                Objects.equals(zqqrsfqr, that.zqqrsfqr) &&
                Objects.equals(zqqrqrr, that.zqqrqrr) &&
                Objects.equals(zqqrqrrq, that.zqqrqrrq) &&
                Objects.equals(bjqrsfbj, that.bjqrsfbj) &&
                Objects.equals(bjqrbjr, that.bjqrbjr) &&
                Objects.equals(bjqrbjrq, that.bjqrbjrq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xybhjd, xyqdrjd, xyqdrqjd, jktzsfsc, jktzscr, jktzscrq, jkqrsfqr, jkqrqrr, jkqrqrrq, xycxsfcx, xycxcxr, xycxcxrq, sczqpzsfsc, sczqpzscr, sczqpzscrq, zqqrsfqr, zqqrqrr, zqqrqrrq, bjqrsfbj, bjqrbjr, bjqrbjrq);
    }
}
