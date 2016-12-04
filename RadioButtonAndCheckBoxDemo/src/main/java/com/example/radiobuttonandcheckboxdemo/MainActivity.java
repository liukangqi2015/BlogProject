package com.example.radiobuttonandcheckboxdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button btn,btn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    /**
     * 初始化控件
     */
    private void initView() {
        radioGroup= (RadioGroup) findViewById(R.id.rg);
        btn= (Button) findViewById(R.id.btn);
        btn02= (Button) findViewById(R.id.btn02);
    }

    /**
     * 设置监听器
     */
    private void setListener() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //通过checkedId得到被选中的RadioButton
                RadioButton checkedRadioButton= (RadioButton) group.findViewById(checkedId);
                Toast.makeText(MainActivity.this,"你选择的性别是"+checkedRadioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TabBarActivity.class));
            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CheckBoxActivity.class));
            }
        });
    }

}
