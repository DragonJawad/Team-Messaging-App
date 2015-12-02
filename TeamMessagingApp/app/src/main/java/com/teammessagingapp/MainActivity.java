package com.teammessagingapp;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec1=tabHost.newTabSpec("Tab 1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Contacts", ContextCompat.getDrawable(this, R.drawable.contacts_l));

        TabHost.TabSpec spec2=tabHost.newTabSpec("Tab 2");
        spec2.setIndicator("Chats", ContextCompat.getDrawable(this, R.drawable.messages_l));
        spec2.setContent(R.id.tab2);

        TabHost.TabSpec spec3=tabHost.newTabSpec("Tab 3");
        spec3.setIndicator("Posts", ContextCompat.getDrawable(this, R.drawable.forum_l));
        spec3.setContent(R.id.tab3);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);
    }

}