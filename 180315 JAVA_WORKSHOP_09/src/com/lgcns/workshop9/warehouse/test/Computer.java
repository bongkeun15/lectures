package com.lgcns.workshop9.warehouse.test;

public class Computer extends Product {

    private int count;
    private boolean monitorYn;

    public Computer() {

    }

    public Computer( int price, String model, int count, boolean moniter ) {
        super(price, model);
        this.count = count;
        this.monitorYn = moniter;
    }

    public int getCount() {
        return count;
    }

    public void setCount( int count ) {
        this.count = count;
    }

    public boolean isMonitorYn() {
        return monitorYn;
    }

    public void setMonitorYn( boolean monitorYn ) {
        this.monitorYn = monitorYn;
    }

    public String toString() {
        if ( monitorYn == true ) {
            return "모델명 :" + getModel() + "\t가격 : " + getPrice() + "\t재고량 : " + getCount() + "개" + "\t 재고 총가치 : "
                    + ( getCount() * getPrice() ) + "원\t" + "모니터 포함";
        } else {
            return "모델명 :" + getModel() + "\t가격 : " + getPrice() + "\t재고량 : " + getCount() + "개" + "\t 재고 총가치 : "
                    + ( getCount() * getPrice() ) + "원\t" + "모니터 미포함";
        }
    }

}
