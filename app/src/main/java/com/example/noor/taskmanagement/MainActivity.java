package com.example.noor.taskmanagement;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textHintUserID,textHintPassword;
    EditText editUserId,editPassword;

    private ImageView headerBackgroundIV;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textHintUserID = findViewById(R.id.text_hint_userid_TV);
//        textHintPassword = findViewById(R.id.text_hint_password_TV);
//
//        editUserId = findViewById(R.id.edit_userId_ET);
//        editPassword = findViewById(R.id.edit_password_ET);

        headerBackgroundIV =  findViewById(R.id.headerBackgroundLL);
        Drawable dPage_header= getResources().getDrawable(R.drawable.nitol_niloy_group);
        dPage_header.setAlpha(25);

        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,UserProfile.class);
                startActivity(intent);
                finish();
            }
        });

//        editUserId.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus){
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            textHintUserID.setVisibility(View.VISIBLE);
//                        }
//                    },100);
//                }else{
//                    if (editUserId.getText().length() > 0)
//                        textHintUserID.setVisibility(View.VISIBLE);
//                    else
//                        textHintUserID.setVisibility(View.INVISIBLE);
//                }
//            }
//        });
//
//        editPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus){
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            textHintPassword.setVisibility(View.VISIBLE);
//                        }
//                    },100);
//                }else{
//                    if (editPassword.getText().length() > 0)
//                        textHintPassword.setVisibility(View.VISIBLE);
//                    else
//                        textHintPassword.setVisibility(View.INVISIBLE);
//                }
//            }
//        });
    }
}
