package com.example.ewgenius.testandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.analytics.Analytics;
import com.microsoft.azure.mobile.crashes.Crashes;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileCenter.start(getApplication(), "ac7f7411-57d1-4536-ab64-2af0485746ca",
                Analytics.class, Crashes.class);
        Map<String, String> properties = new HashMap<>();
        properties.put("Test", "Test");
        Analytics.trackEvent("Test event");
    }
}
