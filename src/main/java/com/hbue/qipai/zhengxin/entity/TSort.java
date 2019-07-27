package com.hbue.qipai.zhengxin.entity;

/**
 * 实体类对象
 *      JavaBean
 */
public class TSort {
    private Integer SId;
    private String SName;
    private String SRemark;
    private Integer SIs;

    public TSort() {
    }

    public TSort(Integer SId, String SName, String SRemark, Integer SIs) {
        this.SId = SId;
        this.SName = SName;
        this.SRemark = SRemark;
        this.SIs = SIs;
    }

    public TSort(String SName, String SRemark, Integer SIs) {
        this.SName = SName;
        this.SRemark = SRemark;
        this.SIs = SIs;
    }

    public Integer getSId() {
        return SId;
    }

    public void setSId(Integer SId) {
        this.SId = SId;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSRemark() {
        return SRemark;
    }

    public void setSRemark(String SRemark) {
        this.SRemark = SRemark;
    }

    public Integer getSIs() {
        return SIs;
    }

    public void setSIs(Integer SIs) {
        this.SIs = SIs;
    }

    @Override
    public String toString() {
        return "TSort{" +
                "SId=" + SId +
                ", SName='" + SName + '\'' +
                ", SRemark='" + SRemark + '\'' +
                ", SIs=" + SIs +
                '}';
    }
}
