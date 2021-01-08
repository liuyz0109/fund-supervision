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
@Table(name = "FCJY_TJFX_CLFCJHZXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxClfcjhzxxEntity implements Serializable {
    private String id;
    private String qylx;
    private String qybh;
    private String qymc;
    private Integer xssl;
    private Long xsmj;
    private Long xsje;
    private Time tjqsrq;
    private Time tjjsrq;

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
    @Column(name = "QYMC")
    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    @Basic
    @Column(name = "XSSL")
    public Integer getXssl() {
        return xssl;
    }

    public void setXssl(Integer xssl) {
        this.xssl = xssl;
    }

    @Basic
    @Column(name = "XSMJ")
    public Long getXsmj() {
        return xsmj;
    }

    public void setXsmj(Long xsmj) {
        this.xsmj = xsmj;
    }

    @Basic
    @Column(name = "XSJE")
    public Long getXsje() {
        return xsje;
    }

    public void setXsje(Long xsje) {
        this.xsje = xsje;
    }

    @Basic
    @Column(name = "TJQSRQ")
    public Time getTjqsrq() {
        return tjqsrq;
    }

    public void setTjqsrq(Time tjqsrq) {
        this.tjqsrq = tjqsrq;
    }

    @Basic
    @Column(name = "TJJSRQ")
    public Time getTjjsrq() {
        return tjjsrq;
    }

    public void setTjjsrq(Time tjjsrq) {
        this.tjjsrq = tjjsrq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyTjfxClfcjhzxxEntity that = (FcjyTjfxClfcjhzxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qylx, that.qylx) &&
                Objects.equals(qybh, that.qybh) &&
                Objects.equals(qymc, that.qymc) &&
                Objects.equals(xssl, that.xssl) &&
                Objects.equals(xsmj, that.xsmj) &&
                Objects.equals(xsje, that.xsje) &&
                Objects.equals(tjqsrq, that.tjqsrq) &&
                Objects.equals(tjjsrq, that.tjjsrq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qylx, qybh, qymc, xssl, xsmj, xsje, tjqsrq, tjjsrq);
    }
}
