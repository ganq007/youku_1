package com.example.a2323045399.youku_1.tool;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;

public class Tool {

    //设置隐藏动画
    public static  void setHide(View view){
        setAnimation(0,-180,view);
    }

    //设置显示动画
    public static  void setShow(View view){
        setAnimation(-180,0,view);
    }

    //设置动画效果
    public static  void setAnimation(float fromdegress,float todegres,View view){
        RotateAnimation rotateAnimation = new RotateAnimation(fromdegress,todegres,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,1.0f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setFillAfter(true);
        view.setAnimation(rotateAnimation);
    }




}
