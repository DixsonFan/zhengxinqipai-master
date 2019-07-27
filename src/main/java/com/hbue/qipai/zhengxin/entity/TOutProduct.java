package com.hbue.qipai.zhengxin.entity;

public class TOutProduct {

    private int PId;
    private int EId;
    private int OEId;

    private int oid;
    private int ointeger;
    private String otime;
    private String oremark;


    public TOutProduct(){

    }

    public TOutProduct(int PId, int EId, int OEId, int oid, int ointeger, String otime, String oremark) {
        this.PId = PId;
        this.EId = EId;
        this.OEId = OEId;
        this.oid = oid;
        this.ointeger = ointeger;
        this.otime = otime;
        this.oremark = oremark;
    }

    public TOutProduct(int oid, int ointeger, String otime, String oremark) {
        this.oid = oid;
        this.ointeger = ointeger;
        this.otime = otime;
        this.oremark = oremark;
    }

    public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
    }

    public int getEId() {
        return EId;
    }

    public void setEId(int EId) {
        this.EId = EId;
    }

    public int getOEId() {
        return OEId;
    }

    public void setOEId(int OEId) {
        this.OEId = OEId;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getOinteger() {
        return ointeger;
    }

    public void setOinteger(int ointeger) {
        this.ointeger = ointeger;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public String getOremark() {
        return oremark;
    }

    public void setOremark(String oremark) {
        this.oremark = oremark;
    }
}
