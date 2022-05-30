package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> studentList = new ArrayList<>();
    ListView listView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList.add("Saad");
        studentList.add("Zahid");
        studentList.add("Saeed");
        studentList.add("Alina");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, studentList);

        listView = findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);

        editText = findViewById(R.id.editTextTextPersonName2);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(v -> {
            studentList.add(editText.getText().toString());
            arrayAdapter.notifyDataSetChanged();
        });

    }
}