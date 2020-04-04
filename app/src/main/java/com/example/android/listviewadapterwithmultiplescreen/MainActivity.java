package com.example.android.listviewadapterwithmultiplescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);

        final String[] className = getResources().getStringArray(R.array.class_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.sample, R.id.textView, className);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, classInfo.class);
                intent.putExtra("Aidul",className[position]);
                startActivity(intent);
            }
        });
    }
}
