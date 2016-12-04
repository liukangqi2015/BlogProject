package com.example.radiobuttonandcheckboxdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

/**
 * Created by 刘康祺 on 2016/12/5 0005.
 */

public class CheckBoxActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private CheckBox apple_cb, samsung_cb, huawei_cb;
    private Button btn;
    private String content="";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        apple_cb = (CheckBox) findViewById(R.id.apple_cb);
        samsung_cb = (CheckBox) findViewById(R.id.samsung_cb);
        huawei_cb = (CheckBox) findViewById(R.id.huawei_cb);
        btn = (Button) findViewById(R.id.btn);
        apple_cb.setOnCheckedChangeListener(this);
        samsung_cb.setOnCheckedChangeListener(this);
        huawei_cb.setOnCheckedChangeListener(this);
        btn.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked){
            content=content+buttonView.getText().toString()+" ";
        }else {
            content=content.replace(buttonView.getText().toString(),"");
        }

    }

    @Override
    public void onClick(View v) {
        if (!TextUtils.isEmpty(content)){
            Toast.makeText(this,content,Toast.LENGTH_SHORT).show();
        }

    }
}
