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
@Table(name = "FCJY_ZD_CLFGPZT", schema = "SCOTT", catalog = "")
public class FcjyZdClfgpztEntity implements Serializable {
    private String dm;
    private String mc;

    @Id
    @Column(name = "DM")
    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    @Basic
    @Column(name = "MC")
    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FcjyZdClfgpztEntity that = (FcjyZdClfgpztEntity) o;
        return Objects.equals(dm, that.dm) &&
                Objects.equals(mc, that.mc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dm, mc);
    }
}
