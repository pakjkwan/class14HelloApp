package com.hanbit.helloapp.domain;

/**
 * Created by hb2000 on 2017-03-08.
 */

public class CalcBean {
    protected int firstNum,secondNum;

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    @Override
    public String toString() {
        return "CalcBean{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                '}';
    }
}
