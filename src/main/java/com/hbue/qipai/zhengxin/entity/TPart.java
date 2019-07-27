package com.hbue.qipai.zhengxin.entity;


/**
 * 实体类对象
 *      JavaBean
 */
public class TPart{
    private Integer PId;
    private String PName;
    private String PRemark;
    private Integer PIs;

    public TPart() {
    }

    public TPart(Integer PId, String PName, String PRemark, Integer PIs) {
        this.PId = PId;
        this.PName = PName;
        this.PRemark = PRemark;
        this.PIs = PIs;
    }

    public TPart(String PName, String PRemark, Integer PIs) {
        this.PName = PName;
        this.PRemark = PRemark;
        this.PIs = PIs;
    }

    public Integer getPId() {
        return PId;
    }

    public void setPId(Integer PId) {
        this.PId = PId;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getPRemark() {
        return PRemark;
    }

    public void setPRemark(String PRemark) {
        this.PRemark = PRemark;
    }

    public Integer getPIs() {
        return PIs;
    }

    public void setPIs(Integer PIs) {
        this.PIs = PIs;
    }

    @Override
    public String toString() {
        return "TPart{" +
                "PId=" + PId +
                ", PName='" + PName + '\'' +
                ", PRemark='" + PRemark + '\'' +
                ", PIs=" + PIs +
                '}';
    }
}
