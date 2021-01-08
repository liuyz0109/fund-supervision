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
@Table(name = "FCJY_CHCG_CGSH", schema = "SCOTT", catalog = "")
public class FcjyChcgCgshEntity implements Serializable {
    private String sjxxbh;
    private Long xmbh;
    private String shyd;
    private String shyj;
    private String shjg;
    private String bz;

    @Id
    @Column(name = "SJXXBH")
    public String getSjxxbh() {
        return sjxxbh;
    }

    public void setSjxxbh(String sjxxbh) {
        this.sjxxbh = sjxxbh;
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
    @Column(name = "SHYD")
    public String getShyd() {
        return shyd;
    }

    public void setShyd(String shyd) {
        this.shyd = shyd;
    }

    @Basic
    @Column(name = "SHYJ")
    public String getShyj() {
        return shyj;
    }

    public void setShyj(String shyj) {
        this.shyj = shyj;
    }

    @Basic
    @Column(name = "SHJG")
    public String getShjg() {
        return shjg;
    }

    public void setShjg(String shjg) {
        this.shjg = shjg;
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
        FcjyChcgCgshEntity that = (FcjyChcgCgshEntity) o;
        return Objects.equals(sjxxbh, that.sjxxbh) &&
                Objects.equals(xmbh, that.xmbh) &&
                Objects.equals(shyd, that.shyd) &&
                Objects.equals(shyj, that.shyj) &&
                Objects.equals(shjg, that.shjg) &&
                Objects.equals(bz, that.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sjxxbh, xmbh, shyd, shyj, shjg, bz);
    }
}
