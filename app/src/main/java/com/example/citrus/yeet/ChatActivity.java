package com.example.citrus.yeet;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ListView listView = (ListView) findViewById(R.id.chatroom_view);
        listView.setAdapter(new ListAdapter() {

            @Override
            public boolean areAllItemsEnabled() {
                return false;
            }

            @Override
            public boolean isEnabled(int position) {
                return false;
            }

            @Override
            public void registerDataSetObserver(DataSetObserver observer) {

            }

            @Override
            public void unregisterDataSetObserver(DataSetObserver observer) {

            }

            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public boolean hasStableIds() {
                return false;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
              if(convertView == null) {
                  LayoutInflater layoutInflater = (LayoutInflater)
                          getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
              layoutInflater.inflate(R.layout.);
              }

                TextView chatRoomLabel = (TextView)
                        .findViewByID(R.id.);







              /* View view;
               view = mInflater.inflate(R.layout.my_list_custom_row, parent, false);

                LayoutInflater layoutInflater = (LayoutInflater)
                        getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                TextView cellLabel = (TextView)
                        cellView.findViewById(R.id.chatroom_view);
                ArrayList testList = new ArrayList();
                testList.add("air");
                testList.add("sarcasm");
                testList.add("memes");
                testList.add("yeet");
                testList.add("citrus"); */
            return convertView;
            }



            @Override
            public int getItemViewType(int position) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        });

    }

}
