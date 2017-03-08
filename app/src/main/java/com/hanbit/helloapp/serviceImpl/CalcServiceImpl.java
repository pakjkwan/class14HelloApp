package com.hanbit.helloapp.serviceImpl;

import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;

/**
 * Created by hb2000 on 2017-03-08.
 */

public class CalcServiceImpl implements CalcService{
    @Override
    public int plus(CalcBean bean) {
        return bean.getFirstNum()+bean.getSecondNum();
    }

    @Override
    public int minus(CalcBean bean) {
        return bean.getFirstNum()-bean.getSecondNum();
    }

    @Override
    public int multi(CalcBean bean) {
        return bean.getFirstNum()*bean.getSecondNum();
    }

    @Override
    public int divide(CalcBean bean) {
        return bean.getFirstNum()/bean.getSecondNum();
    }

    @Override
    public int mod(CalcBean bean) {
        return bean.getFirstNum()%bean.getSecondNum();
    }
}
