package com.otppractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseException;
//import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
//import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.getstart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SendOtp.class);
                startActivity(intent);
            }
        });
        /*num = findViewById(R.id.number);
        sendotp = findViewById(R.id.otp);




        sendotp.setOnClickListener(new View.OnClickListener() {

            //mAuth = FirebaseAuth.getInstance();
            @Override
            public void onClick(View view) {
                if(!num.getText().toString().trim().isEmpty()){
                    if(num.getText().toString().trim().length() == 11){

                        *//*PhoneAuthOptions options =
                                PhoneAuthOptions.newBuilder(mAuth)
                                        .setPhoneNumber(num)       // Phone number to verify
                                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                                        .setActivity(this)                 // Activity (for callback binding)
                                        .setCallbacks(mCallBack)          // OnVerificationStateChangedCallbacks
                                        .build();
                        PhoneAuthProvider.verifyPhoneNumber(options);*//*
                        *//*PhoneAuthProvider.getInstance().verifyPhoneNumber(num.getText().toString(), 60, TimeUnit.SECONDS, MainActivity.this, new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {
                                Toast.makeText(MainActivity.this,"Please check your internet",Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                super.onCodeSent(s, forceResendingToken);
                                Intent intent = new Intent(getApplicationContext(),VerifyOTP.class);
                                intent.putExtra("mobile",num.getText().toString());
                                startActivity(intent);
                            }
                        });*//*

                    }
                    else{
                        Toast.makeText(MainActivity.this,"Please enter correct number ",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Enter correct number ",Toast.LENGTH_SHORT).show();
                }
            }

        });*/
    }
}