package com.example.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    List<String> headerStringData;
    HashMap<String,List<String>> childStringData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView=(ExpandableListView)findViewById(R.id.expandableListViewId);

        preppareListData();
    }

    public  void preppareListData(){
        String[] haderString=getResources().getStringArray(R.array.Expandbile_List_View_header_all_names);
        String[] childString=getResources().getStringArray(R.array.Expandbile_List_View_child_all_names);

        headerStringData=new ArrayList<>();
        childStringData=new HashMap<>();

        for(int i=0; i<haderString.length;i++){

            headerStringData.add(haderString[i]);

            List<String> child=new ArrayList<>();
            child.add(childString[i]);

            childStringData.put(headerStringData.get(i),child);
        }
    }
}
