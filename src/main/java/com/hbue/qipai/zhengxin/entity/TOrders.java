package com.hbue.qipai.zhengxin.entity;

public class TOrders {
    private int EId;
    private int CId;


    private int rid;
    private int rtime;
    private int ris;


    public TOrders(){

    }

    public TOrders(int EId, int CId, int rid, int rtime, int ris) {
        this.EId = EId;
        this.CId = CId;
        this.rid = rid;
        this.rtime = rtime;
        this.ris = ris;
    }

    public TOrders(int rid, int rtime, int ris) {
        this.rid = rid;
        this.rtime = rtime;
        this.ris = ris;
    }

    public int getEId() {
        return EId;
    }

    public void setEId(int EId) {
        this.EId = EId;
    }

    public int getCId() {
        return CId;
    }

    public void setCId(int CId) {
        this.CId = CId;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getRtime() {
        return rtime;
    }

    public void setRtime(int rtime) {
        this.rtime = rtime;
    }

    public int getRis() {
        return ris;
    }

    public void setRis(int ris) {
        this.ris = ris;
    }
}
