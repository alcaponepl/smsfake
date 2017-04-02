package com.example.piotr.smstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendText(View view) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(Constants.PHONE_NUMBER, null, "Test message", null, null);
        Toast.makeText(this, "Test SMS sending...", Toast.LENGTH_SHORT).show();
    }

    public void startSmsService(View view) {
        Intent intent = new Intent(this, SmsService.class);
        startService(intent);
    }

    public void stopSmsService(View view) {
        Intent intent = new Intent(this, SmsService.class);
        stopService(intent);
    }
}
