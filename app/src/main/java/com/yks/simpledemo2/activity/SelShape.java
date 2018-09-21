package com.yks.simpledemo2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;

import com.noober.background.BackgroundLibrary;
import com.yks.simpledemo2.R;
import com.yks.simpledemo2.widget.MyActionBar;

/**
 * 描述：shape等需要自定义的控件直接在布局页面直接实现炫酷的效果
 * 作者：zzh
 * time:2018/09/21
 * 参考：https://github.com/JavaNoober/BackgroundLibrary    https://juejin.im/post/5b9682ebe51d450e543e3495
 */

public class SelShape extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        BackgroundLibrary.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sel_shape);

        initView();
    }

    private void initView() {
        //// TODO: 2016/12/21 actionbar
        LinearLayout headerLayout = findViewById(R.id.headerLayout);
        Bundle bundle = new Bundle();
        bundle.putBoolean("back", true);
        bundle.putString("leftText", null);
        bundle.putString("title", "Shape自定义");
        bundle.putBoolean("rightImage", false);
        bundle.putString("rightText", null);
        MyActionBar.actionbar(this,headerLayout,bundle);
    }
}
