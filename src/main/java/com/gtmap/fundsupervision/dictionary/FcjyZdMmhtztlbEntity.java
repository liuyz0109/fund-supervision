package com.gtmap.fundsupervision.dictionary;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/17
 * @description
 */
@Entity
@Table(name = "FCJY_ZD_MMHTZTLB", schema = "SCOTT", catalog = "")
public class FcjyZdMmhtztlbEntity implements Serializable {
    private String dm;
    private String dc;

    @Id
    @Column(name = "DM")
    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    @Basic
    @Column(name = "DC")
    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyZdMmhtztlbEntity that = (FcjyZdMmhtztlbEntity) o;
        return Objects.equals(dm, that.dm) &&
                Objects.equals(dc, that.dc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dm, dc);
    }
}
