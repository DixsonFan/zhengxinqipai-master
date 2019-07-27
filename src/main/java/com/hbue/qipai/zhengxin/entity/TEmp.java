package com.hbue.qipai.zhengxin.entity;

/**
 * 实体类对象
 *      JavaBean
 */
public class TEmp {
    private Integer EId;
    private Integer PId;
    private String ELoginname;
    private String EPsw;
    private String EImg;
    private String ESex;
    private Integer EFlag;
    private Integer EAdmin;
    private String ERemark;
    private String ETruename;
    private Integer EIs;

    public TEmp() {
    }

    public TEmp(Integer EId, Integer PId, String ELoginname, String EPsw, String EImg, String ESex, Integer EFlag, Integer EAdmin, String ERemark, String ETruename, Integer EIs) {
        this.EId = EId;
        this.PId = PId;
        this.ELoginname = ELoginname;
        this.EPsw = EPsw;
        this.EImg = EImg;
        this.ESex = ESex;
        this.EFlag = EFlag;
        this.EAdmin = EAdmin;
        this.ERemark = ERemark;
        this.ETruename = ETruename;
        this.EIs = EIs;
    }

    public TEmp(Integer PId, String ELoginname, String EPsw, String EImg, String ESex, Integer EFlag, Integer EAdmin, String ERemark, String ETruename, Integer EIs) {
        this.PId = PId;
        this.ELoginname = ELoginname;
        this.EPsw = EPsw;
        this.EImg = EImg;
        this.ESex = ESex;
        this.EFlag = EFlag;
        this.EAdmin = EAdmin;
        this.ERemark = ERemark;
        this.ETruename = ETruename;
        this.EIs = EIs;
    }

    public Integer getEId() {
        return EId;
    }

    public void setEId(Integer EId) {
        this.EId = EId;
    }

    public Integer getPId() {
        return PId;
    }

    public void setPId(Integer PId) {
        this.PId = PId;
    }

    public String getELoginname() {
        return ELoginname;
    }

    public void setELoginname(String ELoginname) {
        this.ELoginname = ELoginname;
    }

    public String getEPsw() {
        return EPsw;
    }

    public void setEPsw(String EPsw) {
        this.EPsw = EPsw;
    }

    public String getEImg() {
        return EImg;
    }

    public void setEImg(String EImg) {
        this.EImg = EImg;
    }

    public String getESex() {
        return ESex;
    }

    public void setESex(String ESex) {
        this.ESex = ESex;
    }

    public Integer getEFlag() {
        return EFlag;
    }

    public void setEFlag(Integer EFlag) {
        this.EFlag = EFlag;
    }

    public Integer getEAdmin() {
        return EAdmin;
    }

    public void setEAdmin(Integer EAdmin) {
        this.EAdmin = EAdmin;
    }

    public String getERemark() {
        return ERemark;
    }

    public void setERemark(String ERemark) {
        this.ERemark = ERemark;
    }

    public String getETruename() {
        return ETruename;
    }

    public void setETruename(String ETruename) {
        this.ETruename = ETruename;
    }

    public Integer getEIs() {
        return EIs;
    }

    public void setEIs(Integer EIs) {
        this.EIs = EIs;
    }

    @Override
    public String toString() {
        return "TEmp{" +
                "EId=" + EId +
                ", PId=" + PId +
                ", ELoginname='" + ELoginname + '\'' +
                ", EPsw='" + EPsw + '\'' +
                ", EImg='" + EImg + '\'' +
                ", ESex='" + ESex + '\'' +
                ", EFlag=" + EFlag +
                ", EAdmin=" + EAdmin +
                ", ERemark='" + ERemark + '\'' +
                ", ETruename='" + ETruename + '\'' +
                ", EIs=" + EIs +
                '}';
    }
}
