package com.example.perso.probbotonnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mMainFrame = (FrameLayout)findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView)findViewById(R.id.vd_btn);

        mMainNav.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public onNavigationItemReselected(@NonNull MenuItem item) {
               switch (item.getItemId()) {
                   case R.id.nv_home:
                       mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                       case R.id.nv_notification :
                           mMainNav.setItemBackgroundResource(R.color.colorAccent);
                           case R.id.nv_user :
                               mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);

               }
            }



        });

    }
}
