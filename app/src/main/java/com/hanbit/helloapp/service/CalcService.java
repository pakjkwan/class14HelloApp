package com.hanbit.helloapp.service;

import com.hanbit.helloapp.domain.CalcBean;

/**
 * Created by hb2000 on 2017-03-08.
 */

public interface CalcService {
    public int plus(CalcBean bean);
    public int minus(CalcBean bean);
    public int multi(CalcBean bean);
    public int divide(CalcBean bean);
    public int mod(CalcBean bean);
}
