package com.hanbit.helloapp.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.helloapp.R;
import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;
import com.hanbit.helloapp.serviceImpl.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etFirstNum,etSecondNum;
    Button btPlus,btMinus,btMilti,btDivid,btMod,btEqual;
    TextView tvResult;
    int result;
    CalcService service;
    CalcBean bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service = new CalcServiceImpl();
        bean = new CalcBean();
        etFirstNum= (EditText) findViewById(R.id.etFirstNum);
        etSecondNum= (EditText) findViewById(R.id.etSecondNum);
        btPlus= (Button) findViewById(R.id.btPlus);
        btMinus= (Button) findViewById(R.id.btMinus);
        btMilti= (Button) findViewById(R.id.btMilti);
        btDivid= (Button) findViewById(R.id.btDivid);
        btMod= (Button) findViewById(R.id.btMod);
        btEqual= (Button) findViewById(R.id.btEqual);
        tvResult= (TextView) findViewById(R.id.tvResult);
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMilti.setOnClickListener(this);
        btDivid.setOnClickListener(this);
        btMod.setOnClickListener(this);
        btEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        bean.setFirstNum(Integer.parseInt(etFirstNum.getText().toString()));
        bean.setSecondNum(Integer.parseInt(etSecondNum.getText().toString()));
        int firstNum=Integer.parseInt(etFirstNum.getText().toString());
        int secondNum=Integer.parseInt(etSecondNum.getText().toString());
        Log.d("firstNum=",String.valueOf(firstNum));
        Log.d("secondNum=",String.valueOf(secondNum));
        switch (v.getId()){
            case R.id.btPlus:
                result=service.plus(bean);
                break;
            case R.id.btMinus:
                result=service.minus(bean);
                break;
            case R.id.btMilti:
                result=service.multi(bean);
                break;
            case R.id.btDivid:
                result=service.divide(bean);
                break;
            case R.id.btMod:
                result=service.mod(bean);
                break;
            case R.id.btEqual:
                tvResult.setText("RESULT :"+result);
                break;
        }
    }
}
