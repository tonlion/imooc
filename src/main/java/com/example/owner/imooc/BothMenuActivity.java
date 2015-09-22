package com.example.owner.imooc;

import android.app.Activity;
import android.os.Bundle;

import com.example.owner.imooc.menuLeftAndRight.LeftMenu;
import com.example.owner.imooc.menuLeftAndRight.MenuUI;

/**
 * Created by Owner on 2015/9/21.
 */
public class BothMenuActivity extends Activity {

    private MenuUI menuUI;
    private LeftMenu leftMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menuUI = new MenuUI(this);
        setContentView(menuUI);
        leftMenu = new LeftMenu();
        getFragmentManager().beginTransaction().add(MenuUI.LEFT_ID, leftMenu).commit();
    }
}
