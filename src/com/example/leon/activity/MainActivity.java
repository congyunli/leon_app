package com.example.leon.activity;

import com.example.leon.R;
import com.example.leon.R.id;
import com.example.leon.R.layout;
import com.example.leon.R.menu;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //´ó¶¹ÆÉ Ìø×ª
        ImageButton btn_dadouyou = (ImageButton) findViewById(R.id.btn_dadouyou);  
        btn_dadouyou.setOnClickListener(new ImageButton.OnClickListener(){
        	@Override
            public void onClick(View v) {    
            	Log.v("yyy" , "click" );
            	Intent intent = new Intent(MainActivity.this, DadoupoActivity.class);
            	startActivity(intent);
            }    
  
        });  
        
        
        
    }

    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
