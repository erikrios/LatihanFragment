package com.erikriosetiawan.latihanfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    Button buttonConvert, buttonAbout, buttonLogOut;
    EditText editTextUsername, editTextPassword;
    Button buttonSubmit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.edit_text_username);
        editTextPassword = findViewById(R.id.edit_text_password);
        buttonSubmit = findViewById(R.id.button_submit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(editTextUsername.getText().toString())) {
                    editTextUsername.setError("Isikan username");
                    isEmptyFields = true;
                }

                if (TextUtils.isEmpty(editTextPassword.getText().toString())) {
                    editTextPassword.setError("Isikan password");
                    isEmptyFields = true;
                }

                if (!isEmptyFields) {
                    if (editTextUsername.getText().toString().equals("admin") && editTextPassword.getText().toString().equals("admin")) {
                        Intent intentMenu = new Intent(MainActivity.this, MenuActivity.class);
                        startActivity(intentMenu);
                    }
                }
            }
        });

//        buttonConvert = findViewById(R.id.button_convert);
//        buttonAbout = findViewById(R.id.button_about);
//        buttonLogOut = findViewById(R.id.button_log_out);

//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        WindowManager windowManager = getWindowManager();
//        Point size = new Point();
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
//
//            if (size.x > size.y) {
//                MenuFragment menuFragment = new MenuFragment();
//                buttonConvert.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
//                buttonAbout.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
//                buttonLogOut.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
//                fragmentTransaction.replace(android.R.id.content, menuFragment);
//            } else {
//                MenuFragment menuFragment = new MenuFragment();
//                fragmentTransaction.replace(android.R.id.content, menuFragment);
//            }
//
//        } else {
//            Display display = windowManager.getDefaultDisplay();
//            if (display.getRotation() == Surface.ROTATION_90 || display.getRotation() == Surface.ROTATION_270) {
//                MenuFragment menuFragment = new MenuFragment();
//                buttonConvert.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
//                buttonAbout.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
//                buttonLogOut.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
//                fragmentTransaction.replace(android.R.id.content, menuFragment);
//            } else {
//                MenuFragment menuFragment = new MenuFragment();
//                fragmentTransaction.replace(android.R.id.content, menuFragment);
//            }
//        }

//        fragmentTransaction.commit();
    }
}
