package com.example.noor.taskmanagement;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class InsertNewTaskActivity extends AppCompatActivity {

    private Toolbar toolbar;

    TextView taskTitleTV, taskScoreTV, estimatedHourTV,completionDateTV;
    EditText taskTitleET, taskScoreET, estimatedHourET, completionDateET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_new_task);


        toolbar = findViewById( R.id.taskEntryToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


//        taskTitleTV = findViewById(R.id.taskTitleTV);
//        taskTitleET = findViewById(R.id.taskTitleET);
//
//        taskScoreTV = findViewById(R.id.taskScoreTV);
//        taskScoreET = findViewById(R.id.taskScoreET);

//        estimatedHourTV = findViewById(R.id.estimatedHourTV);
//        estimatedHourET = findViewById(R.id.estimatedHourET);
//
//        completionDateTV = findViewById(R.id.completionDateTV);
//        completionDateET = findViewById(R.id.completionDateET);



//       taskTitleET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//           @Override
//           public void onFocusChange(View v, boolean hasFocus) {
//               if (hasFocus){
//                   new Handler().postDelayed(new Runnable() {
//                       @Override
//                       public void run() {
//                           taskTitleTV.setVisibility(View.VISIBLE);
//                       }
//                   },100);
//               }else{
//                   if (taskTitleET.getText().length() > 0)
//                       taskTitleTV.setVisibility(View.VISIBLE);
//                   else
//                       taskTitleTV.setVisibility(View.INVISIBLE);
//               }
//           }
//       });

//       taskScoreET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//           @Override
//           public void onFocusChange(View v, boolean hasFocus) {
//               if (hasFocus){
//                   new Handler().postDelayed(new Runnable() {
//                       @Override
//                       public void run() {
//                           taskScoreTV.setVisibility(View.VISIBLE);
//                       }
//                   },100);
//               }else{
//                   if (taskScoreET.getText().length() > 0)
//                       taskScoreTV.setVisibility(View.VISIBLE);
//                   else
//                       taskScoreTV.setVisibility(View.INVISIBLE);
//               }
//           }
//       });


//        estimatedHourET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus){
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            estimatedHourTV.setVisibility(View.VISIBLE);
//                        }
//                    },100);
//                }else{
//                    if (estimatedHourET.getText().length() > 0)
//                        estimatedHourTV.setVisibility(View.VISIBLE);
//                    else
//                        estimatedHourET.setVisibility(View.INVISIBLE);
//                }
//            }
//        });
//
//
//        completionDateET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus){
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            completionDateTV.setVisibility(View.VISIBLE);
//                        }
//                    },100);
//                }else{
//                    if (completionDateET.getText().length() > 0)
//                        completionDateTV.setVisibility(View.VISIBLE);
//                    else
//                        completionDateET.setVisibility(View.INVISIBLE);
//                }
//            }
//        });
//




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
