package com.hbue.qipai.zhengxin.entity;

/**
 * 实体类对象
 *      JavaBean
 */
public class TInproduct {
    private Integer DId;
    private Integer PId;
    private Integer EId;
    private String DRemark;
    private Integer DInteger;
    private String DTime;

    public TInproduct() {
    }

    public TInproduct(Integer DId, Integer PId, Integer EId, String DRemark, Integer DInteger, String DTime) {
        this.DId = DId;
        this.PId = PId;
        this.EId = EId;
        this.DRemark = DRemark;
        this.DInteger = DInteger;
        this.DTime = DTime;
    }

    public TInproduct(Integer PId, Integer EId, String DRemark, Integer DInteger, String DTime) {
        this.PId = PId;
        this.EId = EId;
        this.DRemark = DRemark;
        this.DInteger = DInteger;
        this.DTime = DTime;
    }

    public Integer getDId() {
        return DId;
    }

    public void setDId(Integer DId) {
        this.DId = DId;
    }

    public Integer getPId() {
        return PId;
    }

    public void setPId(Integer PId) {
        this.PId = PId;
    }

    public Integer getEId() {
        return EId;
    }

    public void setEId(Integer EId) {
        this.EId = EId;
    }

    public String getDRemark() {
        return DRemark;
    }

    public void setDRemark(String DRemark) {
        this.DRemark = DRemark;
    }

    public Integer getDInteger() {
        return DInteger;
    }

    public void setDInteger(Integer DInteger) {
        this.DInteger = DInteger;
    }

    public String getDTime() {
        return DTime;
    }

    public void setDTime(String DTime) {
        this.DTime = DTime;
    }

    @Override
    public String toString() {
        return "TInproduct{" +
                "DId=" + DId +
                ", PId=" + PId +
                ", EId=" + EId +
                ", DRemark='" + DRemark + '\'' +
                ", DInteger=" + DInteger +
                ", DTime='" + DTime + '\'' +
                '}';
    }
}
