package jinyifan.com.coolweather;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import cn.edu.jssvc.cml.coolweather.R;

public class MainActivity extends Activity {
    @SuppressLint("InlinedApi")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
////            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
////            }
        setContentView(R.layout.activity_main);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);


        if (prefs.getString("weather",null)!=null){
            Intent intent=new Intent(this, cn.edu.jssvc.cml.coolweather.WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }


}
