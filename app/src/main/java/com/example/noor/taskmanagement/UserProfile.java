package com.example.noor.taskmanagement;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class UserProfile extends AppCompatActivity {

    private static final String TAG = UserProfile.class.getSimpleName();
    private FloatingActionButton addNewTaskBTN;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Button workDoneBtn;

    private ImageView headerBackgroundIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        addNewTaskBTN = findViewById(R.id.btnCreateTask);

        workDoneBtn = findViewById(R.id.workDoneBtn);


        headerBackgroundIV =  findViewById(R.id.headerBackgroundLL);
        Drawable dPage_header= getResources().getDrawable(R.drawable.image);
        dPage_header.setAlpha(25);

//        addNewTaskBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity( new Intent( UserProfile.this,InsertNewTaskActivity.class ) );
//            }
//        });

        addNewTaskBTN.setOnTouchListener(new View.OnTouchListener() {
            float startX;
            float startRawX;
            float distanceX;
            int lastAction;

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        startX = view.getX() - event.getRawX();
                        startRawX = event.getRawX();
                        lastAction = MotionEvent.ACTION_DOWN;
                        break;

                    case MotionEvent.ACTION_MOVE:
                        view.setX(event.getRawX() + startX);
                        view.setY(event.getRawY() + startX);

                        lastAction = MotionEvent.ACTION_MOVE;
                        break;

                    case MotionEvent.ACTION_UP:
                        distanceX = event.getRawX()-startRawX;
                        if (Math.abs(distanceX)< 10){
                            startActivity( new Intent( UserProfile.this,InsertNewTaskActivity.class ) );
                        }
                        break;
                    case MotionEvent.ACTION_BUTTON_PRESS:

                    default:
                        return false;
                }
                return true;
            }

        });
    }



    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TaskListFragment(), "Task List");
        adapter.addFragment(new TaskApprovalFragment(), "Task Approval");
        adapter.addFragment(new DashboardFragment(), "Dashboard");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
