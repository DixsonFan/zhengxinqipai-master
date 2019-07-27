package com.hbue.qipai.zhengxin.entity;

/**
 * 实体类对象
 *      JavaBean
 */
public class TProduct {
    private Integer PId;
    private Integer SId;
    private String PName;
    private String PArea;
    private String PMl;
    private Integer PIs;

    public TProduct() {
    }

    public TProduct(Integer PId, Integer SId, String PName, String PArea, String PMl, Integer PIs) {
        this.PId = PId;
        this.SId = SId;
        this.PName = PName;
        this.PArea = PArea;
        this.PMl = PMl;
        this.PIs = PIs;
    }

    public TProduct(Integer SId, String PName, String PArea, String PMl, Integer PIs) {
        this.SId = SId;
        this.PName = PName;
        this.PArea = PArea;
        this.PMl = PMl;
        this.PIs = PIs;
    }

    public Integer getPId() {
        return PId;
    }

    public void setPId(Integer PId) {
        this.PId = PId;
    }

    public Integer getSId() {
        return SId;
    }

    public void setSId(Integer SId) {
        this.SId = SId;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getPArea() {
        return PArea;
    }

    public void setPArea(String PArea) {
        this.PArea = PArea;
    }

    public String getPMl() {
        return PMl;
    }

    public void setPMl(String PMl) {
        this.PMl = PMl;
    }

    public Integer getPIs() {
        return PIs;
    }

    public void setPIs(Integer PIs) {
        this.PIs = PIs;
    }

    @Override
    public String toString() {
        return "TProduct{" +
                "PId=" + PId +
                ", SId=" + SId +
                ", PName='" + PName + '\'' +
                ", PArea='" + PArea + '\'' +
                ", PMl='" + PMl + '\'' +
                ", PIs=" + PIs +
                '}';
    }
}
