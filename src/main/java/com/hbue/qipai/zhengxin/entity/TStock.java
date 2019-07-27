package com.hbue.qipai.zhengxin.entity;

public class TStock {

    private int PId;


    private int sum;
    private int kid;

    public  TStock(){}


    public TStock(int PId, int sum, int kid) {
        this.PId = PId;
        this.sum = sum;
        this.kid = kid;
    }

    public TStock(int sum, int kid) {
        this.sum = sum;
        this.kid = kid;
    }

    public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }
}
