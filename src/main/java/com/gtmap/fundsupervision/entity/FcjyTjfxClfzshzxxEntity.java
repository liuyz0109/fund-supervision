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
@Table(name = "FCJY_TJFX_CLFZSHZXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxClfzshzxxEntity implements Serializable {
    private String id;
    private String qylx;
    private String qybh;
    private Long mj;
    private Integer ts;
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
    @Column(name = "MJ")
    public Long getMj() {
        return mj;
    }

    public void setMj(Long mj) {
        this.mj = mj;
    }

    @Basic
    @Column(name = "TS")
    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
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
        FcjyTjfxClfzshzxxEntity that = (FcjyTjfxClfzshzxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qylx, that.qylx) &&
                Objects.equals(qybh, that.qybh) &&
                Objects.equals(mj, that.mj) &&
                Objects.equals(ts, that.ts) &&
                Objects.equals(tjqsrq, that.tjqsrq) &&
                Objects.equals(tjjsrq, that.tjjsrq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qylx, qybh, mj, ts, tjqsrq, tjjsrq);
    }
}
