package com.example.android.listviewadapterwithmultiplescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class classInfo extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_info);

        listView = findViewById(R.id.listView_names);

        final String[] class1 = getResources().getStringArray(R.array.name);
        final String[] class2 = getResources().getStringArray(R.array.name);

        Intent intent = getIntent();
        String cla = intent.getStringExtra("Aidul");
        if(cla.equals("Class 1"))
        {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.sample, R.id.textView, class1);
            listView.setAdapter(adapter);
        }
        else if(cla.equals("Class 2"))
        {

        }

    }
}
