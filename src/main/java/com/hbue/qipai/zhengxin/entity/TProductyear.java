package com.hbue.qipai.zhengxin.entity;

/**
 * 实体类对象
 *      JavaBean
 */
public class TProductyear {
    private Integer YId;
    private Integer PId;
    private String YName;
    private Integer YPrice;

    public TProductyear() {
    }

    public TProductyear(Integer YId, Integer PId, String YName, Integer YPrice) {
        this.YId = YId;
        this.PId = PId;
        this.YName = YName;
        this.YPrice = YPrice;
    }

    public TProductyear(Integer PId, String YName, Integer YPrice) {
        this.PId = PId;
        this.YName = YName;
        this.YPrice = YPrice;
    }

    public Integer getYId() {
        return YId;
    }

    public void setYId(Integer YId) {
        this.YId = YId;
    }

    public Integer getPId() {
        return PId;
    }

    public void setPId(Integer PId) {
        this.PId = PId;
    }

    public String getYName() {
        return YName;
    }

    public void setYName(String YName) {
        this.YName = YName;
    }

    public Integer getYPrice() {
        return YPrice;
    }

    public void setYPrice(Integer YPrice) {
        this.YPrice = YPrice;
    }

    @Override
    public String toString() {
        return "TProductyear{" +
                "YId=" + YId +
                ", PId=" + PId +
                ", YName='" + YName + '\'' +
                ", YPrice=" + YPrice +
                '}';
    }
}
