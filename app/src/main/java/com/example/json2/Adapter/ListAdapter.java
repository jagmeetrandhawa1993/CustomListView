package com.example.json2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.json2.Modal.Student;
import com.example.json2.R;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Student> studentArrayList;

    public  int getCount(){

        return  studentArrayList.size();

    }

    public ListAdapter(Context context, ArrayList<Student> studentArrayList) {
        this.context = context;
        this.studentArrayList = studentArrayList;
    }

    @Override
    public Object getItem(int position) {
        return studentArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.customlist,parent, false);
        }

        TextView txtSid = convertView.findViewById(R.id.rid);
        TextView txtSnm = convertView.findViewById(R.id.rname);
        TextView txtgender = convertView.findViewById(R.id.rgender);

        Student mEmployee = (Student) getItem(position);

        txtSid.setText(String.valueOf(mEmployee.getSid()));
        txtSnm.setText(mEmployee.getSname());
        txtgender.setText(mEmployee.getGender());




        return convertView;







    }


}
