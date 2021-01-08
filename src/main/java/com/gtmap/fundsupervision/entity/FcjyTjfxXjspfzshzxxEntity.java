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
@Table(name = "FCJY_TJFX_XJSPFZSHZXX", schema = "SCOTT", catalog = "")
public class FcjyTjfxXjspfzshzxxEntity implements Serializable {
    private String id;
    private String qylx;
    private String qybh;
    private Integer zksts;
    private Long zksmj;
    private Integer ysts;
    private Long ysmj;
    private Integer ydts;
    private Long ydmj;
    private Integer djts;
    private Long djmj;
    private Integer zts;
    private Long zmj;
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
    @Column(name = "ZKSTS")
    public Integer getZksts() {
        return zksts;
    }

    public void setZksts(Integer zksts) {
        this.zksts = zksts;
    }

    @Basic
    @Column(name = "ZKSMJ")
    public Long getZksmj() {
        return zksmj;
    }

    public void setZksmj(Long zksmj) {
        this.zksmj = zksmj;
    }

    @Basic
    @Column(name = "YSTS")
    public Integer getYsts() {
        return ysts;
    }

    public void setYsts(Integer ysts) {
        this.ysts = ysts;
    }

    @Basic
    @Column(name = "YSMJ")
    public Long getYsmj() {
        return ysmj;
    }

    public void setYsmj(Long ysmj) {
        this.ysmj = ysmj;
    }

    @Basic
    @Column(name = "YDTS")
    public Integer getYdts() {
        return ydts;
    }

    public void setYdts(Integer ydts) {
        this.ydts = ydts;
    }

    @Basic
    @Column(name = "YDMJ")
    public Long getYdmj() {
        return ydmj;
    }

    public void setYdmj(Long ydmj) {
        this.ydmj = ydmj;
    }

    @Basic
    @Column(name = "DJTS")
    public Integer getDjts() {
        return djts;
    }

    public void setDjts(Integer djts) {
        this.djts = djts;
    }

    @Basic
    @Column(name = "DJMJ")
    public Long getDjmj() {
        return djmj;
    }

    public void setDjmj(Long djmj) {
        this.djmj = djmj;
    }

    @Basic
    @Column(name = "ZTS")
    public Integer getZts() {
        return zts;
    }

    public void setZts(Integer zts) {
        this.zts = zts;
    }

    @Basic
    @Column(name = "ZMJ")
    public Long getZmj() {
        return zmj;
    }

    public void setZmj(Long zmj) {
        this.zmj = zmj;
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
        FcjyTjfxXjspfzshzxxEntity that = (FcjyTjfxXjspfzshzxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qylx, that.qylx) &&
                Objects.equals(qybh, that.qybh) &&
                Objects.equals(zksts, that.zksts) &&
                Objects.equals(zksmj, that.zksmj) &&
                Objects.equals(ysts, that.ysts) &&
                Objects.equals(ysmj, that.ysmj) &&
                Objects.equals(ydts, that.ydts) &&
                Objects.equals(ydmj, that.ydmj) &&
                Objects.equals(djts, that.djts) &&
                Objects.equals(djmj, that.djmj) &&
                Objects.equals(zts, that.zts) &&
                Objects.equals(zmj, that.zmj) &&
                Objects.equals(tjsj, that.tjsj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qylx, qybh, zksts, zksmj, ysts, ysmj, ydts, ydmj, djts, djmj, zts, zmj, tjsj);
    }
}
