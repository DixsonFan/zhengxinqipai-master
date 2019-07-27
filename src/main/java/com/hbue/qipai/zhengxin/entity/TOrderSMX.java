package com.hbue.qipai.zhengxin.entity;

public class TOrderSMX {
    private int RId;
    private int PId;
    private int YId;


    private int xid;
    private int xcount;
    private int xprice;

    public TOrderSMX(){

    }

    public TOrderSMX(int RId, int PId, int YId, int xid, int xcount, int xprice) {
        this.RId = RId;
        this.PId = PId;
        this.YId = YId;
        this.xid = xid;
        this.xcount = xcount;
        this.xprice = xprice;
    }

    public TOrderSMX(int xid, int xcount, int xprice) {
        this.xid = xid;
        this.xcount = xcount;
        this.xprice = xprice;
    }


    public int getRId() {
        return RId;
    }

    public void setRId(int RId) {
        this.RId = RId;
    }

    public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
    }

    public int getYId() {
        return YId;
    }

    public void setYId(int YId) {
        this.YId = YId;
    }

    public int getXid() {
        return xid;
    }

    public void setXid(int xid) {
        this.xid = xid;
    }

    public int getXcount() {
        return xcount;
    }

    public void setXcount(int xcount) {
        this.xcount = xcount;
    }

    public int getXprice() {
        return xprice;
    }

    public void setXprice(int xprice) {
        this.xprice = xprice;
    }
}
