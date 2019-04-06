package com.example.json2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.json2.Modal.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lstStudentData;
    private ArrayList<Student> studentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstStudentData = findViewById(R.id.lst1);
init();
        ListAdapter mstudentAdapter = new com.example.json2.Adapter.ListAdapter(this,studentArrayList);

        lstStudentData.setAdapter(mstudentAdapter);

    }


    private  void  init()
    {
        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("1","jagmeet", "female"));
        studentArrayList.add(new Student("2","meet", "female"));
        studentArrayList.add(new Student("3","prabh", "female"));



    }
}
