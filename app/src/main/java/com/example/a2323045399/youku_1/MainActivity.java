package com.example.a2323045399.youku_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.a2323045399.youku_1.tool.Tool;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout mLeve3;
    private  RelativeLayout mLeve2;
    private RelativeLayout mLeve1;

    boolean showLeve3 =true;
    boolean showLeve2 =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mLeve2 = findViewById(R.id.leve2);
        mLeve1 = findViewById(R.id.leve1);
        mLeve3 = findViewById(R.id.leve3);

        mLeve2.setOnClickListener(this);
        mLeve1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.leve1:
                //点击菜单1 ， 菜单2 显示--隐藏，隐藏--显示
                if (showLeve3){

                    showLeve3=false;
                    showLeve2=false;
                    Tool.setHide(mLeve3);
                    Tool.setHide(mLeve2);
                    Log.e("TGW", "onClick: -----------home------------隐藏23");

                }else if (showLeve2){
                    Log.e("TGW", "onClick: ---------home--------------隐藏2");
                    showLeve2=false;
                    Tool.setHide(mLeve2);

                }else{
                    showLeve2=true;
                    Tool.setShow(mLeve2);
                    Log.e("TGW", "onClick: ---------home--------------显示2");
                }
                break;
            case R.id.leve2:
                //点击菜单2 ， 菜单3 显示--隐藏，隐藏--显示
                if (showLeve3){
//                    showLeve3 = false;
                    Tool.setHide(mLeve3);
                    Log.e("TGW", "onClick: -----------------------隐藏3");
                }else{
//                    showLeve3 =true;
                    Tool.setShow(mLeve3);
                    Log.e("TGW", "onClick: -----------------------显示");
                }
                showLeve3 = !showLeve3;
                break;


        }
    }
}
