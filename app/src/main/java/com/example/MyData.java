package com.example;

import android.content.Context;
import android.content.SharedPreferences;

public class MyData {
    private int number;
    private Context context;
    public MyData(Context context){
        this.context=context;
    }
    public void save(){
        SharedPreferences shp=context.getSharedPreferences("mydata",Context.MODE_PRIVATE);
    }
}
