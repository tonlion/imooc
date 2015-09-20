package com.example.owner.imooc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.owner.imooc.qqSlidingMenu.SlidingMenu;

/**
 * Created by Owner on 2015/9/19.
 */
public class QQSlidingMenuActivity extends Activity {

    private SlidingMenu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.qq_main_layout);
        menu = (SlidingMenu) findViewById(R.id.id_menu);
        findViewById(R.id.toggle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.toggle();
            }
        });
    }
}
