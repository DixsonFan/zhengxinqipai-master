package com.hbue.qipai.zhengxin.entity;

public class TClient {

    private int EId;


    private int cid;
    private String cname;
    private String ctel;
    private String caddress;
    private int cis;

    public TClient(){

    }

    public TClient(int EId, int cid, String cname, String ctel, String caddress, int cis) {
        this.EId = EId;
        this.cid = cid;
        this.cname = cname;
        this.ctel = ctel;
        this.caddress = caddress;
        this.cis = cis;
    }

    public TClient(int cid, String cname, String ctel, String caddress, int cis) {
        this.cid = cid;
        this.cname = cname;
        this.ctel = ctel;
        this.caddress = caddress;
        this.cis = cis;
    }


    public int getEId() {
        return EId;
    }

    public void setEId(int EId) {
        this.EId = EId;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtel() {
        return ctel;
    }

    public void setCtel(String ctel) {
        this.ctel = ctel;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public int getCis() {
        return cis;
    }

    public void setCis(int cis) {
        this.cis = cis;
    }



    @Override
    public String toString() {
        return "TPart{" +
                "EId=" + EId +
                ", cname='" + cname + '\'' +
                ", ctel='" + caddress + '\'' +
                ", cis=" + cis +
                '}';
    }
}
