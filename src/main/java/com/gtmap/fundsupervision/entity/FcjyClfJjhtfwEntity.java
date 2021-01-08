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
@Table(name = "FCJY_CLF_JJHTFW", schema = "SCOTT", catalog = "")
public class FcjyClfJjhtfwEntity implements Serializable {
    private Long jjhtbh;
    private String hbh;

    @Id
    @Column(name = "JJHTBH")
    public Long getJjhtbh() {
        return jjhtbh;
    }

    public void setJjhtbh(Long jjhtbh) {
        this.jjhtbh = jjhtbh;
    }

    @Basic
    @Column(name = "HBH")
    public String getHbh() {
        return hbh;
    }

    public void setHbh(String hbh) {
        this.hbh = hbh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyClfJjhtfwEntity that = (FcjyClfJjhtfwEntity) o;
        return Objects.equals(jjhtbh, that.jjhtbh) &&
                Objects.equals(hbh, that.hbh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jjhtbh, hbh);
    }
}
