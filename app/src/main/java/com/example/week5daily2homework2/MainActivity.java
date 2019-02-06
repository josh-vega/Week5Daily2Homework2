package com.example.week5daily2homework2;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get info from CP
        Uri uri = Uri.parse("content://com.example.week5daily2homework.model.local");
        Cursor cursor = this.getContentResolver().query(uri,null,null,null,null);
        ContentValues values = new ContentValues();
        getApplicationContext().getContentResolver().insert(uri,values);
        //Log.d(TAG, "onCreate: " + cursor);
    }
}
